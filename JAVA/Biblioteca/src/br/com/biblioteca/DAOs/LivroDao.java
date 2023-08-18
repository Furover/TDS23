package br.com.biblioteca.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.biblioteca.conexao.ConnectionFactory;
import br.com.biblioteca.itens.Livro;

public class LivroDao {
private Connection con;

public LivroDao() {
ConnectionFactory cf = new ConnectionFactory();
con = cf.getConnection();
}

public void inserirLivro(Livro livro) {
String scriptSql = "INSERT INTO LIVRO (titulo,autor,editora,numeroPa)"
+ "VALUES (?,?,?,?)";
try {

PreparedStatement stmt = con.prepareStatement(scriptSql);
stmt.setString(1, livro.getTitulo());
stmt.setString(2, livro.getAutor());
stmt.setString(3, livro.getEditora());
stmt.setInt(4, livro.getNumeroPaginas());

stmt.execute();
stmt.close();

System.out.println("\nLivro cadastrado Com Sucesso !\n");
} catch (SQLException e) {
System.out.println(e.getMessage());
}
}

public void deletarLivro(Livro livro) {
String scriptSql = "DELETE FROM LIVRO WHERE codLivro = ?";

try {

PreparedStatement stmt = con.prepareStatement(scriptSql);
stmt.setInt(1, livro.getCodigo());
stmt.execute();
stmt.close();

System.out.println("\nLivro excluido Com Sucesso !\n");
} catch (SQLException e) {
System.out.println(e.getMessage());
}
}

public void atualizarLivro(Livro livro) {
String scriptSql = "UPDATE LIVRO SET titulo = ?,autor = ?,editora = ?,numeroPa = ? WHERE codLivro = ?";
try {

PreparedStatement stmt = con.prepareStatement(scriptSql);
stmt.setString(1, livro.getTitulo());
stmt.setString(2, livro.getAutor());
stmt.setString(3, livro.getEditora());
stmt.setInt(4, livro.getNumeroPaginas());
stmt.setInt(5, livro.getCodigo());

stmt.execute();
stmt.close();

System.out.println("\nLivro atualizado Com Sucesso !\n");
} catch (SQLException e) {
System.out.println(e.getMessage());
}
}

public List<Livro> listarLivros() {
List<Livro> listaLivros = new ArrayList<Livro>();

String scriptSql = "SELECT * FROM LIVRO";
try {

PreparedStatement stmt = con.prepareStatement(scriptSql);
ResultSet resultSet = stmt.executeQuery();

while (resultSet.next()) {
Livro livro = new Livro();

livro.setCodigo(resultSet.getInt("codLivro"));
livro.setTitulo(resultSet.getString("titulo"));
livro.setAutor(resultSet.getString("autor"));
livro.setEditora(resultSet.getString("editora"));
livro.setNumeroPaginas(resultSet.getInt("numeroPa"));
listaLivros.add(livro);
}

resultSet.close();
stmt.close();

} catch (Exception e) {
System.out.println("Erro : " + e.getMessage());
}
return listaLivros;
}
}