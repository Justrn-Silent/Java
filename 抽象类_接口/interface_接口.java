package 抽象类_接口;
/*
 为什么需要接口?接口和抽象类的区别?
接口就是比“抽象类”还“抽象”的“抽象类”，可以更加规范的对子类进行约束。
全面地专业地实现了:规范和具体实现的分离。
抽象类还提供某些具体实现，接口不提供任何实现，接口中所有方法都是抽象方法。
接口是完全面向规范的，规定了一批类具有的公共方法规范。
从接口的实现者角度看，接口定义了可以向外部提供的服务，
从接口的调用者角度看，接口定义了实现者能提供那些服务。
接口是两个模块之间通信的标准，通信的规范。
如果能把你要设计的模块之间的接口定义好，就相当于完成了系统的设计大纲，剩下的就是添砖加瓦的具体实现了。
做系统时往往就是使用“面向接口”的思想来设计系统。
接口和实现类不是父子关系，是实现规则的关系。
比如:定义一个接口Runnable，Car实现它就能在地上跑，Train实现它也能在地上跑，飞机实现它也能在地上跑。
就是说，如果它是交通工具就一定能跑，但是一定要实现Runnable接口,

接口的本质探讨：
接口就是规范，定义的是一组规则，体现了现实世界中“如果你是..则必须能.”的思想。
如果你是天使，则必须能飞。如果你是汽车，则必须能跑。如果你是好人，则必须能干掉坏人;如果你是坏人，则必须欺负好人。
接口的本质是契约，就像我们人间的法律一样。
制定好后大家都遵守面向对象的精髓，是对对象的抽象，最能体现这一点的就是接口。
为什么我们讨论设计模式都只针对具备了抽象能力的语言(比如C++、Java、C#等),就是因为设计模式所研究的，实际上就是如何合理的去抽象。
 */
/*
 声明格式
 [访问修饰符] interface 接口名[extends 父接口1，父接口2..]{
常量定义;
方法定义;
}
定义接口的详细说明:
1.访问修饰符:只能是public或默认,
2.接口名:和类名采用相同命名机制。
3.extends:接口可以多继承,
4.常量:接口中的属性只能是常量，总是public static final 修饰。不写也是。”
5.方法:接口中的方法只能是:public abstract。省略的话，也是public abstract。
*/

 interface interface接口 {
		/*public static final*/ int OLD=100;
		/*public abstract*/ void s();
	
}
class 子类1 implements interface接口{
	@Override
	public void s() {
		System.out.println("接口被调用"+OLD);
		System.out.println("▇");
	}
	
}
public class interface_接口{
public static void main(String[] args) {
	子类1 s = new 子类1();
	s.s();
	
}
}
