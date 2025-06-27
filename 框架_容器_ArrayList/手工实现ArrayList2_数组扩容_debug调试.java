package 框架_容器_ArrayList;
/*
 * 数组扩容
 */

public class 手工实现ArrayList2_数组扩容_debug调试 {
	public static void main(String[] args) {
		Array<String> ar = new Array<>();
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		System.out.println(ar);
	}
}
class Array<E>{
	private Object obj[];
	private int count;
	private static int INDEX =10;
		public Array() {
			obj = new Object[INDEX];
		}
		public Array(int index) {
			obj = new Object[index];
		}
	public void add(E o) {
		if(count==obj.length) {
			Object o1[] =new Object[obj.length+(obj.length>>1)]; //优先级问题
			System.arraycopy(obj, 0, o1,0, obj.length);
			obj=o1;
		}
		obj[count]=o;
		count++;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		StringBuilder s =new StringBuilder();
		s.append("[");
		for(int i=0;i<=count-1;i++) {
			if(i!=count-1) {
				s.append(obj[i]+",");
			}else {
			s.append(obj[i]);
			}
		}
		s.append("]");
		return s.toString();
	}
}