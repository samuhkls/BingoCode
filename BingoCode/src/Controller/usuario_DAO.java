package Controller;
import Model.Usuario;
import View.Login_GUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class usuario_DAO {
    private final Connection connection;
    
    public usuario_DAO(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{

           
            String sql = "INSERT INTO usuario(usuario, senha) VALUES ('"+usuario.getUsuario() +"','"+usuario.getSenha()+"');";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.execute();
            
            
            
       
    }

    public boolean existePorUsuarioESenha(Usuario usuario) throws SQLException {
        String sql = "select * from usuario where usuario = '"+usuario.getUsuario()+"' and senha = '"+usuario.getSenha()+"';";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
    
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet.next();
    }

    
    
}
