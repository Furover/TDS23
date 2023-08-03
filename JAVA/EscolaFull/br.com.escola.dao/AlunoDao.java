import java.sql.Connection;
import java.sql.PreparedStatement;

public class AlunoDao extends ConDao {
	public void alterar(Aluno aluno){
		try {
			Connection conexao = getConnection();
			PreparedStatement pstmt = conexao.prepareStatement("Update tbAluno set nome = ?, telefone = ?, email = ?,datacadastro = ?, matricula = ?"+"where matricula = ?");
			pstmt.setString(1, aluno.getNome());
			pstmt.setString(2, aluno.getTelefone());
			pstmt.setString(3, aluno.getEmail());
			pstmt.setDate(4,new java.sql.Date(aluno.getDataCadastro().getTime()));
			pstmt.setLong(5, aluno.getMatricula());
			pstmt.execute();
			pstmt.close();
			conexao.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

}
