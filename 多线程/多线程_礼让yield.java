package 多线程;
/*
 礼让线程,让当前正在执行线程暂停不是阻塞线程
 而是将线程从运行状态转入就绪状态让CPU调度器重新调度
 */
public class 多线程_礼让yield implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"--->start");
		Thread.yield();
		System.out.println(Thread.currentThread().getName()+"--->end");
		
	}
	public static void main(String[] args) {
		多线程_礼让yield dy =new 多线程_礼让yield();
		new Thread(dy,"线程一：").start();
		new Thread(dy,"线程二：").start();
	}
}
