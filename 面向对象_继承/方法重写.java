package 面向对象_继承;

/*
方法的重写需要符合下面的三个要点:
“==”:方法名、形参列表相同,
“<=”:返回值类型和声明异常类型，子类小于等于父类。
“>=”:访问权限，子类大于等于父类，
 */
class FF{
	void F1() {
		System.out.println("F1");
	}
	void F2() {
		System.out.println("F2");
	}
	p F3() {
		return new p();//p类接收的是对象
	}
}
class F_son extends FF{
	void F1() {
		System.out.println("F1_son");  //方法重构,覆盖父类方法
	}
	Childs/*Object*/ F4() {//只能重写p类的子类，不能重写Object
		return new Childs();
		/*
		 也可以这样写：
		 p F4(){
		 	return new p();
		 }
		 */
	}
	
}
public class 方法重写 {
	public static void main(String[] args) {
		F_son s = new F_son();
		s.F1();//子类方法重构
		
	}
}
/*
继承关系：
当前文件：Object--->F--->F_son
其他文件：Object--->P--->Childs
所以：返回值类型，子类小于等于父类。
 */
