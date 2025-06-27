package Java_基础;

public class Hello_world_01 {
	public static void main(String[]args) {
		System.out.println("Hello World");  //字符串都要用双引号引用
		//对于两个字符串进行输出可以用运算符"+"进行合并
		System.out.println("Hello " + "World");//字符串+字符串 ~ 字符串(+拼接)
		//对于"+"运算符是四则运算符，所以当遇到字符串与数时运算规则是符号优先级左结合或者右结合依次运算
		System.out.println("Hello"+6); //字符串+数 ~字符串 ==>>  Hello6
		System.out.println(6+"Hello"); //数+字符串  ==>>  6Hello
		System.out.println("Hello"+6+6);//字符串+6+6  ==>>  Hello66
		System.out.println("Hello"+(6+6));//字符串+(6+6) ==>>Hello12
		System.out.println(6+6+"Hello");//数+数+字符串 ==>>12Hello
		//转义字符：\n : 换行
		System.out.println("Hello\nWorld");
		
		//System.out.println();  本身运行完字符串还会附加\n
		
//------------------------------------------------------------------------------------------------------

		//在Java中有三种标准输出流
		//1: System.out.println();  //特点：自动换行
		//2: System.out.print();  //特点：没有换行
		//3: System.out.printf();
		
		//第一种：
		//作用：打印输出并自动换行。当需要输出文本并开始新行时使用。
		  System.out.println("Hello, World!");
		  // 输出：Hello, World!
		  // 接着自动换行
		  
		//第二种：
		//作用：打印输出但不自动换行。当需要输出文本但不希望自动换行时使用。
		    System.out.print("Hello, World!");
		    // 输出：Hello, World!
		    // 不自动换行，即输出不会在新的一行开始

		//第三种：
		//作用：格式化输出。当需要按照特定格式输出数据时使用。
		//可以包含格式化占位符，如 `%d` 用于整数，`%s` 用于字符串，`%f` 用于浮点数等。
		//可以在格式化字符串中插入变量，这些变量将被相应地格式化。
		      int number = 10;
		      double decimal = 10.5;
		      String text = "Hello";
		      System.out.printf("The number is: %d\n", number); // 输出：The number is: 10
		      System.out.printf("The decimal is: %.2f\n", decimal); // 输出：The decimal is: 10.50
		      System.out.printf("Concatenating strings: %s %s\n", text, "World"); // 输出：Concatenating strings: Hello World
		      /*-
		  		print() 适用于输出不希望换行的文本，
		  		println() 适用于输出需要换行的文本，
		  		printf() 适用于需要格式化输出的情况。

*/
	}
}

