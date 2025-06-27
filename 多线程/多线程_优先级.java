package 多线程;
/*
static int ---->>   MAX_PRIORITY 线程可以拥有的最大优先级。  10
static int ---->>    MIN_PRIORITY 线程可以拥有的最小优先级。  1
static int ---->>    NORM_PRIORITY 分配给线程的默认优先级。  5
概率问题，不代表绝对的先后顺序
 */
public class 多线程_优先级 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"---->>默认是："+Thread.currentThread().getPriority()); //默认是5
		Thread tr =new Thread(new 线程A(),"线程1(MAX)");
		tr.setPriority(Thread.MAX_PRIORITY);
		
		Thread tr1 =new Thread(new 线程A(),"线程2(MAX)");
		tr1.setPriority(Thread.MAX_PRIORITY);
		
		Thread tr2 =new Thread(new 线程A(),"线程3(MAX)");
		tr2.setPriority(Thread.MAX_PRIORITY);
		
		Thread tr3 =new Thread(new 线程A(),"线程4(MIN)");
		tr3.setPriority(Thread.MIN_PRIORITY);
		
		Thread tr4 =new Thread(new 线程A(),"线程5(MIN)");
		tr4.setPriority(Thread.MIN_PRIORITY);
		
		Thread tr5 =new Thread(new 线程A(),"线程6(MIN)");
		tr5.setPriority(Thread.MIN_PRIORITY);
		
		tr.start();
		tr1.start();
		tr2.start();
		tr3.start();
		tr4.start();
		tr5.start();
	}
}
class 线程A implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"---->>"+Thread.currentThread().getPriority());
		
	}
	
}
