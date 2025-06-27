package 多线程;

public class 多线程_模拟龟兔赛跑 implements Runnable{
	private  String winner =null;
	@Override
	public void run() {
		for(int i =1;i<=100;i++) {
			if(Thread.currentThread().getName().equals("兔")) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"--->"+i);
			boolean flag=game(i);
			if(flag) {
				break;
			}
		}
		
	}
	public boolean game(int step) {
		if(winner!=null) {
			return true;
		}
		if(step==100) {
			winner=Thread.currentThread().getName();
			System.out.println("获胜-->>"+winner);
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		多线程_模拟龟兔赛跑 d =new 多线程_模拟龟兔赛跑();
		new Thread(d,"龟").start();
		new Thread(d,"兔").start();
		
	}
	
}
