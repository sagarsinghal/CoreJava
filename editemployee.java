import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class editemployee {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		
		System.out.println("Enter Last Name : ");
		
		String myName = br.readLine();
		
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
	
		String sql = "delete from employee where name = (?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt. (1, myName);
		stmt.executeUpdate(sql);
		
		ResultSet rs = stmt.executeQuery("SELECT * From EMPLOYEE");
		
		while (rs.next()) {
			String department = rs.getString(1);
			String name = rs.getString(3);
			
			System.out.println(department +" "+name);
		}
	}

}
