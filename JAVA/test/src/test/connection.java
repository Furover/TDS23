package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:32769/FomyTestes";
        String username = "root";
        String password = "St4tyon@rY2";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the database!");
            
            // Now you can perform database operations using this connection
            
            connection.close(); // Don't forget to close the connection when done
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
