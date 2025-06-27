package Java_基础;

public class Variable_02 {
	public static void main(String[]args) {
		//final修饰变量为常量
		final int a1 =11;
		//a1=12; 会报错
		
		
		//数据类型
		/*
序号	数据类型		解释	 	位数	 默认值	 	 举例说明
1		byte		  位(整形)		 8		  0	 		byte b = 10; 					 (1字节)
2		short			短整型		16		  0			short s = 10;					 (2字节)
3		int				整数		32		  0			int i = 10;						 (4字节)
4		long				长整型		64		  0			long l = 10l;  //注意要加L		 (8字节)
--------------------------------------------------------------------------------------------------
5		float			单精度		32		 0.0		float f = 10.0f; //注意要加F
6		double			双精度		64		 0.0		double d = 10.0;
--------------------------------------------------------------------------------------------------
7		char				字符		16		  空		char c = 'c';
--------------------------------------------------------------------------------------------------
8		boolean			布尔	 	 8		 flase		boolean b = true;
		 */
	char e;
	e='a';
	System.out.println(e);
	System.out.printf("%d\n",(int)e);
		
		
		//类型转换，范围：byte,short,char -> int -> long -> float -> double 
		//隐式转换and强制转换：
		short a =10;
		int b =a; //隐式转换
		long c =100;
		int d =(int) c; //强制转换
		System.out.println(b);//隐式转换
		System.out.println(d);//强制转换
	}
}
