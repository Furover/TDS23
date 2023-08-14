
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConDao {
	public Connection getConnection() {
		Connection con = null;
		 String jdbcUrl = "jdbc:mysql://localhost:32769/FomyTestes";
	     String username = "root";
	     String password = "St4tyon@rY2";

	        try {
	            con = DriverManager.getConnection(jdbcUrl, username, password);
	            System.out.println("Connected to the database!");
	            
	            // Now you can perform database operations using this connection
	            
	            con.close(); // Don't forget to close the connection when done
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		return con;
	}

}

