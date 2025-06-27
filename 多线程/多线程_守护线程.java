package 多线程;
/*
 * 线程分为用户线程和守护线程;
 * 虚拟机必须确保用户线程执行完毕
 * 虚拟机不用等待守护线程执行完毕
 * 如后台记录操作日志、监控内存使用等
 * 守护线程:是为用户线程服务的;ivm停止不用等待守护线程执行完毕
 * 默认:用户线程 jvm等待用户线程执行完毕才会停止
 * JVM仅以用户线程是否全部结束为退出依据，当用户线程执行完毕，守护线程会被JVM强制终止。
 */
public class 多线程_守护线程 {
	public static void main(String[] args) {
		You y =new You();
		Thread t= new Thread(y);
		t.start();  //用户线程
		god g =new god();
		Thread tt =new Thread(g);
		tt.setDaemon(true);  //将其转换为守护线程
		tt.start();
	}
}
class You implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<360*100;i++) {
			System.out.println("you!!");
		}
		
	}
	
}
class god implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("god!!");
		}
		
	}
	
}