package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
Statement接口
用于执行静态 SQL 语句并返回它所生成结果的对象。
三种Statement类
		Statement:
			由createStatement创建，用于发送简单的SQL语句。(不带参数的)。
		PreparedStatement:
			继承自Statement接口，由PrepareStatement创建，用于发送含有一个或多个输入参数的sql语句。
			PreparedStatement对象比Statement对象的效率更高，并且可以防止SQL注入。我们一般都用PreparedStatement.
		CallableStatement:
			继承自PreparedStatement。由方法prePareCall创建，用于调用存储过程

常用的Statement方法
	execute():运行语句，返回是否有结果集。
	executeQuery():运行select语句，返回ResultSet结果集
	executeUpdate():运行insert/update/delete操作，返回更新的行数。
  */
public class statement接口_SQL注入 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","2326726");
		Statement sql =conn.createStatement();
//		String name="张三";
//		String str="insert into JDBC(name, old) values ('"+name+"',26);";
//		sql.execute(str);
/*------------------------------------------------------------*/
		// SQL注入
		String sr = "5 or 1=1";  //当这种情况发生结果为true，也就是说delete删除全部数据。
		String s ="delete from jdbc where id="+sr;
		sql.execute(s);
		
		
	}
}
