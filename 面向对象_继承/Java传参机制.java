package 面向对象_继承;

/*
Java中，方法中所有参数都是“值传递”，也就是“传递的是值的副本”也就是说，我们得到的是“原参数的复印件，而不是原件”。
因此，复印件改变不会影响原件。·基本数据类型参数的传值
传递的是值的副本。副本改变不会影响原件。
引用类型参数的传值
传递的是值的副本。但是引用类型指的是“对象的地址”。
因此，副本和原参数都指向了同一个“地址”，改变“副本指向地址对象的值，也意味着原参数指向对象的值也发生了改变”
*/
class 传参{
	String name;
	void 传参01(传参 c1) {
		c1.name="123";
	}
	void 传参02(传参 c2) {
		c2 = new 传参();
		c2.name="132";
		System.out.println("c2传参"+c2.name);
	}
}
public class Java传参机制 {
	public static void main(String[] args) {
		传参 c = new 传参();
		c.name="321";
		System.out.println(c.name);
		c.传参01(c);
		System.out.println(c.name);
		c.传参02(c);
		System.out.println(c.name);
		
	}
}
