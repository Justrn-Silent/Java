package 框架_容器_ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class Collection接口_List接口_ArrayList常用方法 {
	public static void main(String[] args) {
		Collection<String> c =new ArrayList<>();//ArrayList继承于Collection
		c.add("123");
		c.add("321");
		
		System.out.println(c); //关于toString方法在在Collection的实现类里面，即AbstractCollection
		System.out.println(c.size()); //返回容器里面多少个元素
		System.out.println(c.isEmpty()); //返回容器里面是否为空(true/false)
System.out.println("--------------------------------------------------------");		
		c.remove("123"); //remove并不是删除对象，是在ArrayList类里抹除对象地址，而原数据空间还存在堆内存中！
		//remove底层逻辑相对移动于覆盖的意思
		System.out.println(c); //关于toString方法在在Collection的实现类里面，即AbstractCollection
		System.out.println(c.size()); //返回容器里面多少个元素
		System.out.println(c.isEmpty()); //返回容器里面是否为空(true/false)
System.out.println("--------------------------------------------------------");		
		c.clear();//clear() 和 remove() 本质都是解除容器对对象的引用（“抹除内存地址”），而不是直接删除数据本身。
		
		System.out.println(c); //关于toString方法在在Collection的实现类里面，即AbstractCollection
		System.out.println(c.size()); //返回容器里面多少个元素
		System.out.println(c.isEmpty()); //返回容器里面是否为空(true/false)
System.out.println("--------------------------------------------------------");		
		c.add("123");
		c.add("321");
		Object O []= c.toArray(); //返回Object数组
		
		System.out.println(O[0]);
System.out.println("--------------------------------------------------------");		
		c.add("123");
		c.add("321");
		
		System.out.println(c.contains("123"));  //判断数据是否包含在容器里面(底层机制是equals方法)
	}
}
