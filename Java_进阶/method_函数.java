package Java_进阶;
import java.util.Scanner;
public class method_函数 {
	/*
	 Java 方法类型解释
2. 静态方法 (Static Method):
   在Java中，静态方法属于类本身，可以直接通过类名调用，不需要实例。
   例如：`public static void myStaticMethod() { ... }` 
   可以通过 `MyClass.myStaticMethod();` 来调用。


	   C实现：：
				typedef struct {
				    // 结构体成员
				} MyClass;
				
				// 结构体中的成员函数
			  static	void myMethod(MyClass instance) {
				    // 函数体
				}
				
				
3. 实例方法 (Non-static Method):
   在Java中，实例方法是普通方法，与静态方法相对，必须通过类的实例来调用。
   例如：`public void myInstanceMethod() { ... }` 
   在某个类中，通过 `MyClass myObj = new MyClass(); myObj.myInstanceMethod();` 来调用。
   
   
   
   	   C实现：：
				typedef struct {
				    // 结构体成员
				} MyClass;
				
				// 结构体中的成员函数
				void myMethod(MyClass instance) {
				    // 函数体
				}
				
				
	//在方法中创建无修饰的变量叫实例变量，也就是说需要通过实例来初始化，
	 尽管在类中初始化了变量，在运行中不创建了类变量(实例)也不会初始化
*/

	//实现求最大，小值的方法
	
	//BJ方法
	   static void BJ(int a,int b) {
			if(a>b) {
				System.out.printf("最大值：%d", a);
				System.out.printf("最小值：%d", b);
			}
			System.out.printf("最大值：%d", b);
			System.out.printf("最小值：%d", a);
		}
	   
	   //main方法
		public static void main(String[]args) {
			Scanner aa =new Scanner(System.in);
			Scanner bb =new Scanner(System.in);
			System.out.printf("请输入1：");
			int a=aa.nextInt();
			System.out.printf("请输入2：");
			int b=bb.nextInt();
			BJ(a,b);

		}
}
