import java.sql.Connection;
import java.sql.SQLException;

public class connector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DriverManager
				String driverName = "com.mysql.jdbc.Driver";                        

				Class.forName(driverName);
				  .getConnection("jdbc:mysql://localhost:32769/FomyTestes", "root", "St4tyon@rY2")) {
				    // use con here
				}catch(SQLException e) {
					System.out.println("gamer");
				}
	}

}
