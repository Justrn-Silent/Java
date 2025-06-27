package Java_进阶;

public class method_重载 {
	static int A(int a,int b,int c) {
		return 0;
	}
	static int A(int a ,int c) {
		return 0;
	}
	static int A(int c) {
		return 0;
	}
	static int A() {
		return 0;
	}
	static int A(float a ,int c) {
		return 0;
	}
	static int A(float a ,double c) {
		return 0;
	}
	static int A(float c) {
		return 0;
	}
	/*
	 方法重载原则：
	 方法名，返回类型可以相同，但形参类型和个数不能相同
	 main方法不能被重载
	 */
}
