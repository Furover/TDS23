package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoDao extends Produto{
	public List <Produto> listar(){
		List <Produto> produtos = new ArrayList<Produto>();
		try {
			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement smt = con.prepareStatement("select * from produto");
			ResultSet rs = smt.executeQuery();
			
			while(rs.next()) {
				Produto p = new Produto();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setValor(rs.getDouble("valor"));
				p.setEstoque(rs.getInt("estoque"));
				
				produtos.add(p);
				
			}
			rs.close();
			smt.close();
			con.close();
			
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
			}
			return produtos;
	}

}
