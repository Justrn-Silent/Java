package 内部类;
/*
定义方式
static class ClassName {
//类体
 }
 
使用要点
1.静态内部类可以访问外部类的静态成员，不能访问外部类的普通成员。
2.静态内部类看做外部类的一个静态成员。
*/
public class 静态内部类 {
	public static void main(String[] args) {
		//通过 new 外部类名,内部类名()来创建内部类对象
		Outer2.Inner2 inner =new Outer2. Inner2();
		inner.test();
	}
}
class Outer2{
	private int a=10;
	private static int b=20;
//相当于外部类的一个静态成员
		static class Inner2{
				public void test(){
						//System.out.println(a);//静态内部类不能访问外部类的普通属性
						System.out.println(b);//静态内部类可以访问外部类的静态属性
				}
		}

	}
//满足this使用规则与堆区与静态区的访问原则

