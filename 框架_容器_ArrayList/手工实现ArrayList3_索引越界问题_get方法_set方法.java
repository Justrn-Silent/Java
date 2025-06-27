package 框架_容器_ArrayList;

public class 手工实现ArrayList3_索引越界问题_get方法_set方法 {
	public static void main(String[] args) {
		Array01<String> ar = new Array01<>();
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
		System.out.println(ar);
		ar.get(0);
		ar.set(0, "修改");
		ar.get(0);
		ar.set(50, "修改");
	}
}
class Array01<E>{
	private Object obj[];
	private int count;
	private static int INDEX =10;
		public Array01() {
			obj = new Object[INDEX];
		}
		public Array01(int index) {
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
	public void get(int index) {
		System.out.println("["+index+"]:"+obj[index]);
		
	}
	public void set(int index,E e) {
		if(index>=0&&index<=count) {
			obj[index]=e;
		}else {
			System.out.println("索引越界！！");
		}
		
		
	}
	
}