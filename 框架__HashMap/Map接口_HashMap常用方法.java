package 框架__HashMap;

import java.util.HashMap;
import java.util.Map;

/*
 现实生活中，经常需要成对存储某些信息。比如，我们使用的微信，一个手机号只能对应--微信账户。
 这就是一种成对存储的关系。
Map就是用来存储“键(key)-值(value)对”的。
Map类中存储的“键值对”通过键来标识，所以“键对象”不能重复。
Map 接囗的实现类有HashMap、TreeMap、HashTable、Properties等

		方法										说明
Object put(Object key, Object value)   			存放键值对
Object get(Object key)						通过键对象查找得到值对象
Object remove(Object key)				 	删除键对象对应的键值对
boolean containsKey(Object key)				Map容器中是否包含键对象对应的键值对
boolean containsValue(Object value)			Map容器中是否包含值对象对应的键值对
int size()									包含键值对的数量
boolean isEmpty()								Map是否为空
void putAll(Map t)							将t的所有键值对存放到本map对象
void clear()									清空本map对象所有键值对

  */
public class Map接口_HashMap常用方法 {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();   //public interface Map<K, V> {}
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		System.out.println("打印HashMap所有数据："+m);
		System.out.println("获取数据："+m.get(1));
		System.out.println("获得键值对数量："+m.size());
		System.out.println("判断Map是否为空："+m.isEmpty());
		System.out.println("判断是否存在这个键："+m.containsKey(1));
		System.out.println("判断是否存在这个值："+m.containsValue("one"));
		System.out.println("-------------注意Map里边数据的键不能重复否者会被覆盖--------------");
		m.put(3, "三");
		System.out.println(m);
	}
}
