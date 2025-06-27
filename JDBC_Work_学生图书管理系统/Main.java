package JDBC_Work_学生图书管理系统;

import java.sql.SQLException;
import java.util.Scanner;


class error extends Exception{
	public error(String massage) {
		super(massage);
	}
}
public class Main {
    private static Scanner scanner = new Scanner(System.in); 
    private static Student currentStudent = null;            
    public static void main(String[] args) throws SQLException, ClassNotFoundException ,error{ 	
        System.out.println("=== 学生图书管理系统 ===");
        
        while (true) {
        	System.out.println("\n1. 学生登录");
            System.out.println("2. 查看图书列表");
            System.out.println("3. 退出");
            System.out.print("请选择: ");
            
            try {
            String choice = scanner.next();
            
            switch (choice) {
                case "1":
                    login(); 
                    if (currentStudent != null) {
                        showStudentMenu();
                    }
                    break;
                case "2":
                    viewBooks();
                    break;
                case "3":
                    System.out.println("感谢使用，再见！");
                    return;  
                default:
                    System.out.println("无效选择");
            }
            }catch (error e) {
            	System.out.println("操作失败："+e.getMessage());
			}
		}
    }

    private static void login() throws SQLException, ClassNotFoundException, error {
    System.out.println("请输入学号：");
    int id =scanner.nextInt();
    System.out.println("请输入密码：");
    String p =scanner.next();
    currentStudent = StudentDAO.getStudentById(id,p);
    if(currentStudent==null) {
    	throw new error("账号密码不正确！！");
    }
    }


    private static void showStudentMenu() throws ClassNotFoundException, SQLException, error {
        while (true) {
            System.out.println("1. 查看我的借阅情况");
            System.out.println("2. 借阅图书");
            System.out.println("3. 归还图书");
            System.out.println("4. 修改登录密码");
            System.out.println("5.退出登录");
            System.out.print("请选择: ");
            
            String choice = scanner.next();
            
            switch (choice) {
                case "1":
                    viewMyBorrowedBooks();  
                    break;
                case "2":
                    borrowBook();  
                    break;
                case "3":
                    returnBook();  
                    break;
                case "4":
                    alter_runpassword();  
                case"5":
                    System.out.println("已退出登录");
                    currentStudent = null;  
                    return;
                default:
                    System.out.println("无效选择");
            }
        }
    }

   



    private static void alter_runpassword() throws SQLException, ClassNotFoundException {
        int ID_name=currentStudent.id;
        System.out.println("请输入初始密码：");
        String paaword=scanner.next();
        System.out.println("请输入新密码：");
        String new_password = scanner.next();
        BookDAO.alter_run_password(paaword,new_password,ID_name);
    }

    private static void viewBooks() throws SQLException, ClassNotFoundException {
    	 BookDAO.show_Book();
    }


    private static void viewMyBorrowedBooks() throws ClassNotFoundException, SQLException {
    	 BookDAO.show_borrow_books();
    }


    private static void borrowBook() throws ClassNotFoundException, SQLException, error {
    	System.out.println("---------------------------------------------------------------------------");
        viewBooks();  // 显示所有图书
    	System.out.println("---------------------------------------------------------------------------");
        System.out.println("请输入要借阅的图书ID：");
        int ID =scanner.nextInt();
        int name_id =currentStudent.id;
        BookDAO.getBookById(ID,name_id);

       

    }


    private static void returnBook() throws ClassNotFoundException, SQLException, error {
    	boolean run= BookDAO.show_borrow_books();  // 显示已借阅图书
    	if(run==true) {
        System.out.println("请输入要归还书的ID：");
        int re_id = scanner.nextInt();
        int name_ID=currentStudent.id;
        BookDAO.return_books(re_id,name_ID);
        	
    }
}
}