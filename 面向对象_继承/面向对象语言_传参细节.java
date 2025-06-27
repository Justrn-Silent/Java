package 面向对象_继承;

public class 面向对象语言_传参细节 {

static int aa (int n) {
	System.out.println("形参："+Integer.toHexString(System.identityHashCode(n)));
	n =100;
	System.out.println("形参改变后："+Integer.toHexString(System.identityHashCode(n)));
		return 0;
	}
	public static void main(String[] args) {
		int a =55;
		System.out.println("实参："+Integer.toHexString(System.identityHashCode(a)));
		aa(a);
	}
}
/*
### Java 和 C 的传参机制
- **Java**：Java 在传递基本数据类型时，确实是通过值传递，这意味着传递的是数据的副本。
对于对象，Java 传递的是引用的副本，而不是对象本身。这个引用的副本是内存地址的拷贝，但并不是对象内容的拷贝。
因此，虽然两个方法参数可能指向同一个对象，但它们并不共享对象的状态。
- **C**：C 语言同样使用值传递来传递基本数据类型，对于结构体（structs）和联合体（unions）等复合数据类型，也是通过值传递，
传递的是结构体或联合体的副本。对于指针（pointers），C 语言传递的是指针的值，也就是内存地址。
这意味着如果函数内部修改了指针指向的内容，原始指针所指向的内容也会改变，但指针本身并不被修改。

### Python 的传参机制

- **Python**：Python 在传递不可变对象（如整数、浮点数、字符串、元组）时，是通过值传递，
传递的是数据的副本。但对于可变对象（如列表、字典、集合等），Python 实际上是通过引用传递，传递的是对象引用的副本。
这意味着多个变量可以持有同一个对象的引用，并且对任何一个变量的修改都会反映在原始对象上。

### 总结

以下是 Java、C 和 Python 在传参时的对比：

- **Java**：基本数据类型通过值传递，对象通过引用的副本传递（引用拷贝）。
- **C**：基本数据类型和复合数据类型（如结构体和联合体）通过值传递，指针通过值传递（内存地址的拷贝）。
- **Python**：不可变对象通过值传递，可变对象通过引用的副本传递。

因此，可以说 Java 和 C 在传参时都是通过临时拷贝来传递数据
而 Python 对于可变对象是通过引用的副本来传递，这导致多个变量可以指向同一个对象。
这种差异导致了不同的语言在处理参数和对象状态时的不同行为。*/