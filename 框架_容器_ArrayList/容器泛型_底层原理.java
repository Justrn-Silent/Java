package 框架_容器_ArrayList;

import java.util.List;

public class 容器泛型_底层原理 {
	public static void main(String[] args) {
		List list ;
		/*
		 容器相关类都定义了泛型，我们在开发和工作中，在使用容器类时都要使用泛型。
		 这样，在容器的存储数据、读取数据时都避免了大量的类型判断，非常便捷。
		 public class Test {
			public static void main(String[]args){//以下代码中List、set、Map、Iterator都是与容器相关的接口;
				List<String> list = new ArrayList<String>();
				Set<Man>mans = new HashSet<Man>();
				Map<Integer,Man> maps = new HashMap<Integer, Man>();
				Iterator<Man>iterator =mans.iterator();
				}
			}
			
		通过阅读源码，我们发现Collection、List、Set、Map、Iterator接口都定义了泛型：
		public interface list<E> extends Collection<E>
		// QueryOperations
		------------------------------------------------------- 
		public interface set<E> extends Collection<E>{
		//Query operations
		------------------------------------------------------- 
		public interface Map<K,V>{
		// Query operations
		------------------------------------------------------- 
		public interface Collection<E> extends Iterable<E> {
		------------------------------------------------------- 
		public interface Iterator<E> {
		------------------------------------------------------- 
		因此，我们在使用这些接口及其实现类时，都要使用泛型.
		 */
	}
}
