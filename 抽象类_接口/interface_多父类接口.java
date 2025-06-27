package 抽象类_接口;

interface F_ONE{
	void F();
	//F_ONE独有属性
	int a=100;
}
interface F_TWO{
	void F2();
}
interface F_THREE{
	void F3();
}
class 子类 implements F_ONE,F_TWO,F_THREE{

	@Override
	public void F3() {
		System.out.println("F3接口被调用");
		
	}

	@Override
	public void F2() {
		System.out.println("F2接口被调用");
		
	}

	@Override
	public void F() {
		System.out.println("F接口被调用");
		
	}
	//子类独有属性
	void C() {
		System.out.println("子类独有属性");
}
}
public class interface_多父类接口 {
	public static void main(String[] args) {
		F_ONE s = new 子类();
		//注意接收限制
		
	}
}
