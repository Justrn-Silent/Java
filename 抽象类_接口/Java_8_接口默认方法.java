package 抽象类_接口;
/*
接口中定义静态方法和默认方法(JDK8 以后)
JAVA8 之前，接口里的方法要求全部是抽象方法，JAVA8(含 8)之后，以后允许在接口里定义默认方法和类方法。
1.默认方法
Java8及以上旧版本,允许给接口添加一个非抽象的方法实现
只需要使用 default 关键字即可，这个特征又叫做默认方法(也称为扩展方法)。

默认方法和抽象方法的区别是抽象方法必须要被实现，默认方法不是。
作为替代方式接口可以提供默认方法的实现，所有这个接口的实现类都会通过继承得到这个方法。
极少数用到！！！
*/
public class Java_8_接口默认方法 {
	public static void main(String[] args) {
		接口2 ss = new 子类接口2();
		ss.son();
	}
	
}
interface 接口2{
	default void son() {
		System.out.println("接口默认方法");
	}
}
class 子类接口2 implements 接口2{
	//也可以重写
	public void son() {
		System.out.println("接口默认方法被重写");
	}
}


