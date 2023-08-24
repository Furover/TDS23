import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectaBanco {
	
	public static void main(String[] args) {
		        Connection con = null;
		        Statement stmt;
		        String query = "SELECT * FROM LIVRO";
		        try {
		        	//Me conectando com o Server do Joao :)
		        	con = DriverManager.getConnection("jdbc:sqlserver://192.168.249.227:1433;databaseName=db_Biblioteca;user=sa;password=TecInfo;" +  "encrypt=true;trustServerCertificate=true");
		        	stmt = con.createStatement();
		        	ResultSet rs = stmt.executeQuery(query);
		        	
		        	System.out.println("Lista de linhas da tabela do Banco: ");
		        	
		        	while(rs.next()) {
		        		
		        		String s = rs.getString("Titulo");
		        		
		        		System.out.println(s + "    ");
		        	}
		        	
		        	stmt.close();
		        	con.close();
		        } catch(SQLException ex) {
		        	System.err.println("SQLException: " + ex.getMessage());
		        }
		        
		    }
		    
		
	

}
