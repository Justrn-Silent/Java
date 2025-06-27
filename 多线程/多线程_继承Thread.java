package 多线程;
/*
 每个线程都有优先权。 具有较高优先级的线程优先于优先级较低的线程执行。 
 每个线程可能也可能不会被标记为守护程序。 
 当在一些线程中运行的代码创建一个新的Thread对象时，新线程的优先级最初设置为等于创建线程的优先级
 并且当且仅当创建线程是守护进程时才是守护线程。 

当Java虚拟机启动时，通常有一个非守护进程线程（通常调用某个指定类的名称为main的方法）。 
Java虚拟机将继续执行线程，直到发生以下任一情况： 
该exit类的方法Runtime已经被调用并且安全管理器允许退出操作发生。 
不是守护进程线程的所有线程都已经死亡，无论是从调用返回到run方法还是抛出异常，传播超出了run方法。 
创建一个新的执行线程有两种方法。 一个是将一个类声明为一个Thread的子类。 
这个子类应该重写run类的方法Thread 。 然后可以分配并启动子类的实例
 例如，计算大于规定值的素数的线程可以写成如下： 
--------------------------------------------------------------------------------

     class PrimeThread extends Thread {
         long minPrime;
         PrimeThread(long minPrime) {
             this.minPrime = minPrime;
         }

         public void run() {
             // compute primes larger than minPrime
              . . .
         }
     }
 
--------------------------------------------------------------------------------
然后，以下代码将创建一个线程并启动它运行： 
     PrimeThread p = new PrimeThread(143);
     p.start();
 创建线程的另一种方法是声明一个实现Runnable接口的类。 
 那个类然后实现了run方法。 然后可以分配类的实例，在创建Thread时作为参数传递，并启动。 
 这种其他风格的同一个例子如下所示： 
--------------------------------------------------------------------------------
     class PrimeRun implements Runnable {
         long minPrime;
         PrimeRun(long minPrime) {
             this.minPrime = minPrime;
         }
         public void run() {
             // compute primes larger than minPrime
              . . .
         }
     }
--------------------------------------------------------------------------------

然后，以下代码将创建一个线程并启动它运行： 
     PrimeRun p = new PrimeRun(143);
     new Thread(p).start();
 每个线程都有一个用于识别目的的名称。 多个线程可能具有相同的名称。 
 如果在创建线程时未指定名称，则会为其生成一个新名称。 
除非另有说明，否则将null参数传递给null中的构造函数或方法将导致抛出NullPointerException 。 
 */
public class 多线程_继承Thread extends Thread{
	@Override
	public void run() {
			for(int i =0;i<20;i++) {
				System.out.println("线程被开启");
			}
	}

	public static void main(String[] args) {
		多线程_继承Thread tr =new 多线程_继承Thread();
		tr.start();
		for(int i =0;i<20;i++) {
			System.out.println("main已运行");
		}
	}

}
/*
  
 */
 