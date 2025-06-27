package 多线程;
/*
 静态代理
 公共接口:
1、真实角色
2、代理角色

 */
interface marry{
	void happy();
}
//真实角色
class you_1 implements marry{

	@Override
	public void happy() {
		System.out.println("结婚！");
		
	}
	
}
class agent implements marry{
	private marry m;
	agent (marry m){
		this.m=m;
	}
	@Override
	public void happy() {
		ready();
		System.out.println("代理！");
		this.m.happy();
		stop();
	}
	private void stop() {
		System.out.println("前期布置");
		
	}
	private void ready() {
		System.out.println("后期收尾");
		
	}	
}
public class 多线程_静态代理设计模式 {
	public static void main(String[] args) {
		new agent(new you_1()).happy();
	}
}