package 内部类;
/*
1 内部类
内部类是一类特殊的类，指的是定义在一个类的内部的类。实际开发中，为了方便的使用外部类的相关屈性和方法，这时候我们通常会定义一个内部类。

2 内部类的概念
一般情况，我们把类定义成独立的单元。有些情况下，我们把一个类放在另一个类的内部定义，称为内部类(innerclasses)。
内部类可以使用 public、default、protected、private 以及 static 修饰。而外部顶级类(我们以前接触的类)只能使用 public 和 default 修饰。
注意:
内部类只是一个编译时概念，一旦我们编译成功，就会成为完全不同的两个类。
对于一个名为 Outer 的外部类和其内部定义的名为Inner 的内部类。
编译完成后会出现 Outer.class 和Outer$Inner.class 两个类的字节码文件。
所以内部类是相对独立的一种存在,其成员变量/方法名可以和外部类的相同。
*/
public class 内部类 {
	public static void main(String[] args) {
		外部类.内部类 nw = new 外部类().new 内部类();
		nw.n();
	}
}
class 外部类{
	String n ="外部类";
	class 内部类{
		void n() {
			String n ="内部类";
		System.out.println(n+"调用"+外部类.this.n);
		}	
	}
}
/*
 内部类的作用:
内部类提供了更好的封装。只能让外部类直接访问，不允许同一个包中的其他类直接访问。
内部类可以查接访问外部类的私有属性，内部类被当成其外部类的成员。但外部类不能访问内部类的内部属性。
*/