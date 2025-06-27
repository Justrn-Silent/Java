package 框架_容器_ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
Iterator iterator()  获得迭代器，用于遍历所有元素
boolean containsAll(Collection c)本容器是否包含c容器中的所有元素
boolean addAll(collection c)将容器c中所有元素增加到本容器
boolean removeAll(collection c)移除本容器和容器c中都包含的元素
boolean retainAll(Collection c)取本容器和容器c中都包含的元素，移除非交集元素

 */
public class ArrayList_操作多个List_并集和交集 {
	public static void main(String[] args) {
		test02();
	}
	public static void test02() {
		List<String> i = new ArrayList<>();
		i.add("aa");
		i.add("bb");
		i.add("cc");
		List<String> ii = new ArrayList<>();
		ii.add("aa");
		ii.add("dd");
		ii.add("ee");
		System.out.println("容器I:"+i);
		System.out.println("容器II:"+ii);
		System.out.println("------------------------");
		i.addAll(ii);
		System.out.println("容器I:"+i);
		System.out.println("容器II:"+ii);
		System.out.println("------------------------");
		i.removeAll(ii);
		System.out.println("容器I:"+i);
		System.out.println("容器II:"+ii);
		System.out.println("------------------------");
		i.retainAll(ii);
		System.out.println("容器I:"+i);
		System.out.println("容器II:"+ii);
		System.out.println("------------------------");
		System.out.println(i.containsAll(ii));
		
		
	}
}
