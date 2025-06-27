package 框架_容器_ArrayList;
/*数组就是一种容器,可以在其中放置对象或基本类型数据

数组的优势:
是一种简单的线性序列，，可以快速地访问数组元素，效率高。如果从效率和类型检查的角度讲，数组是最好的

数组的劣势:
不灵活。容量需要事先定义好，不能随着需求的变化而扩容。
比如:我们在一个用户管理系统中，要把今天注册的所有用户取出来那么这样的用户有多少个?我们在写程序时是无法确定的。
因此，在这里就不能使用数组
*/
/*
<<interface>>
Collection{
		<<interface>>Set（没顺序不可重复）--->HashSet
		<<interface>>List（有顺序可重复）---->{ArrayList  LinkedList}
}
<<interface>>
Map{
	HashMap 
}
*/
//Object 是所有类的根类（基类），因此它可以存储任何对象，包括字符串和其他类的实例。这是 Java 继承和多态的核心机制
/*
java.lang.Object
  ├── java.lang.String     // 不可变字符序列
  └── java.lang.Number    // 数值类型基类
        └── java.lang.Integer  // int的包装类 
*/
public class 容器_Collection_集合 {

	public static void main(String[] args) {
		Obj oo =new Obj();
			String a ="123";
			int i =123;
			Integer I =321;
			oo.set(a, 0);
			oo.set(a, 1);
			oo.set(I, 2);
			System.out.println((String)oo.get(0));
			System.out.println((Integer)((Number)((Object)oo.get(1))));  
			System.out.println((Integer)oo.get(2));//int强制转换为包装类然后转换为Integer
	}
}
	class Obj{
	private 	Object op[] = new Object[10];
	void set(Object o,int index) {
			op[index]=o;
	}
	Object get(int index) {
		return op[index];
	}
}


