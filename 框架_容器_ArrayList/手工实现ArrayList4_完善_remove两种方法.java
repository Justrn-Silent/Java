package 框架_容器_ArrayList;

public class 手工实现ArrayList4_完善_remove两种方法 {
	public static void main(String[] args) {
		Array02<String> ar = new Array02<>();
		ar.add("123");
		ar.add("323");
		ar.add("123");
		ar.add("323");
		System.out.println(ar);
		ar.get(0);
		ar.set(0, "修改");
		ar.get(0);
		ar.set(50, "修改");
		System.out.println(ar);
		ar.remove(0);
		System.out.println(ar);
	}
}
class Array02<E>{
	private Object obj[];
	private int count;
	private static int INDEX =10;
		public Array02() {
			obj = new Object[INDEX];
		}
		public Array02(int index) {
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
	public void remove(int index) {
	obj[index]=null;
//		for(int i=0;i<count-index;i++) {
//			obj[index+i]=obj[index+i+1];	
//		}
		if(index>=0) {
		System.arraycopy(obj, index+1, obj,index, count);
		count--;
		}else {
			System.out.println("Error!!");
		}
	}
	
}
