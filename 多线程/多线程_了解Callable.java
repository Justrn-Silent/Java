package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class 多线程_了解Callable implements Callable<Object>{
	private int num =100;
	@Override
	public Object call() throws Exception {
		while(true) {
			if(num<=0) {
				break;
			}
			try {
				Thread.sleep(200);  //测试并发
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---->>"+num--);
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());  //获取当前正在执行的线程的名称
		多线程_抢票模拟 n =new 多线程_抢票模拟();
//		new Thread(n,"1号线程").start();
//		new Thread(n,"2号线程").start();
//		new Thread(n,"3号线程").start();
		//创建执行服务:
		ExecutorService ser=Executors.newFixedThreadPool(3);
		//提交执行:
		//Future<Boolean> result1 =ser.submit(n);
//		Future<Boolean> result11 =ser.submit(cd1);
//		Future<Boolean> result111 =ser.submit(cd1);
//		//获取结果:
		//boolean r1 =result1.get();
//		boolean r11 =result11.get();
//		boolean r111 =result111.get();
		//关闭服务:
		ser.shutdownNow();
	}
	
}
