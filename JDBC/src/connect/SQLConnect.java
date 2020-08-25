package connect;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnect {

	public static Connection getJDBCConnection() {
		final String user = "user";
		final String password = "password";
		final String url = "jdbc:sqlserver://localhost:1433;databaseName=IBMdata;user=" + user + ";password="
				+ password;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			return DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		Connection conn = getJDBCConnection();
		if (conn != null) {
			System.out.println("Ok, bạn đã làm được điều đó !!!");

		} else {
			System.out.println("non !");
		}
	}
}
