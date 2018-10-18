package practice04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class practice04 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://localhost:5432/test00";
		String user = "root";
		String password = "test1234";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT VERSION()");

		try	{
		//	conn = DriverManager.getConnection(url, user, password);
		//	st = conn.createStatement();
		//	rs = st.executeQuery("SELECT VERSION()");
		
			if (rs.next()) {
				System.out.println(rs.getString(1));
			}
			
		} catch (SQLException sqlEX) {
			System.out.println(sqlEX);
		} finally {
			try {
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException sqlEX) {
				System.out.println(sqlEX);
			}
		}
	}

}