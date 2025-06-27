package 框架_容器_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_索引和顺序相关方法 {
/*
 List是有序、可重复的容器!些跟顺序(索引)有关的方法参见下表有序:List中每个元素都有索引标记。
 可以根据元素的索引标记(在List中的位置)访问元素，从而精确控制这些元素。
 可重复:List允许加入重复的元素。
 更确切地讲，List通常允许满足 e1.equals(e2)的元素重复加入容器,
 
 List接口常用的实现类有3个:ArrayList(数组)、LinkedList(链表)和Vector(线程).
 */
	public static void main(String[] args) {
		text01();
	}
	public static void text01() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("初始化list："+list);
		list.add(2,"A");
		System.out.println("往下标2插入数据："+list);
		list.remove(2);
		System.out.println("移除下标2插入数据："+list);
		list.set(2, "A");
		System.out.println("替换下标2的数据："+list);
		System.out.println("获取下标2的数据："+list.get(2));
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("B");
		System.out.println("初始化list2："+list2);
		System.out.println("获取数据的索引下标位置："+list2.indexOf("B")); //底层是数组所以按照索引来找，所以是:1
		System.out.println("获取数据E的索引下标位置(不存在返回EOF[-1])："+list2.indexOf("E"));
		System.out.println("获取数据的索引下标位置："+list2.lastIndexOf("B"));//顾名思义last最后开始找
		
	}
}
