package 框架_容器_ArrayList;
/*泛型是JDK1.5以后增加的，它可以帮助我们建立类型安全的集合。*/
public class 泛型概念_自定义泛型 {
/*
 泛型的本质就是“数据类型的参数化”。
 我们可以把“泛型”理解为数据类型的一个<形式参数>占位符(形式参数)
 即告诉编译器，在调用泛型时必须传入实际类型
 我们可以在类的声明处增加泛型列表，如:<T,E,V>。此处，字符可以是任何标识符，一般采用这3个字母
 */
	public static void main(String[] args) {
		Obj_1<String> oo =new Obj_1<>();
			String a ="123";
			oo.set(a, 0);
			System.out.println(oo.get(0));

	}
}
	class Obj_1<E>{
	private 	Object oop[] = new Object[10];
	void set(E o,int index) {
			oop[index]=o;
	}
	@SuppressWarnings("unchecked")
	E get(int index) {
		return (E)oop[index];
	}
}

