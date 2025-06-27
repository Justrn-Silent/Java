package 异常处理_File类_枚举;
/*
 RuntimeException运行时异常
 派生于RuntimeException的异常,如被 0除、数组下标越界、空指针等
 其产生比较频繁，处理麻烦，如果显式的声明或捕获将会对程序可读性和运行效率影响很大。 
 因此由系统自动检测并将它们交给缺省的异常处理程序(用户可不必对其处理)。
 这类异常通常是由编程错误导致的，所以在编写程序时，并不要求必须使用异常处理机制来处理这类异常
 经常需要通过增加“逻辑处理来避免这些异常”
*/
public class 常见异常分类_运行时异常处理 {
	@SuppressWarnings("unused")  //预警解除
	public static void main(String[] args) {
/*------------------------------------------------------------------------*/	
		//RuntimeException(ArithmeticException) 
		int a =0;
		int b =1;
		if(a!=0) {
			System.out.println(b/a);  
			}
/*------------------------------------------------------------------------*/		
		// java.lang.NullPointerException  空指针报错
		String s =null;
		if(s!=null) {
			System.out.println(s.length());
			} 
/*------------------------------------------------------------------------*/	
		//ArrayIndexOutOfBoundsException异常
		int[] arr = new int[5];
		int arr1 =5;
		if(arr1<arr.length) {
		System.out.println(arr[arr1]);
		}
/*------------------------------------------------------------------------*/	
		//ClassCastException异常 ：强制转换错误
		Animal aa =new Dog();
		if(aa instanceof Cat){
			Cat c=(Cat)aa;
		}
/*------------------------------------------------------------------------*/	

				
		
	}
}
	
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
