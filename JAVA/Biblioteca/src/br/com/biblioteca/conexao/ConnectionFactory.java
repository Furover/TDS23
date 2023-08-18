package br.com.biblioteca.conexao;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author 3113.343
 */
public class ConnectionFactory {
    public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=TecInfo;");
            
        }catch(SQLException e){
           System.out.println(e.getMessage());
        }
        return con;
        
    }
    
}