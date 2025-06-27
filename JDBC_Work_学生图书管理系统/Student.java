package JDBC_Work_学生图书管理系统;

import java.util.Date;


public class Student {
    // 学号（主键）
    int id;
    // 姓名
    String name;
    // 密码
    String password;
    // 入学日期
    Date enroll_date;
    // 构造函数

    public Student(int id, String name, String password, Date enroll_date) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.enroll_date = enroll_date;
    }
    public Student(int id,String password){
        this.id = id;
        this.password = password;
    }
    // Getter方法（仅提供读取访问）

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Date getEnroll_date() {
        return enroll_date;
    }

    // 重写toString方法，用于调试和打印

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", enroll_date=" + enroll_date +
                '}';
    }
}