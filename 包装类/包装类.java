package 包装类;

import java.lang.annotation.Native;
/*
 java.lang.Object
   ├── java.lang.String     // 不可变字符序列
   └── java.lang.Number    // 数值类型基类
         └── java.lang.Integer  // int的包装类 
 */
public class 包装类 {
	public static void main(String[] args) {
		/*
		 数字包装类
		 	Atomicinteger
			AtomicLong
			BigDecimal
			Biginteger
			Double
			Float
			Integer
			Long
		 */
//把基本数据类型转换包装类型
		
		//两种创建方法
		Integer i =new Integer(10);
		Integer j =Integer.valueOf(10);
		/*
		  第一种创建方法：new Integer(int value);
		  
          ------------------------------------------------------------------------------
          源码：
		  private final int value;
		  public Integer(int value) {
		  this.value = value;
		  }
		  ------------------------------------------------------------------------------
		   在堆区开辟空间，储存value值，传到常量value常量中
		  第二种创建方法：nteger.valueOf(int i);
		  ------------------------------------------------------------------------------
		  源码：
		  public static Integer valueOf(int i) {
        		if (i >= IntegerCache.low && i <= IntegerCache.high)
            		return IntegerCache.cache[i + (-IntegerCache.low)];
        				return new Integer(i);
    			}
 		  ------------------------------------------------------------------------------
    		相比第一种创建方法，第二种创建方法多了if判断语句，最终return返回到构造函数(第一种方法)开辟空间储存其值
    		这if语句其实是：
    	检查缓存（如果启用了缓存的话），如果缓存中有相应的值，则直接返回缓存中的对象，否则创建一个新的Integer对象并将其添加到缓存中。
    	从Java 5开始，Integer类开始使用缓存机制来存储一定范围内的整数值（-128到127）。
    	这意味着在这个范围内的整数值，使用Integer.valueOf方法创建的对象会复用缓存中的对象，从而节省内存。
		 */
//把包装类型转换基本数据类型
		int c =i.intValue();
		int d =j.intValue();
		/*
		 ------------------------------------------------------------------------------
		  源码：
		 	public int intValue() {
        			return value;
    		}
    	 ------------------------------------------------------------------------------
    	 返回值是<private final int value;>也就是说通过Integer类进行创建后在通过Number抽象类进行实现的类返回给基本数据类型
		 */

//把字符串转换包装类
		Integer s =Integer.valueOf("123");
		Integer s1 =new Integer("321");
		Integer s2 =Integer.parseInt("111");
		/*
		 ------------------------------------------------------------------------------
		 源码(s)：
		   public static Integer valueOf(String s) throws NumberFormatException {
        			return Integer.valueOf(parseInt(s, 10));
    		}
		 ------------------------------------------------------------------------------
		  ------------------------------------------------------------------------------
		 源码(s1)：
		   public Integer(String s) throws NumberFormatException {
        			this.value = parseInt(s, 10);
    			}
		 ------------------------------------------------------------------------------
		  ------------------------------------------------------------------------------
		 源码(s2)：
		  public static int parseInt(String s) throws NumberFormatException {
        			return parseInt(s, 10);
   			}
		 ------------------------------------------------------------------------------
		 */
//把包装类转换字符串
		String ss =s.toString();
		/*
		 ------------------------------------------------------------------------------
		 源码(ss)：
		  public String toString() {
        		return toString(value);
    		}
		 ------------------------------------------------------------------------------
		 */
		
//创建最大常量
		System.out.println(Integer.MAX_VALUE);
		/* @Native public static final int   MIN_VALUE = 0x80000000;
    		@Native public static final int   MAX_VALUE = 0x7fffffff;
		 */
	}
}
