package String_基础;
/*
StringBuffer和StringBuilder非常类似，均代表可变的字符序列。 
这两个类都是抽象类AbstractStringBuilder的子类,方法几乎一模一样。
 */
public class String_不可变序列_可变序列 {
	public static void main(String[] args) {
//不可变序列
		/*源代码：
		 public final class String implements java.io.Serializable, Comparable<String>, CharSequence,Constable, ConstantDesc {
    	private final byte[] value;   //final定义是常量，赋值后不能修改
    	//省略....
    	 }
		 */
		String s ="abcd";
		System.out.println(Integer.toHexString(s.hashCode()));
		s="123";
		System.out.println(Integer.toHexString(s.hashCode()));;  //获取地址
		/*
	尽管变量s的引用被更新了，指向了不同的字符串对象，但原始的"abcd"对象的内容并没有改变，它的哈希码也没有改变。
    这证明了String对象的不可变性：一个String对象的内容一旦创建就不能被修改，你只能重新赋值给新的字符串对象。 
		 */
//可变序列
		StringBuilder ss =new StringBuilder("111");
		/*
		 源码：
		 abstract sealed class AbstractStringBuilder implements Appendable, CharSequence permits StringBuilder, StringBuffer { 
    			byte[] value; //The value is used for character storage.
     	//省略...
     	 }
		 */
		System.out.println(Integer.toHexString(ss.hashCode()));
		ss.setCharAt(1, 'a');
		System.out.println(Integer.toHexString(ss.hashCode()));
		System.out.println(ss);
		/*
	变量ss被StringBuilder 类修饰赋值后，用setCharAt()方法修改其值，但是对象没有变，修改前与修改后的地址相同，也就是说
	StringBuilder是String的可变序列。
		 */
/*
显然，内部也是一个字符数组，但这个字符数组没有用final修饰，随时可以修改。
因此StringBuilder和StringBuffer称之为“可变字符序列”
区别：：
StringBuffer JDK1.0版本提供的类，线程安全，做线程同步检查，效率较低。
StringBuilder JDK1.5版本提供的类,线程不安全,不做线程同步检査，因此效率较高。 建议采用该类。
 */
	}
}
