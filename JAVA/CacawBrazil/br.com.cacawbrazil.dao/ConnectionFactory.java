import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public Connection getConnection(){
        Connection connection = null;
        try {
        	//Me conectando com o Server do Joao :)
        	Class.forName("org.sqlserver.Driver");
            connection = DriverManager.getConnection("jdbc:sqlserver://192.168.249.227:1433;databaseName=Cliente;user=sa;password=TecInfo;" +  "encrypt=true;trustServerCertificate=true");
            
        }catch(Exception e){
           e.printStackTrace();
           System.err.println("SQLException: " + e.getMessage());
        }
        return connection;
        
    }
    

}
