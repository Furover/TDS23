package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:sqlserver://serverName=localhost;port=1433;databaseName=loja;user=sa;password=St4tion@rY2"
					);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
	}
}
