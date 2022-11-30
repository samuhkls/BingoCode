
package Controller;
import Model.Usuario;
import View.Login_GUI;
import View.Splash;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormCadastro {
    private Login_GUI view;

    public FormCadastro(Login_GUI view) {
        this.view = view;
    }

    public void salvaUsuario(){
        
        
        
        String usuario = view.getTxt().getText();
       String pass = view.getSenha().getText();
        
        Usuario usuarioXand = new Usuario(usuario, pass);
       
        try {
            Connection conexao = new Conexao().getConnection();
            usuario_DAO usuarioDao = new usuario_DAO(conexao);
            usuarioDao.insert(usuarioXand);
            Splash carre = new Splash();
            carre.setVisible(true);
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Login_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
