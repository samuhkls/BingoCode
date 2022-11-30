/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;
import View.LoginView;
import View.Splash;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class LoginController {
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        String usuario = view.getUsu().getText();
        String pass = view.getArio().getText();
        
        Usuario usuarioAutenticar = new Usuario(usuario, pass);
        
        Connection conexao = new Conexao().getConnection();
        usuario_DAO usuarioDao = new usuario_DAO(conexao);
        
        boolean existe = usuarioDao.existePorUsuarioESenha(usuarioAutenticar);
        
        if(existe){
            Splash carre = new Splash();
        carre.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Login não cadastrado na base de dados");
        }
        
    }
    
    
}
