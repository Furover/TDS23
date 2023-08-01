import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CdDAO {
	private Connection con;
	public CdDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		con = cf.getConnection();
	}
	public void inserirCd(CD cd) {
		String scriptSql = "insert into CD (titulo,artista,numeroFaixas,gravadora)" + "Values (?,?,?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			stmt.setString(1, cd.getTitulo());
			stmt.setString(2, cd.getArtista());
			stmt.setInt(3, cd.getNumeroFaixas());
			stmt.setString(4, cd.getGravadora());
			stmt.execute();
			stmt.close();
			
			System.out.println("\nCd cadastrado com sucesso!\n");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void deletarCd(CD cd) {
		String scriptSql = "DELETE FROM CD WHERE codCd = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			stmt.setInt(1, cd.getCodigo());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("\nCd excluído com sucesso!\n");
		} catch(Exception e) {
			System.out.println("Erro : " + e.getMessage());
		}
	}
	public void atualizarCd(CD cd) {
		String scriptSql = "UPDATE CD SET titulo = ?,artista = ?" + ",numeroFaixas = ?, gravadora = ? WHERE codCd = ?";
		
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			stmt.setString(1, cd.getTitulo());
			stmt.setString(2, cd.getArtista());
			stmt.setInt(3, cd.getNumeroFaixas());
			stmt.setString(4, cd.getGravadora());
			stmt.setInt(5, cd.getCodigo());
			stmt.execute();
			stmt.close();
			
			System.out.println("\nSistema atualizado com sucesso!\n");
		} catch(Exception e) {
			System.out.println("Erro : "+e.getMessage());
		}
	}
	public List <CD> listarCds(){
		List <CD> listaCds = new ArrayList<>();
		String scriptSql = "SELECT * FROM CD";
		try {
			PreparedStatement stmt = con.prepareStatement(scriptSql);
			ResultSet resultSet = stmt.executeQuery();
			
			while(resultSet.next()) {
				CD cd = new CD();
				
				cd.setCodigo(resultSet.getInt("codCd"));
				cd.setTitulo(resultSet.getString("titulo"));
				cd.setArtista(resultSet.getString("artista"));
				cd.setNumeroFaixas(resultSet.getInt("numeroFaixas"));
				cd.setGravadora(resultSet.getString("gravadora"));
				listaCds.add(cd);
			}
			
			resultSet.close();
			stmt.close();
		} catch(Exception e) {
			System.out.println("Erro : " + e.getMessage());
		}
		return listaCds;
	}
}
