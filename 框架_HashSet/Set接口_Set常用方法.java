package 框架_HashSet;

import java.util.HashSet;
import java.util.Set;

/*
 Set接口继承自Collection，Set接口中没有新增方法，方法和Collection保持完全一致。
 我们在前面通过List学习的方法，在Set中仍然适用。因此，学习Set的使用将没有任何难度。
Set容器特点:
无序、不可重复。无序指Set中的元素没有索引，我们只能遍历查找;
不可重复指不允许加入重复的元素。
更确切地讲新元素如果和Set中某个元素通过equals()方法对比为true，则不能加入
甚至，Set中也只能放入一个null元素，不能多个。
Set常用的实现类有:HashSet、TreeSet等，我们一般使用HashSet。
 */
public class Set接口_Set常用方法 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("111");
		s.add("222");
		s.add("111");
		System.out.println(s); //结果：[111, 222]  说明不可重复
		s.remove("222");
		System.out.println(s);
		
		Set<String> set2 = new HashSet<>();
		set2.add("高淇");
		set2.addAll(s);
		System.out.println(set2);
		/*
		 Set没有顺序，不可重复！
		 List有顺序，可重复！
		 
		 HashSet是采用哈希算法实现
		 底层实际是用HashMap实现的(HashSet本质就是一个简化版的HashMap)
		 因此，查询效率和增删效率都比较高。

		 */
	}
}
