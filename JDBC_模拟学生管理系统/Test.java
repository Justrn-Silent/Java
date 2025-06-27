package JDBC_模拟学生管理系统;


import java.sql.*;
import java.util.Scanner;
import java.util.UUID;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("学生管理系统");

        while (true){
            System.out.println("请输入操作，以0结束");
            System.out.println("1:添加学生信息");
            System.out.println("2:删除学生信息");
            System.out.println("3:修改学生信息");
            System.out.println("4:查询学生信息");
            String next = scanner.next();
            if ("0".equals(next)){
                System.out.println("您已退出系统");
                break;
            }
            switch (next){
                case "1":
                    addUser();
                    break;
                //todo 删除学生信息（一定要加条件）
                //todo 修改学生信息
                case "4":
                    getUser();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    //添加学生信息
    // id, name, birthday, gender
    public static void addUser() throws SQLException, ClassNotFoundException {
        //生成一个不重复的随机字符串
        String id = UUID.randomUUID().toString();
        System.out.println("请输入学生姓名：");
        String name = scanner.next();
        System.out.println("请输入学生的生日（yyyy-MM-dd）:");
        String birStr = scanner.next();
        System.out.println("请输入学生的性别（0：男,1:女）：");
        String gender = scanner.next();
        gender = "男".equals(gender)?"0":"1";
        //注册驱动
        //创建连接
        Connection connection = DBUtils.getConnection();
        //获取sql的执行对象
        PreparedStatement preparedStatement = connection.prepareStatement("insert into t_student values(?,?,?,?)");
        preparedStatement.setString(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setDate(3, Date.valueOf(birStr));
        preparedStatement.setString(4,gender);
        //添加，返回结果(返回受影响的行数)
        int i = preparedStatement.executeUpdate();
        System.out.println(i>0?"添加成功":"添加失败");
        //关闭资源(放在finally执行)
        connection.close();
        preparedStatement.close();
    }


    //查询学生信息
    // id, name, birthday, gender
    public static void getUser() throws SQLException, ClassNotFoundException {
        System.out.println("请输入学生姓名，0查询所有");
        String next = scanner.next();
        //注册驱动
        //创建连接
        Connection connection = DBUtils.getConnection();
        String sql = "select * from t_student";
        PreparedStatement preparedStatement;
        if("0".equals(next)){
            //获取sql的执行对象
            preparedStatement = connection.prepareStatement(sql);
        }else{
            sql += " where name = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,next);
        }
        //查询，返回结果
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            String id = resultSet.getString("id");
            Date birthday = resultSet.getDate("birthday");
            String gender = resultSet.getString("gender");
            gender = "0".equals(gender)?"男":"女";
            System.out.println(id+"\t"+name+"\t"+birthday+"\t"+gender);
        }
        //关闭资源(放在finally执行)
        connection.close();
        preparedStatement.close();
        resultSet.close();
    }

}
