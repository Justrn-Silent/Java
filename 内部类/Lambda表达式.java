package 内部类;

interface AQ {
	void send();
}	
interface QA{
	void send(String S);
}
/*
 1显示实现接口
class a implements AQ{
	public void send() {
		System.out.println("接口被实例化");
	}
}
*/
public class Lambda表达式 {
	public static void main(String[] args) {
		/*
		 1显示实现接口
		AQ s =new a();
		s.send();
		*/
		
		/*
		 2匿名内部类实现接口
		new AQ(){
			public void send() {
				System.out.println("接口被实例化");
			}
		}.send();
		*/
		/*3 Lambda表达式
		
		*/
		AQ s=()->System.out.println("接口被实例化");//函数式接口 Lambda表达式名称 =()->{代码块};
		/*
		 ():传参是传给实现接口后的匿名类中的方法参数
		 {}:当只有一条语句时候花括号可以省略
		 */
		s.send();
		QA s1=(String S)->System.out.println("接口被实例化"+S);
		s1.send("2");
	}
}
/*

Lambda表达式一般用于implements，接口实现，abstract虽然是抽象的
但对于lambda表达式类似于匿名内部类只存在implements实现，不存在继承实现abstract的抽象类

Lambda表达式结合了匿名函数的形式和匿名内部类的特征。(lambda表达式只能实现只有一个抽象方法的接口！！)
匿名函数的特征
1. 无名称：Lambda表达式像匿名函数一样，没有显式的名称。
2. 简写：它们可以以更简洁的方式表达一个简单的函数逻辑，不需要完整的类定义。

匿名内部类的特征
1. 实现接口：Lambda表达式可以用来实现接口，尤其是只有一个抽象方法的函数式接口。
2. 编译时类型检查：Lambda表达式在编译时必须具有确定的类型，这与匿名内部类的编译时类型检查相似。
3. 实例化：Lambda表达式在运行时被实例化为一个匿名内部类的实例，这与匿名内部类的实例化过程类似。

结合的特征
1. 无构造函数：Lambda表达式不需要构造函数，因为它没有类名，这与匿名内部类不同，后者可以有构造函数。
2. 实现接口：Lambda表达式可以用来实现接口，这与匿名内部类相似。
3. 类型推断：Lambda表达式的参数类型可以由编译器推断，而匿名内部类的参数类型需要显式声明。
4. 编译后的形态：尽管Lambda表达式在语法上简洁，但编译后它们会变成一个匿名内部类的实例。
Lambda表达式在语法上提供了匿名函数的简洁性和灵活性，同时在实现上具有匿名内部类的特性，如编译时类型检查和实例化。
 */