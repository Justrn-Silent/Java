package 多线程_并发;
class bank{
	 int money;
	String name;
	public bank(int money, String name) {
		super();
		this.money = money;
		this.name = name;
	}
}
class drwing implements Runnable{
	bank account;
	int money;  //取钱
	int all_money; //取出总金额
	
	public drwing(bank account, int money) {
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
//		if(account.money-money<0) {
//			return;
//		}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
		//添加限制条件也无法阻止，原因是线程不安全！！
		account.money-=money;
		all_money=money;
		System.out.println(Thread.currentThread().getName()+"--->>取出总金额："+all_money);
		System.out.println(Thread.currentThread().getName()+"--->>余额："+account.money);
		
		
	}
}
public class 非同步_三大案例_案例二{
	public static void main(String[] args) {
		bank bk =new bank(100, "account_01");
		drwing you =new drwing(bk, 80);
		Thread td1 =new Thread(you);
		td1.setName("you_get");
		td1.start();
		drwing me =new drwing(bk, 30);
		Thread td2=new Thread(me);
		td2.setName("me_get");
		td2.start();
	}
	
	
}