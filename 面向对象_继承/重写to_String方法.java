package 面向对象_继承;
/*
 Object类中定义有public String toString()方法,其返回值是 String 类型。Object类中toString
方法的源码为:
	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
*/
public class 重写to_String方法 {
	public static void main(String[] args) {
		重写to_String方法 c = new 重写to_String方法();
		System.out.println(c.toString());
		
	}
	public String toString() {
		return "地址为："+Integer.toHexString(hashCode());
	}
}
