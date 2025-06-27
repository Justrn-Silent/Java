package 框架_容器_ArrayList;
/*
 *手动创建ArrayList 
 * 
 */
public class 手工实现ArrayList1_最简化方式_增加泛型 {
	public static void main(String[] args) {
		Arr r = new Arr();
		r.add("123");
		r.add("323");
		System.out.println(r);
	}
}
class Arr{
	private Object obj[];
	private int count;
	private final int INDEX =10;
		public Arr() {
			obj = new Object[INDEX];
		}
		public Arr(int index) {
			obj = new Object[index];
		}
	public void add(Object o) {
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
//------------------------------------------------
//		 for(int i=0;i<=count-1;i++) {
//				s.append(obj[i]+",");
//		}
//		 	s.setCharAt(s.length()-1,']');
//------------------------------------------------
		return s.toString();
	}
}
