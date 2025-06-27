package 多线程_并发;
import java.util.concurrent.*;

public class 线程池_效率 implements Runnable{
    private int num = 100;
    private boolean flag = true;

    public void run() {
        while (flag) {
            process();
        }
    }

    public synchronized void process() {
        if (num <= 0) {
            flag = false;
            return;
        }
        try {
            Thread.sleep(10);  // 模拟处理时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " 处理任务: " + num--);
    }

    public static void main(String[] args) {
        System.out.println("主线程: " + Thread.currentThread().getName());
        
        线程池_效率 task = new 线程池_效率();
        
        // 1. 无线程池方式
        System.out.println("\n===== 无线程池方式 =====");
        long startWithoutPool = System.currentTimeMillis();
        
        new Thread(task, "线程A").start();
        new Thread(task, "线程B").start();
        new Thread(task, "线程C").start();
        
        // 等待所有线程完成
        while (Thread.activeCount() > 2) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endWithoutPool = System.currentTimeMillis();
        System.out.println("无线程池耗时: " + (endWithoutPool - startWithoutPool) + "ms");
        
        // 重置任务状态
        线程池_效率 task1 = new 线程池_效率();
        // 2. 使用线程池方式
        System.out.println("\n===== 使用线程池方式 =====");
        long startWithPool = System.currentTimeMillis();
        
        // 创建固定大小的线程池
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        // 提交任务到线程池
        executor.submit(() -> task1.run());
        executor.submit(() -> task1.run());
        executor.submit(() -> task1.run());
        
        
        // 关闭线程池并等待任务完成
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endWithPool = System.currentTimeMillis();
        System.out.println("线程池耗时: " + (endWithPool - startWithPool) + "ms");
        
        // 3. 可视化比较
        visualizeComparison(endWithoutPool - startWithoutPool, endWithPool - startWithPool);
    }
    
    // 可视化比较方法
    public static void visualizeComparison(long withoutPoolTime, long withPoolTime) {
        System.out.println("\n===== 性能对比可视化 =====");
        System.out.println("无线程池耗时: " + withoutPoolTime + "ms");
        System.out.println("线程池耗时: " + withPoolTime + "ms");
        
        // 创建简单的ASCII图表
        int maxLength = 50;
        int withoutPoolBar = (int) ((double) withoutPoolTime / (withoutPoolTime + withPoolTime) * maxLength);
        int withPoolBar = maxLength - withoutPoolBar;
        
        System.out.println("\n耗时对比:");
        System.out.print("无线程池: ");
        for (int i = 0; i < withoutPoolBar; i++) {
            System.out.print("█");
        }
        System.out.println(" " + withoutPoolTime + "ms");
        
        System.out.print("线程池   : ");
        for (int i = 0; i < withPoolBar; i++) {
            System.out.print("█");
        }
        System.out.println(" " + withPoolTime + "ms");
        
        // 显示线程池优势
        double improvement = 100.0 * (withoutPoolTime - withPoolTime) / withoutPoolTime;
        System.out.printf("\n线程池性能提升: %.2f%%\n", improvement);
        
        // 线程生命周期对比图
        System.out.println("\n线程生命周期对比:");
        System.out.println("无线程池: [创建] --> [执行] --> [销毁] --> [创建] --> [执行] --> [销毁]");
        System.out.println("线程池   : [创建] ==========> [执行] ==========> [空闲等待] ==========> [执行]");
    }


}