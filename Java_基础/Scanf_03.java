package Java_基础;
import java.util.Scanner;  //调用包
public class Scanf_03 {
	public static void main(String[]args) {
		System.out.println("请输入:");
		Scanner a1 = new Scanner (System.in);  //scanf

		int a =a1.nextInt();  //输入返回值为整数的值  a1.nextInt();
		System.out.println("结果为："+a);
		
		a1.close();  //停止键盘输入
	}
}
