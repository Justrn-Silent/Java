package Java_进阶;
//---------------------------------------------
//结构：：
		//定义类区域
//public class 文件名{   }
	//定义方法区域
	//静态变量
	//main方法区域
//---------------------------------------------	
/*
--------------------------------------------------------------------------------------------------------------------------
static修饰的字段或方法都是在类创建后在JVM里初始化，在某种情况下初始化会比main方法更快
理解static关键字的重点：：
static修饰任何成员都是在类的情况下才能修饰
static修饰的方法或者字段或者字段都不受对象实例的约束，不管创建多少实例都是调用相同地址的静态方法或者字段
其次的是静态字段或者方法是不需要实例来初始化的，在类创建好之后就初始化了这些静态字段或者静态方法
在类中是允许静态访问静态，当然非静态访问非静态也是需要通过实例方式访问
在类中是不允许静态访问非静态的，因为在非静态的字段或者方法中这些非静态的都是实例去控制，使用当用静态去访非静态时候报错，因为非静态没有实例
但非静态是可以访问静态的，因为在类中如果有静态字段它是可以被非静态方法或者函数所访问，因为静态字段不需要实例来初始化
非静态可以访问非静态，因为


static修饰的字段：：生命周期在某种情况可以说是全局，是可以通过类名直接访问因为static修饰的字段是属于类本身的与实例没关系，当然用实例也是可以的
static修饰的方法：：生命周期在某种情况可以说是全局，同理也是可以用类名直接访问，因为静态方法是属于类本身的，与实例无关，当然用实例也是可以的
注意注意：：修饰字段必须是类级别的，不能修饰方法内的字段，static的作用域是整个类，static修饰的任何东西都属于类本身，所以生命周期和类必须相同
总结来说：
static关键字用于修饰类级别的内容，如静态字段、静态方法、静态初始化块、静态内部类等，而不能用于局部变量、方法参数、方法返回类型或构造器。


注意：：
在类中是可以构造函数的，但构造函数是不能进行static修饰的。
因为构造函数初始化是与实例紧密相连的，初始化构造函数是通过实例进行传参的，所以不可以用static修饰
访问构造函数无需用实例名进行引用访问，当创建了实例且存在构造函数时候，创建的实例就是构造函数的访问

--------------------------------------------------------------------------------------------------------------------------
静态方法或字段不能在类的外部定义，它们必须是类内部声明并且使用 `static` 修饰符。
如果尝试在类外部声明一个 `static` 字段，它将不会属于任何类，而是一个未定义的顶级代码块的成员，这通常是不合法的。
如果尝试在类外部声明一个静态方法，同样会导致编译错误。


static修饰：：
1,静态字段：这些是存储在类级别的变量，它们在所有实例之间共享同一个存储位置。
			这意味着无论你创建多少个类的实例，这些静态变量的值都是相同的。
			
2,静态方法：它们不依赖于类的任何实例。静态方法可以访问静态成员，但它们不能直接访问非静态成员，除非这些非静态成员也是静态的。
			注意：：静态不能访问非静态
			public class MyClass {
    			int nonStaticVar = 20;
    static void staticMethod() {
        // 错误：静态方法不能直接访问非静态变量
        // System.out.println(nonStaticVar);
    	}
	}
		public class Main {
    			public static void main(String[] args) {
        MyClass.staticMethod(); // 这将导致编译错误
    	}
	}
 */

	//静态字段：是可以同过类名直接访问与修改，而且是全局
	class static_1{
		static int aa = 0;
		int cc = 0;
			static_1(int b){//构造函数(构造函数是不能用static修饰的，因为构造函数是与实例紧密相连的)
				System.out.println("static_1_b");
				aa=b;
			}
		 void ab() { //非静态方法
			System.out.println("ab");
		}
	static void ac() { //静态方法
		System.out.println("ac");
		//cc =12;  //报错：静态不能访非静态，需要创建实例
	}
	}
public class Class_变量_Class_方法 {
	public static void main(String[]args) {
		static_1.aa=12;  //静态字段与实例无关
		//创建实例访问方法
		static_1 s = new static_1(13);//访问构造函数：返回static_1_b
		s.ab();
		//无需创建实例
		static_1.ac();
		
	}
}
