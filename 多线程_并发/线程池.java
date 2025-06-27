package 多线程_并发;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 线程池 implements Runnable{
		private int num =100;
		private boolean flag =true;
		public void run() {
			while(flag) {
			text();
			}
		}
		public synchronized void text() {	  

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
			线程池 n =new 线程池();
			//创建线程池
			ExecutorService ex =Executors.newCachedThreadPool();
			//启动
			ex.submit(new 线程池());
			ex.submit(new 线程池());
			ex.submit(new 线程池());
			//关闭线程池
			ex.shutdown();
			/*
			 public static ExecutorService newCachedThreadPool()      创建一个没有上限的线程池
			public static ExecutorService newFixedThreadPool(int nThreads)     创建有上限的线程池
			 */
			
		}
		
	}

