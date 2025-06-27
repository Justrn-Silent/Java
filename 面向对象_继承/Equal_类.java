package 面向对象_继承;

public class Equal_类 {
	//“==”代表比较双方是否相同。如果是基本类型则表示值相等，如果是引用类型则表示地址相等即是同一个对象，
	//equal()方法是判断两个对象是否相等
	//在Object的equals()中其实判断的是两个引用类型的地址是否相同
	//但是equals()方法经常会被重写
	/*
equals() 方法在不同类型的情况下确实有不同的判断方式。
对于字符串（String）：
在Java中，String 对象是不可变的，这意味着一旦创建了String对象，它的内容就不会改变。
String 类的 equals() 方法是重写自Object类的，并且它是用来比较两个字符串对象的“值”是否相等，而不是它们的引用地址。
因此，当使用 s1.equals(s2) 来比较两个字符串时，Java会检查两个字符串对象的内容是否相同，而不是它们的内存地址。
对于对象：
对于其他对象类型，equals() 方法默认情况下也是用来比较对象引用的地址，即两个对象是否是同一个实例。
如果没有重写 equals() 方法，那么 obj1.equals(obj2) 会返回 true 当且仅当 obj1 和 obj2 指向同一个对象实例时。
*/
	public int arr;
	public static void main(String[] args) {
		
		Equal_类 s1 = new Equal_类();
		Equal_类 s2 = new Equal_类();
		System.out.println(s1==s2);
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s1.equals(s2));
	}
}

