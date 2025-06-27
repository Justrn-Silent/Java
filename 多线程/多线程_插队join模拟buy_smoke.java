package 多线程;

public class 多线程_插队join模拟buy_smoke {
	public static void main(String[] args) {
		father fs = new father();
		new Thread(fs).start();
	}
}
class father implements Runnable{

	@Override
	public void run() {
		System.out.println("said son go to buy smoke");
		Thread tt =new Thread(new son());
		try {
			tt.start();
			tt.join(); //阻塞
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Don`t buy smoke");
		}
		System.out.println("Father smokes!!");
	}
	
}
class son implements Runnable{

	@Override
	public void run() {
		System.out.println("going to buy smoke");
		System.out.println("sotp!  going to play game and play 10 s!!");
		for(int i =1;i<=10;i++) {
			System.out.println("play "+i+"s");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}