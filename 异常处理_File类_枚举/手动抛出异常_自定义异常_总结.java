package 异常处理_File类_枚举;
/*
 1.在程序中，可能会遇到JDK提供的任何标准异常类都无法充分描述清楚我们想要表达的问题
 这种情况下可以创建自己的异常类，即自定义异常类。
2.自定义异常类只需从Exception类或者它的子类派生一个子类即可。
3.自定义异常类如果继承Exception类，则为：受检査异常，必须对其进行处理;如果不想处理
可以让自定义异常类继承：运行时异常RuntimeException类。
4.习惯上，自定义异常类应该包含2个构造器:一个是默认的构造器,另一个是带有详细信息的构造器
 */

//自定义异常
/**IllegalAgeException:非法年龄异常，继承Exception类*/
//class IllegalAgeException extends Exception{//默认构造器
//	public IllegalAgeException(){
//	}
//	//带有详细信息的构造器，信息存储在message中
//	public IllegalAgeException(String message){
//		super(message);
//	}
//	
//	}

class IllegalAgeException extends RuntimeException {  //运行时检查异常
	public IllegalAgeException(){
}
public IllegalAgeException(String msg){
	super(msg);
}
}
public class 手动抛出异常_自定义异常_总结 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-10);
	}
}

class Person {
	private int age;
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age<0){
		throw new IllegalAgeException("年龄不能为负数");
	}
	this.age=age;
}
}



/*
 使用异常机制的建议
1.要避免使用异常处理代替错误处理这样会降低程序的清晰性，并且效率低下
2.处理异常不可以代替简单测试---只在异常情况下使用异常机制。
3.不要进行小粒度的异常处理---应该将整个任务包装在一个try语句块中,
4.异常往往在高层处理(先了解!后面做项目会说!)。
 */
