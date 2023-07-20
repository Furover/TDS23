package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:sqlserver:localhost:1433;databaseName=loja;user=sa;password=TecInfo"
					);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
	}
}
