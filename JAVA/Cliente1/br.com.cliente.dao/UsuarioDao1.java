import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao1 extends ConnectionFactory {
	   private static final String INSERT_USERS_SQL = "insert into usuario values('?','?','?')";
	   private static final String SELECT_USER_BY_ID = "select id,name,email,pais from users where id =?";
	   private static final String SELECT_ALL_USERS = "select* from usuario";
	   private static final String DELETE_USERS_SQL = "delete from usuario where id = ?;";
	   private static final String UPDATE_USERS_SQL = "update usuario set name = ?, email = ?,pais = ? where id_Usuario = ?";

	   public UsuarioDao1() {
	   }

	   public void insertUser(Usuario usuario) throws SQLException {
	       System.out.println(INSERT_USERS_SQL);
	       // try-with-resource statement will auto close the connection.
	       try (
	               Connection connection = getConnection();
	               PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	           preparedStatement.setString(1, usuario.getName());
	           preparedStatement.setString(2, usuario.getEmail());
	           preparedStatement.setString(3, usuario.getPais());
	           System.out.println(preparedStatement);
	           preparedStatement.executeUpdate();
	       } catch (SQLException e) {
	           printSQLException(e);
	       }
	   }

	   public Usuario selectUser(int id) {
	       Usuario user = null;
	       // Step 1: Establishing a Connection
	       try (
	               Connection connection = getConnection();
	               // Step 2:Create a statement using connection object
	               PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
	           preparedStatement.setInt(1, id);
	           System.out.println(preparedStatement);
	           // Step 3: Execute the query or update query
	           ResultSet rs = preparedStatement.executeQuery();

	           // Step 4: Process the ResultSet object.
	           while (rs.next()) {
	               String name = rs.getString("name");
	               String email = rs.getString("email");
	               String pais = rs.getString("pais");
	               user = new Usuario(id, name, email, pais);
	           }
	       } catch (SQLException e) {
	           printSQLException(e);
	       }
	       return user;
	   }

	   public List<Usuario> selectAllUsers() {

	       // using try-with-resources to avoid closing resources (boiler plate code)
	       List<Usuario> users = new ArrayList<>();
	       // Step 1: Establishing a Connection
	       try (Connection connection = getConnection();

	               // Step 2:Create a statement using connection object
	           PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
	           System.out.println(preparedStatement);
	           // Step 3: Execute the query or update query
	           ResultSet rs = preparedStatement.executeQuery();

	           // Step 4: Process the ResultSet object.
	           while (rs.next()) {
	               int id = rs.getInt("id");
	               String name = rs.getString("name");
	               String email = rs.getString("email");
	               String pais = rs.getString("pais");
	               users.add(new Usuario(id, name, email, pais));
	           }
	       } catch (SQLException e) {
	           printSQLException(e);
	       }
	       return users;
	   }

	   public boolean deleteUser(int id) throws SQLException {
	       boolean rowDeleted;
	       try (Connection connection = getConnection();
	               PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
	           statement.setInt(1, id);
	           rowDeleted = statement.executeUpdate() > 0;
	       }
	       return rowDeleted;
	   }

	   public boolean updateUser(Usuario user) throws SQLException {
	       boolean rowUpdated;
	       try (Connection connection = getConnection();
	               PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
	           statement.setString(1, user.getName());
	           statement.setString(2, user.getEmail());
	           statement.setString(3, user.getPais());
	           statement.setInt(4, user.getId());

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
