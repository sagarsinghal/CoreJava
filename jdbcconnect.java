import java.sql.*;

public class jdbcconnect {

	public static void main(String[] args) throws Exception {
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
	
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * From EMPLOYEE");
		
		while (rs.next()) {
			String department = rs.getString(1);
			String name = rs.getString(3);
			
			System.out.println(department +" "+name);
		}
		
	}

}
