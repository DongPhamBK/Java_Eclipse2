package connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.JDBC4Connection;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import java.sql.Statement;

public class ResultDB {

	public static void main(String[] args) {

		try {

			Connection conn = MySQLConnect.getJDBCconnection();
			Statement statement = conn.createStatement();// tạo statement
			String sql = "select * from sinhvien where MaSV = 2";

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				int masv = rs.getInt("MaSV");
				String name = rs.getString("TenSV");
				int ns = rs.getInt("NamSinh");

				System.out.println(masv + " " + name + " " + ns);
				// quá hay !!!
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
