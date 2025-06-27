package 多线程_并发;
class A{
	
}
class B{
	
}
class A_1 implements Runnable{
	static A a =new A();
	static B b =new B();

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("线程一")) {
			
		synchronized (a) {
			
			System.out.println("获取a:"+Thread.currentThread().getName());
			
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
			
		synchronized (b) {
			System.out.println("获取b:"+Thread.currentThread().getName());
		}
	}
//-----------------------------------------------------------------------------------------------------\\
		}else {
			synchronized (b) {
				
				System.out.println("获取b:"+Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			
			synchronized (a) {
				System.out.println("获取a:"+Thread.currentThread().getName());
			}//A锁的收尾
		}  //B锁的收尾		
			
	}
	/*
	 产生死锁的原因是锁套锁
	 同时进行：：
	 线程一---->>拿A锁--->>未释放A锁的同时访问B锁
	 线程二---->>拿B锁--->>未释放B锁的同时访问A锁
	 从而死锁
	 解决办法是访问B/A锁时候释放A/B锁
	 取消锁套锁移动每个锁的synchronized作用域
	 */	
		
} 
}
public class 并发_死锁_产生与解决 {
	public static void main(String[] args) {
		A_1 t =new A_1();
		Thread tr =new Thread(t,"线程一");
		tr.start();
		Thread tr1 =new Thread(t,"线程二");
		tr1.start();
	}
}
