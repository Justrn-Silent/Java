package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement用法_占位符 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//jdbc:mysql://localhost:3306
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","2326726");
		String sql="insert into JDBC(name, old) values (?,?);";  //?占位符，避免SQL注入
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "老刘");
		ps.setInt(2, 28);
		//当然可以用通用Object--->>	ps.setObject(索引, 对象)
		
	
		
	}
}
