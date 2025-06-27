package 多线程_并发;
/*
 并发三要素：
 1，同一个对象
 2，多个线程
 3，同时操作
 ---产生并发---
 */
public class 并发_同步_synchronized方法_解决案例一 implements Runnable{
	private int num =1000;
	private boolean flag =true;
	public void run() {
		while(flag) {
//			try {
//				Thread.sleep(100);  
//			} catch (InterruptedException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
		text();
		}
	}
	public synchronized void text() {	  //锁的是对象入口，不是方法本身
		/*
		 等价于：
		 public void text() {	 
		 	synchronized(this){
		 		获取资源
		 	}
		 }
		 */
			if(num<=0) {
				flag=false;
				return;
			}
			try {
				Thread.sleep(100);  //阻塞队列
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---->>"+num--);
		}
			
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());  //获取当前正在执行的线程的名称
		并发_同步_synchronized方法_解决案例一 n =new 并发_同步_synchronized方法_解决案例一();
		new Thread(n,"1号线程").start();
		new Thread(n,"2号线程").start();
		new Thread(n,"3号线程").start();
	}
	
}
/*
锁的是对象入口
不是方法本身，而是通过对象入口控制所有同步方法的访问
资源保护本质
通过控制对象入口，确保：
共享资源（num）不会被同时读写
状态判断（num<=0）和修改（num--）是原子的
阻塞是自动的
当线程B/C调用 n.text() 时，JVM 自动检查对象锁状态：
有锁 → 加入等待队列
无锁 → 立即获取锁执行
synchronized()括号内放的是对象，不能是基本数据类型！！
 */
