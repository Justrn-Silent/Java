package 面向对象_继承;
/*
super是直接父类对象的引用。可以通过super来访问父类中被子类覆盖的方法或属性
使用super调用普通方法，语句没有位置限制，可以在子类中随便调用。
若是构造方法的第一行代码没有显式的调用super(..)或者this(..);那么Java默认都会调用super(),【前提：是调用父类的无参数构造方法。】
这里的super()可以省略。
*/
class f{
	int a;
	void f1() {
		System.out.println("父类被调用");
	}
}
class c extends f{
	void c1() {
		super.f1();  //调用父类成员或者普通方法
		super.a=10;
		System.out.println("使用super调用父类");
	}
}
public class super关键字_super的用法 {
	public static void main(String[] args) {
		new c().c1();
	}
}
