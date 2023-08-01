import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
	private Connection con;
	public LivroDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		con = cf.getConnection();
	}
	public void inserirLivro(Livro lv) {
		String scriptSql = "insert into LIVRO (titulo,autor,editora,numeroPa)" + "Values (?,?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			stmt.setString(1, lv.getTitulo());
			stmt.setString(2, lv.getAutor());
			stmt.setString(3, lv.getEditora());
			stmt.setInt(4, lv.getNumeroPaginas());
			stmt.execute();
			stmt.close();
			
			System.out.println("\nLivro cadastrado com sucesso!\n");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void deletarLivro(Livro lv) {
		String scriptSql = "DELETE FROM LIVRO WHERE codLivro = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			stmt.setInt(1, lv.getCodigo());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("\nLivro excluído com sucesso!\n");
		} catch(Exception e) {
			System.out.println("Erro : " + e.getMessage());
		}
	}
	public void atualizarLivro(Livro lv) {
		String scriptSql = "UPDATE LIVRO SET titulo = ?,autor = ?" + ",editora = ?, numeroPa = ? WHERE codLivro = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			stmt.setString(1, lv.getTitulo());
			stmt.setString(2, lv.getAutor());
			stmt.setString(3, lv.getEditora());
			stmt.setInt(4, lv.getCodigo());
			stmt.execute();
			stmt.close();
			
			System.out.println("\nSistema atualizado com sucesso!\n");
		} catch(Exception e) {
			System.out.println("Erro : "+e.getMessage());
		}
	}
	public List <Livro> listarLivros(){
		List <Livro> listaLivros = new ArrayList<>();
		String scriptSql = "SELECT * FROM LIVRO";
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			ResultSet resultSet = stmt.executeQuery();
			
			while(resultSet.next()) {
				Livro lv = new Livro();
				
				lv.setCodigo(resultSet.getInt("codLivro"));
				lv.setTitulo(resultSet.getString("titulo"));
				lv.setAutor(resultSet.getString("autor"));
				lv.setEditora(resultSet.getString("editora"));
				lv.setNumeroPaginas(resultSet.getInt("numeroPa"));
				listaLivros.add(lv);
			}
			
			resultSet.close();
			stmt.close();
		} catch(Exception e) {
			System.out.println("Erro : " + e.getMessage());
		}
		return listaLivros;
	}
	

}
