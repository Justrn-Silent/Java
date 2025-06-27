package 面向对象_封装;
import java.util.Scanner;
public class 封装_JavaBean_测试02 {
	public static void main(String[] args) {
		封装_JavaBean_01 s = new 封装_JavaBean_01();
		Scanner S = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int old = S.nextInt();
		s.setOld(old);
		System.out.println(s.getOld());
		System.out.println("请输入性别：");
		String man =S.next();
		s.setMan(man);
		s.isMan();
		System.out.println("请输入姓名：");
		String name =S.next();
		s.setName(name);
		System.out.println(s.getName());
		System.out.println("请输入身高：");
		double hight =S.nextDouble();
		s.setHight(hight);
		System.out.println(s.getHight());
		
	}
}
