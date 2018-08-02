import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class batchupdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException e1) {
			System.out.println("unable to locate driver");
		}
		
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username ="scott";
		String password = "tiger";
		String sql = "select * from employee ";
			Connection con = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("connection is successful");
	
		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, "Katy");
		psmt.setString(2, "Santa");
		psmt.addBatch();
		psmt.executeBatch();
	}

}
