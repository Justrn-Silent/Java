package 多线程_并发;

import java.util.ArrayList;
import java.util.List;

public class 非同步_三大案例_案例三{
	public static void main(String[] args) {
		list li= new list();
		for(int i=0;i<10000;i++) {
		new Thread(li).start();
		}
		System.out.println(li.list_1.size());
	}
	
	
}
class list implements Runnable{
	List<String> list_1 =new ArrayList<String>();
	@Override
	public void run() {
			list_1.add(Thread.currentThread().getName());	
			/*
			 当数组容量不足时，ensureCapacityInternal()会触发扩容：
					若线程A和线程B同时扩容，新数组可能被多次创建，导致部分数据丢失。
			 */
	}
	
}