package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {

	public static Connection getJDBCconnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/dong?useSSL=false";// cấu hình

		String user = "root";
		String password = "123456";// nhớ mật khẩu !
		try {
			Class.forName("com.mysql.jdbc.Driver");// đến driver
			
			return DriverManager.getConnection(url, user, password);
			//System.out.println("Đệch, đc rồi !!!");
		} catch (ClassNotFoundException e) {
			System.out.println("VCL");
			e.printStackTrace();
		}
		return null;
	}
}
