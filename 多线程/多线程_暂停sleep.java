package 多线程;
/*
sleep
sleep(时间)指定当前线程阻塞的毫秒数
sleep存在异常InterruptedException
sleep时间达到后线程进入就绪状态
sleep可以模拟网络延时、倒计时等。
每一个对象都有一个锁，sleep不会释放锁(占用资源，不释放资源)
 */
public class 多线程_暂停sleep implements Runnable{
	private int num =100;
	public void run() {
		while(true) {
			if(num<=0) {
				break;
			}
			//模拟网络延时
			try {
				Thread.sleep(200);  //测试并发
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---->>"+num--);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());  //获取当前正在执行的线程的名称
		多线程_抢票模拟 n =new 多线程_抢票模拟();
		new Thread(n,"1号线程").start();
		new Thread(n,"2号线程").start();
		new Thread(n,"3号线程").start();
	}
	
}
