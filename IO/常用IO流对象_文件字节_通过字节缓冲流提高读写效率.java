package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;

/*
 Java 缓冲流本身并不具有 IO 流的读取与写入功能
 只是在别的流(节点流或其他处理流)上加上缓冲功能提高效率,就像是把别的流包装起来一样
 因此缓冲流是一种处理流 (包装流)
当对文件或者其他数据源进行频繁的读写操作时，效率比较低
这时如果使用缓冲流就能够更高效的读写信息。因为缓冲流是先将数据缓存起来
然后当缓存区存满后或者手动刷新时再一次性的读取到程序或写入目的地。
因此，缓冲流还是很重要的，我们在IO 操作时记得加上缓冲流来提升性能。
Bufferedlnputstream 和 BufferedOutputstream 这两个流是缓冲字节流，通过内部缓存数组来提高操作流的效率。
 */
public class 常用IO流对象_文件字节_通过字节缓冲流提高读写效率 {
	public static void main(String[] args) throws IOException {
		//基础计时
		long startTime = System.currentTimeMillis();
		//需测试代码
		FileInputStream file22 = new FileInputStream("F:\\java code\\.metadata\\Student_1\\src\\IO\\1.png");  //输入流
		FileOutputStream file33 = new FileOutputStream("F:\\java code\\.metadata\\Student_1\\src\\IO\\a.png"); //输出流
		BufferedInputStream buffin =new BufferedInputStream(file22);
		BufferedOutputStream buffout = new BufferedOutputStream(file33);
		/*在bufferedInputStream类里面，缓冲遵循，byte数组长度默认是8192*/
		int temp =0;
		while((temp=buffin.read())!=-1) {
			buffout.write(temp);
		}
		buffin.close();
		file22.close();
		buffout.close();
		file33.close();
		//结果：
		long endTime1 = System.currentTimeMillis();
		long duration1 = endTime1 - startTime;
		System.out.println("耗时: " + duration1 + " 毫秒"); //耗时: 6 毫秒

		
	}
}
