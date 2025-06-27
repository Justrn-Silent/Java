package String_基础;
/*
1. String类又称作不可变字符序列。
2.String位于java.lang包中，Java程序默认导入java.lang包下的所有类
3.Java字符串就是Unicode字符序列，例如字符串“Java”就是4个Unicode字符'J','a','v','a',组成的。
4.Java没有内置的字符串类型,而是在标准Java类库中提供了一个预定义的类String，每个用双引号括起来的字符串都是String类的一个实例。
*/
public class String类_常量池_字符串比较 {
		public static void main(String[] args) {
			String s =""; //为了节省内存，虚拟机会将s与s1的引用指向同一个内存空间，这个空间开辟在静态区(常量池)
			String s1 = "";
			String s2 = new String("");//由于new所以虚拟机会在堆区额外开辟空间
			String s3 = ""+12;
			//字符串会比main先初始化也就是在虚拟机加载类的时候初始化常量字符串到常量池
			System.out.println(s==s1);  //true
			System.out.println(s1==s2); //false
			System.out.println(s.equals(s1)); //true
			System.out.println(s1.equals(s2)); //true
		}
		 
		 }


