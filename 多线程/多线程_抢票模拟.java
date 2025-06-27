package 多线程;

public class 多线程_抢票模拟 implements Runnable{
	private int num =100;
	public void run() {
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
		
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());  //获取当前正在执行的线程的名称
		多线程_抢票模拟 n =new 多线程_抢票模拟();
		new Thread(n,"1号线程").start();
		new Thread(n,"2号线程").start();
		new Thread(n,"3号线程").start();
	}
	
	/*
	 当三个线程同时去抢最后一张票时候
	 假设2号线程先进去进行if判断发现还有一张票触发sleep进行等等
	 这时候1号，3号进来进行if判断发现也还有一张也进来了进入队列
	 不过2号线程先进来所以把最后一张票抢了
	 也就是说剩下的线程只能抢0-1张票所以出现负数
	 当然还有一种情况是两个线程抢到同一张票
	 这种情况是由于有一个线程在修改数据时候是进行复制
	 然后再修改不过在复制时候有一个线程也进行了复制导致拿到同一张票
	 */
}
