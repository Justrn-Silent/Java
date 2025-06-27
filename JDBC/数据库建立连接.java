package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class 数据库建立连接 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//jdbc:mysql://localhost:3306
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","2326726");
		System.out.println(conn);
	}
}
