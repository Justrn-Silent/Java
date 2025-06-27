package 多线程_并发;


class bank_1{
	 int money;
	String name;
	public bank_1(int money, String name) {
		super();
		this.money = money;
		this.name = name;
	}
}
class drwing_1 implements Runnable{
	bank_1 account;
	int money;  //取钱
	int all_money; //取出总金额
	
	public drwing_1(bank_1 bk, int money) {
		this.account = bk;
		this.money = money;
	}
	@Override
	public void run() {
		synchronized(account) {   //锁资源对象
			
		if(account.money-money<0) {
			return;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		account.money-=money;
		all_money=money;
		System.out.println(Thread.currentThread().getName()+"--->>取出总金额："+all_money);
		System.out.println(Thread.currentThread().getName()+"--->>余额："+account.money);
		
		}
	}
}
public class 并发_同步_synchronized块_解决案例二 {
	public static void main(String[] args) {
		bank_1 bk =new bank_1(100, "account_01");
		drwing_1 you =new drwing_1(bk, 80);
		Thread td1 =new Thread(you);
		td1.setName("you_get");
		td1.start();
		drwing_1 me =new drwing_1(bk, 30);
		Thread td2=new Thread(me);
		td2.setName("me_get");
		td2.start();
	}
}