package 多线程;
/*
方法													功能
isAlive()								判断线程是否还活着,即线程是否还未终止
setName()										给线程起一个名字
getName()										获取线程的名字
currentThread()						取得当前正在运行的线程对象，也就是获取自己本身
 */
public class 多线程_常用其他方法 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"---->>"+Thread.currentThread().isAlive());//取得当前正在运行的线程对象并且判断线程是否还活着
		thread th =new thread("线程thread");
		Thread tr =new Thread(th);
		tr.setName("当前线程：");  //修改线程对象的名称
		tr.start();
		Thread.sleep(1000);  //让main线程阻塞1000毫秒从而可以判断出Thread线程是否销毁
		System.out.println(tr.getName()+"---->>"+tr.isAlive());
	}
}
class thread implements Runnable{
	private String name;
	thread(String name){
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(this.name);
		
	}
	
	
}
