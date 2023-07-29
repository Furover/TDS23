import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DbBIBLIOTECA",
					"sa","St4tyon@rY2");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
}

