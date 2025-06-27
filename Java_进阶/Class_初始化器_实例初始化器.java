package Java_进阶;
/*
### 类初始化器（Class Initializer）
类初始化器是指在类中定义的静态初始化块（static initialization block）。
这些块在类加载到JVM时执行，并且只执行一次。
它们通常用于初始化类的静态变量，或者在类被加载到内存中时执行一些初始化工作。
- **位置**：类初始化块必须位于类的声明部分，在类体中，但不在任何方法或构造函数中。
*/

/*### 实例初始化器（Instance Initializer）
实例初始化器是指在类的构造函数中定义的非静态初始化块。
这些块在创建类的每个新实例时执行。每个实例都会运行自己的实例初始化块。
- **位置**：实例初始化块必须位于构造函数内部，但不在任何方法中。
创建方法有两种：
1，构造函数
2，{........}
*/
 class Initializer{
		int a ;
		{	
			a=10;
			System.out.println("实例初始化器"+a);
		}
		public Initializer() {
			// TODO 自动生成的构造函数存根
			System.out.println("构造函数来进行实例初始化器");
		}
}
public class Class_初始化器_实例初始化器 {
	 static int Initializer;
		static {
			Initializer=10;
			System.out.println("类初始化器"+Initializer);
			
		}
	public static void main(String[]args) {
					Initializer Class = new Initializer();
				/*
				 运行结果：：
				 	类初始化器10
					实例初始化器10
					构造函数来进行实例初始化器
					
				 从运行结果不妨看出
				 	类初始化器是在虚拟机内初始化，所以无需构造实例
				 */
	}
	
}
