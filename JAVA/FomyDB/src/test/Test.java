package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://;serverName=localhost;port=1433";

        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();) {

            // Código para executar consultas e interagir com o banco de dados aqui

            System.out.println("Conexão bem-sucedida!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


