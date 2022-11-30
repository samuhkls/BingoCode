
package Controller;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Conexao {
    public Connection getConnection() throws SQLException{
       
       Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/bingo", "root", "admin");
       return conexao;
    }
    
}
