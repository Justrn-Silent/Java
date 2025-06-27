package JDBC_模拟学生管理系统;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    private static String DB = "jdbc:mysql://1.94.3.191:3306/demo";
    private static String USERNAME = "root";
    private static String PASSWORD = "Lyx!@#qwe123";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //1.注册加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接对象
        return DriverManager.getConnection(DB, USERNAME, PASSWORD);
    }

}
