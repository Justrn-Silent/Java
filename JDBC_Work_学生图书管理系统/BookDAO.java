package JDBC_Work_学生图书管理系统;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
	public static void show_Book() throws ClassNotFoundException, SQLException {
		 Connection connection = DBUtil.getConnection();
	  	    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM books;");
	  	    ResultSet ii = preparedStatement.executeQuery();
	  	   int id = 0;
	  	  String title = null;
	  	  String author = null;
	  	  String publisher = null;
	  	  double price = 0;
	  	  boolean is_borrowed = false;
	  	  int borrower_id =0;
	  	        while (ii.next()) {
	  	        	id=ii.getInt("id");
	  	        	title=ii.getString("title");
	  	        	author=ii.getString("author");
	  	        	publisher=ii.getString("publisher");
	  	        	price=ii.getDouble("price");
	  	        	is_borrowed=ii.getBoolean("is_borrowed");
	  	        	borrower_id=ii.getInt("borrower_id");
	  	  	        System.out.println("【"+id+"】   "+"《"+title+"》   "+author+"     "+publisher+"     "+price+"     "+(is_borrowed==true?"借出":"未借出")+"    【借书用户：】"+(borrower_id==0?"无人借":borrower_id));
	  	        }
	}

	public static Book getBookById(int id,int name_id) throws SQLException, ClassNotFoundException {
		 Connection connection = DBUtil.getConnection();
	  	    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM books where id=?;");
	  	    preparedStatement.setInt(1, id);
	  	    ResultSet ii = preparedStatement.executeQuery();
	  	   if(ii.isBeforeFirst()) {
	  		 PreparedStatement preparedStatement_1= connection.prepareStatement("update books set is_borrowed=?,borrower_id=? where id=?;");
	  	       preparedStatement_1.setBoolean(1, true);
	  	       preparedStatement_1.setInt(2, name_id); 
	  	       preparedStatement_1.setInt(3, id);
	  	     int rowsUpdated = preparedStatement_1.executeUpdate();
	  	     if(rowsUpdated<=0) {
	  	    	 return null;
	  	     }
	  	   }else {
	  	        	return null;  	        
	  	        }
	  	 PreparedStatement preparedStatement_2 = connection.prepareStatement("SELECT * FROM books where id=?;");
	  	    preparedStatement_2.setInt(1, id);
	  	    ResultSet iii = preparedStatement_2.executeQuery();
	  	  int id_1 = 0;
	  	  String title = null;
	  	  String author = null;
	  	  String publisher = null;
	  	  double price = 0;
	  	  boolean is_borrowed = false;
	  	  int borrower_id =0;
	  	        while (iii.next()) {
	  	        	id_1=iii.getInt("id");
	  	        	title=iii.getString("title");
	  	        	author=iii.getString("author");
	  	        	publisher=iii.getString("publisher");
	  	        	price=iii.getDouble("price");
	  	        	is_borrowed=iii.getBoolean("is_borrowed");
	  	        	borrower_id=iii.getInt("borrower_id");
	  	        	System.out.println("【"+id+"】  "+"《"+title+"》   "+author+"    "+publisher+"    "+price+"     "+(is_borrowed==true?"借出":"未借出")+"【借书用户：】   "+borrower_id);    	     	    	 
	}
	  	      System.out.println("借取成功");	 
	  	      return new Book(id_1,title,author,publisher,price,is_borrowed,borrower_id);
}

	  	      public static boolean show_borrow_books() throws ClassNotFoundException, SQLException {
	  	    	 Connection connection = DBUtil.getConnection();
	 	  	    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM books where is_borrowed=?;");
	 	  	    preparedStatement.setBoolean(1, true);
	 	  	    ResultSet ii = preparedStatement.executeQuery();
	 	  	   int id = 0;
	 	  	  String title = null;
	 	  	  String author = null;
	 	  	  String publisher = null;
	 	  	  double price = 0;
	 	  	  boolean is_borrowed = false;
	 	  	  int borrower_id =0;
	 	  	if(ii.isBeforeFirst()) {
	 	  	        while (ii.next()) {
	 	  	        	id=ii.getInt("id");
	 	  	        	title=ii.getString("title");
	 	  	        	author=ii.getString("author");
	 	  	        	publisher=ii.getString("publisher");
	 	  	        	price=ii.getDouble("price");
	 	  	        	is_borrowed=ii.getBoolean("is_borrowed");
	 	  	        	borrower_id=ii.getInt("borrower_id");
	 	  	  	        System.out.println("【"+id+"】"+"《"+title+"》"+author+" "+publisher+" "+price+" "+(is_borrowed==true?"借出":"未借出")+"  ----借出用户ID："+borrower_id);
	 	  	        }
	 	  	}else {
	 	  		System.out.println("无借阅图书！！");
	 	  		return false;
	 	  	}
			return true;
	  	    	  
	  	      }
	  	      public static void return_books(int re_id,int name_id) throws ClassNotFoundException, SQLException, error {
	  	    	 Connection connection = DBUtil.getConnection();
	 	  	  PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM books where id=?;");
	 	  	    preparedStatement.setInt(1, re_id);
	 	  	    ResultSet ii = preparedStatement.executeQuery();
	 	  	   int id = 0;
	 	  	   int name_ID=0;
	 	  	        while (ii.next()) {
	 	  	        	id=ii.getInt("id");
	 	  	        	name_ID=ii.getInt("borrower_id");
	 	  	        }
	 	  	        if(name_id==name_ID) {
	  	    	  if(id!=re_id) {
	  	    		  throw new error("归还失败！！"); 
	  	    	  }else {
	  	    	PreparedStatement preparedStatement_1= connection.prepareStatement("update books set is_borrowed=?,borrower_id=? where id=?;");
	  	  	       preparedStatement_1.setBoolean(1, false);
	  	  	       preparedStatement_1.setInt(2, 0); 
	  	  	       preparedStatement_1.setInt(3, re_id);
	  	  	     int rowsUpdated = preparedStatement_1.executeUpdate();
	  	  	     if(rowsUpdated<=0) {
	  	  	    	throw new error("归还失败！！"); 
	  	  	     }
	  	  	     
	  	    	  }
	 	  	        }else {
	 	  	        	System.out.println("当前账号没有借书！！");
	 	  	        }
	 	  	        System.out.println("归还成功！！");
	  	      }
			public static void alter_run_password(String password,String new_password,int this_ID) throws SQLException, ClassNotFoundException {
				Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("select * from students where id=?");
				preparedStatement.setInt(1,this_ID);
				ResultSet i = preparedStatement.executeQuery();
				String data_password=null;
				while(i.next()){
					data_password=i.getString("password");
				}
				if(data_password.equals(password)){
					PreparedStatement preparedStatement_1= connection.prepareStatement("update students set password=? where id=?;");
					preparedStatement_1.setString(1,new_password);
					preparedStatement_1.setInt(2,this_ID);
					int passwordUpdated = preparedStatement_1.executeUpdate();
					System.out.println("修改密码成功！！");
				}else {
					System.out.println("原密码输入错误！！");
					return;
				}
			}

	
}
