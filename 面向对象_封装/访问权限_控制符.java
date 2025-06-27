package 面向对象_封装;
/*
 Java中4种“访问控制符”分别为private、default、protected、public，它们说明了面向对象的封装性
 所以我们要利用它们尽可能的让访问权限降到最低，从而提高安全性。
			同一个类		同一个包中			子类(继承想访问的类)			所有类   ----->都要创建对应的实例与包的引入
private         yes              no               no              				no
default         yes              yes              no              				no
protected      yes              yes              yes              				no
public          yes              yes              yes              				yes
 */
//测试private
class Pre{
	private int a =11;
	void P() {
		System.out.println(a);
	}
}
public class 访问权限_控制符 {
	public static void main(String[] args) {
	Pre s1 =new Pre();
	s1.P(); //无修饰
	//s1.a=11;  //The field Pre.a is not visible
	}
}
