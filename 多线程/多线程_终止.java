package 多线程;
/*
线程停止
不使用JDK提供的stop()/destroy()方法(它们本身也被JDK废弃了)。
提供一个boolean型的终止变量，当这个变量置为false，则终止线程的运行。
终止线程
1、线程正常执行完毕-->次数
2、外部干涉 -->加入标识
不要使用stop destroy
 */
public class 多线程_终止 implements Runnable{
	private boolean run =true;
	private  int count =1;  //volatile
	@Override
	public void run() {
		while(run) {
			System.out.println(Thread.currentThread().getName()+"线程被启动"+count++);
			
		}
	}
	public void control() {
		this.run=false;
	}
	public static void main(String[] args) {
		多线程_终止 d = new 多线程_终止();
		new Thread(d,"线程一").start();
//		while(true) {
//			if(d.count==100) {
//				d.control();
//				System.out.println("线程被停止，截至:"+d.count);
//				break;
//			}
//		}
		for(int i=0;i<100;i++) {
			if(i==88) {
				d.control();
				System.out.println("stop:"+d.count);
			}
			System.out.println("main--->"+i);
		}
	}
}
