package 多线程_并发;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class 并发_同步_Lock锁 {
	public static void main(String[] args) throws InterruptedException {
		list_T1 li= new list_T1();
		for(int i=0;i<10000;i++) {
		new Thread(li).start();
		}
		Thread.sleep(10);  
		System.out.println(li.list_1.size());
	}
	
	
}
class list_T1 implements Runnable{
	ReentrantLock lock =new ReentrantLock();  //lock创建
	List<String> list_1 =new ArrayList<String>();
	@Override
	public void run() {
		  lock.lock();  //上锁
			list_1.add(Thread.currentThread().getName());	
			lock.unlock();  //解锁
		} 
			
	}

