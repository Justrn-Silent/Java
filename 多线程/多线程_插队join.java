package 多线程;
/*
 * join合并线程,待此线程执行完成后，再执行其他线程，其他线程阻塞（插入线程）
 */
public class 多线程_插队join implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		多线程_插队join dy =new 多线程_插队join();
		Thread tt =new Thread(dy,"线程一：");
		tt.start();
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				tt.join();
			}
			System.out.println("main"+i);
		}
	}
}
