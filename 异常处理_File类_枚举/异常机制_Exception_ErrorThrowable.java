package 异常处理_File类_枚举;
/*
软件程序在运行过程中，非常可能遇到问题，我们称之为异常英文是Exception意思是：例外
异常机制本质就是当程序出现错误，程序安全退出的机制。

---------------------------------------------------------------------------------------------------------------------
Java是采用面向对象的方式来处理异常的。处理过程
1.抛出异常:在执行一个方法时，如果发生异常，则这个方法生成代表该异常的一个对象，停止当前执行路径并把异常对象提交给JRE。
2.捕获异常:JRE得到该异常后，寻找相应的代码来处理该异常。
JRE在方法的调用栈中查找，从生成异常的方法开始回溯，直到找到相应的异常处理代码为止。

----------------------------------------------------------------------------------------------------------------------
异常分类：
JDK 中定义了很多异常类，这些类对应了各种各样可能出现的异常事件，所有异常对象都是派生于Throwable类的一个实例。
如果内置的异常类不能够满足需要，还可以创建自己的异常类。
Java对异常进行了分类，不同类型的异常分别用不同的Java类表示，所有异常的根类为java.lang.Throwable,Throwable下面又派生了两个子类:Error和Exception。
Java异常类的层次结构：
Throwable<--继承--Error<--继承---UncheckedException
	^|
	 |---继承---Exception<----继承----ChockodException
	 				^|
					 |----继承------RuntimeException<-----继承-----UncheckedException

	
Error(属于Java.lang包)：一般不会出现error，出现一般重启虚拟机
Error是程序无法处理的错误，表示运行应用程序中较严重问题。
大多数错误与代码编写者执行的操作无关，而表示代码运行时 JM(ava 虚拟机)出现的问题。
例如，Java虚拟机运行错误(VirtualMachineError)，当JM 不再有继续执行操作所需的内存资源时,将出现 OutOfMemoryError。
这些异常发生时，Java虚拟机(JVM)一般会选择线程终止。
Error表明系统JVM已经处于不可恢复的崩溃状态中。我们不需要管它


RuntimeException:一般逻辑报错

-----------------------------------------------------------------------------------------------------------------------
Error与Exception的区别
1.我开着车走在路上，一头猪冲在路中间，我刹车。这叫一个异常
2.我开着车在路上，发动机坏了，我停车，这叫错误。系统处于不可恢复的崩溃状态。
发动机什么时候坏?我们普通司机能管吗?不能。发动机什么时候坏是汽车厂发动机制造商的事。

------------------------------------------------------------------------------------------------------------------------
Exception是程序本身能够处理的异常
如:空指针异常(NullPointerException)
数组下标越界异常(ArrayIndexOutOfBoundsException)
类型转换异常(ClassCastException)
算术异常(ArithmeticException)等。

Exception类是所有异常类的父类，其子类对应了各种各样可能出现的异常事件。 通常Java的异常可分为:
1.RuntimeException 运行时异常
2.CheckedException 已检查异常
 */
public class 异常机制_Exception_ErrorThrowable {
	public static void main(String[] args) {
		int a =1/0;
		System.out.println(a);
		/**
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at 异常处理_File类_枚举.异常机制_Exception_ErrorThrowable.main(异常机制_Exception_ErrorThrowable.java:54)
		 */
	}
}
