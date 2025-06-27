package JDBC_Work_学生图书管理系统;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class StudentDAO {
    public static Student getStudentById(int id,String p) throws ClassNotFoundException, SQLException, error {
    	 Connection connection = DBUtil.getConnection();
    	    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students where id =? and password=?;");
    	        preparedStatement.setInt(1, id);
    	        preparedStatement.setString(2, p);
    	    ResultSet i = preparedStatement.executeQuery();
    	   if(i.isBeforeFirst()) { //读取结果T/F
    	        int data_0 =0;
    	        String data_1=null;
    	        String data_2=null;
    	        Date data_3=null;
    	        while (i.next()) {
    	             data_0 = i.getInt("id");
    	             data_1 = i.getString("name");
    	             data_2 = i.getString("password");
    	             data_3 = i.getDate("enroll_date");
    	        }
    	        connection.close();
        	    preparedStatement.close();

    	        return new Student(data_0,data_1,data_2,data_3);
    	   }else { 
    		   connection.close();
       	    preparedStatement.close();
    		   return null;
    	   }
    	        
    	        
    	   
    }
}