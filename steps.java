import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class steps {

	public static void main(String[] args) throws SQLException, IOException {
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
		
		
			Connection con = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("connection is successful");
			con.setAutoCommit(false);
		String sql = "Insert into dailysteps values('peter','29-07-18',1000)";
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		stmt.executeQuery("update total_steps set steps = steps + 1000" );
	}

}
