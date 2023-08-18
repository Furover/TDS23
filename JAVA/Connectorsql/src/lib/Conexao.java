package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:mysql://localhost:32769/FomyTestes;user=root;password=St4tyon@rY2";

        try {
            // Registra o driver do SQL Server
            
            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(connectionUrl);

            // Use a conexão aqui (coloque o código que precisa executar com o banco de dados)

            // Fecha a conexão
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
