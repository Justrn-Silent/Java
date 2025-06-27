package 面向对象_继承;
/*
1,父类也称作超类、基类、派生类等。
2Java中只有单继承，没有像C++那样的多继承，多继承会引起混乱，使得继承链过于复杂，系统难于维护。
3.Java中类没有多继承，接口有多继承
4.子类继承父类，可以得到父类的全部属性和方法 (除了父类的构造方法)，但不见得可以直接访问(比如，父类私有的属性和方法)。
-------------------------
子类的构造方法会自动调用父类的构造方法，是因为Childs 的构造方法内部会自动调用 super() 来调用 p 类的构造方法
前提是因为父类是无参构造方法所以Childs 可以隐式通过super()自动调用
-------------------------
5.如果定义一个类时，没有调用extends，则它的父类是:java.lang.Object
 (Ctrl+T)父类：Object-->子类：P---->子类：Child
 instanceOf关键字：
 用于判断两个类之间是否是子父关系或者接口
 */
class p {
    static int staticVar = 1;
  int instanceVar = 2;
  	p (){
  		System.out.println("子类无法调用");
  	}
}


class Childs extends p {
   void someMethod() {
       Childs.staticVar = 3; 
   }
} 
public class Extend_继承 {
	public static void main(String[]args) {
		Childs s1 = new Childs();  //子类
		p s2 = new p(); //父类
		 //Childs.p(); 无法调用父类的构造方法
		System.out.println(s1 instanceof p);
		System.out.println(new Childs() instanceof p);	
		//new Childs() instanceof p这条语句，因为new Childs() 创建匿名实例所以运行这条语句的时候其实也调用了Childs()构造方法
		//同时父类是无参构造方法所以Childs 可以隐式通过super()自动调用，所以打印了子类无法调用语句
		System.out.println(s1 instanceof Object);
		System.out.println(s2 instanceof Object);
		// 引用类型 instanceof 类名
	}
}
