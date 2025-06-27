package 框架_容器_ArrayList;

import java.util.ArrayList;
import java.util.List;

/*ArrayList底层是用数组实现的存储。
 特点:查询效率高，增删效率低，线程不安全。我们一般使用它。
 
 数组长度是有限的，而Arraylist是可以存放任意数量的对象，长度不受限制，那么它是怎么实现的呢?
*/
public class ArrayList_底层JDK源码解读 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		/*ArrayList方法有ArrayList()于ArrayList(int initialCapacity)两种方法
		 当是前者时ArrayList最大储存量只有10
		 private static final int DEFAULT_CAPACITY = 10;
		 后者根据传参来控制容量
		 当调用add进行传入数据时会进行if判断，当容量满时会进行自动扩容
		 */
	}
}
