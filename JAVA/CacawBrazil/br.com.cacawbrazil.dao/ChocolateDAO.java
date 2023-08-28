import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChocolateDAO extends ConnectionFactory {
	   private static final String INSERT_CHOCOS_SQL = "insert into chocolate values('?','?','?','?','?','?')";
	   private static final String SELECT_CHOCO_BY_ID = "select id,nome,tipo,marca,dataval,preco,img from chocolate where id = ?";
	   private static final String SELECT_ALL_CHOCOS = "select * from chocolate";
	   private static final String DELETE_CHOCOS_SQL = "delete from chocolate where id = ?;";
	   private static final String UPDATE_CHOCOS_SQL = "update chocolate set nome = ?, tipo = ?,marca = ?, dataval = ?, preco = ?,img = ? where id = ?";

	   public ChocolateDAO() {
	   }

	   public void insertChoco(Chocolate chocolate) throws SQLException {
	       System.out.println(INSERT_CHOCOS_SQL);
	       // try-with-resource statement will auto close the connection.
	       try (
	               Connection connection = getConnection();
	               PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CHOCOS_SQL)) {
	           preparedStatement.setString(1, chocolate.getNome());
	           preparedStatement.setString(2, chocolate.getTipo());
	           preparedStatement.setString(3, chocolate.getMarca());
	           preparedStatement.setString(4, chocolate.getDataVal());
	           preparedStatement.setDouble(5, chocolate.getPreco());
	           preparedStatement.setString(6, chocolate.getImg());
	           System.out.println(preparedStatement);
	           preparedStatement.executeUpdate();
	       } catch (SQLException e) {
	           printSQLException(e);
	       }
	   }

	   public Chocolate selectChoco(int id) {
	       Chocolate choco = null;
	       // Step 1: Establishing a Connection
	       try (
	               Connection connection = getConnection();
	               // Step 2:Create a statement using connection object
	               PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CHOCO_BY_ID);) {
	           preparedStatement.setInt(1, id);
	           System.out.println(preparedStatement);
	           // Step 3: Execute the query or update query
	           ResultSet rs = preparedStatement.executeQuery();

	           // Step 4: Process the ResultSet object.
	           while (rs.next()) {
	               String nome = rs.getString("nome");
	               String tipo = rs.getString("tipo");
	               String marca = rs.getString("marca");
	               String dataVal = rs.getString("dataval");
	               Double preco = rs.getDouble("preco");
	               String img = rs.getString("img");
	               choco = new Chocolate(id, nome, tipo, marca, dataVal, preco, img);
	           }
	       } catch (SQLException e) {
	           printSQLException(e);
	       }
	       return choco;
	   }

	   public List<Chocolate> selectAllChocos() {

	       // using try-with-resources to avoid closing resources (boiler plate code)
	       List<Chocolate> chocos = new ArrayList<>();
	       // Step 1: Establishing a Connection
	       try (Connection connection = getConnection();

	               // Step 2:Create a statement using connection object
	           PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CHOCOS);) {
	           System.out.println(preparedStatement);
	           // Step 3: Execute the query or update query
	           ResultSet rs = preparedStatement.executeQuery();

	           // Step 4: Process the ResultSet object.
	           while (rs.next()) {
	               int id = rs.getInt("id");
	               String nome = rs.getString("nome");
	               String tipo = rs.getString("tipo");
	               String marca = rs.getString("marca");
	               String dataVal = rs.getString("dataval");
	               Double preco = rs.getDouble("preco");
	               String img = rs.getString("img");
	               chocos.add(new Chocolate(id, nome, tipo, marca, dataVal, preco, img));
	           }
	       } catch (SQLException e) {
	           printSQLException(e);
	       }
	       return chocos;
	   }

	   public boolean deleteChoco(int id) throws SQLException {
	       boolean rowDeleted;
	       try (Connection connection = getConnection();
	               PreparedStatement statement = connection.prepareStatement(DELETE_CHOCOS_SQL);) {
	           statement.setInt(1, id);
	           rowDeleted = statement.executeUpdate() > 0;
	       }
	       return rowDeleted;
	   }

	   public boolean updateChoco(Chocolate choco) throws SQLException {
	       boolean rowUpdated;
	       try (Connection connection = getConnection();
	               PreparedStatement statement = connection.prepareStatement(UPDATE_CHOCOS_SQL);) {
	    	   statement.setString(1, choco.getNome());
	    	   statement.setString(2, choco.getTipo());
	           statement.setString(3, choco.getMarca());
	           statement.setString(4, choco.getDataVal());
	           statement.setDouble(5, choco.getPreco());
	           statement.setString(6, choco.getImg());
	           statement.setInt(7, choco.getId());

	           rowUpdated = statement.executeUpdate() > 0;
	       }
	       return rowUpdated;
	   }

	   private void printSQLException(SQLException ex) {
	       for (Throwable e : ex) {
	           if (e instanceof SQLException) {
	               e.printStackTrace(System.err);
	               System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	               System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	               System.err.println("Message: " + e.getMessage());
	               Throwable t = ex.getCause();
	               while (t != null) {
	                   System.out.println("Cause: " + t);
	                   t = t.getCause();
	               }
	           }
	       }
	   }

	}
