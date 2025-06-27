package 内部类;
/*
定义在方法内部的，作用域只限于本方法，称为局部内部类。
局部内部类的的使用主要是用来解决比较复杂的问题 
想创建一个类来辅助我们的解决方案，到那时又不希望这个类是公共可用的，所以就产生了局部内部类。
局部内部类和成员内部类一样被编译，只是它的作用域发生了改变，它只能在该方法中被使用，出了该方法就会失效。
*/
public class 局部内部类_方法内部类 {
	public static void main(String[ ]args){
		new TestLocalInnerClasspublic().show();
	}
}
 class TestLocalInnerClasspublic {
	void show(){
	//作用域仅限于该方法
	class Inner3{
		public void fun(){
		System.out.println("helloworld");
		}
	}
	new Inner3().fun();
	}
}

