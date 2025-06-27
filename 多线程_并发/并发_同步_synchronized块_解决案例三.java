package 多线程_并发;

import java.util.ArrayList;
import java.util.List;

public class 并发_同步_synchronized块_解决案例三 {
	public static void main(String[] args) throws InterruptedException {
		list_T li= new list_T();
		for(int i=0;i<10000;i++) {
		new Thread(li).start();
		}
		Thread.sleep(10);  //由于线程运行与main方法无关所以存在速度上的差异，对其进行适当阻塞u
		System.out.println(li.list_1.size());
	}
	
	
}
class list_T implements Runnable{
	List<String> list_1 =new ArrayList<String>();
	@Override
	public void run() {
		synchronized (this) {
			list_1.add(Thread.currentThread().getName());	
			/*
			 当数组容量不足时，ensureCapacityInternal()会触发扩容：
					若线程A和线程B同时扩容，新数组可能被多次创建，导致部分数据丢失。
			 */
		}
			
	}
	
}