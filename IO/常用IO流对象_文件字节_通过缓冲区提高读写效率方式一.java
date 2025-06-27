package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 1.3.1 方式
通过创建一个指定长度的字节数组作为缓冲区，以此来提高IO流的读写效率。
该方式适用于读取较大图片时的缓冲区定义。
注意:缓冲区的长度一定是2的整数幂。一般情况下1024 长度较为合适。
 */
public class 常用IO流对象_文件字节_通过缓冲区提高读写效率方式一 {
	public static void main(String[] args) throws IOException {
		//基础计时
		long startTime = System.currentTimeMillis();
		//需测试代码
		FileInputStream file2 = new FileInputStream("F:\\java code\\.metadata\\Student_1\\src\\IO\\1.png");  //输入流
		FileOutputStream file3 = new FileOutputStream("F:\\java code\\.metadata\\Student_1\\src\\IO\\a.png"); //输出流
		int temp =0;
		byte buff[]=new byte[1024];
		/*
		 每次读取源文件1024字节，提高了每次只读一字节的效率
		 */
		while((temp=file2.read(buff))!=-1) {
			file3.write(buff,0,temp);
		}
		
		file3.flush(); //刷新数据
		/*
		 当使用缓冲流（如 BufferedOutputStream、BufferedWriter）时，数据会先暂存在内存缓冲区中。
		 调用 flush() 会立即将缓冲区中的数据写入目标（如文件或网络），而不是等待缓冲区填满或流关闭。
		 这种方法是用效率换空间
		 */
		file2.close();
		//结果：
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("耗时: " + duration + " 毫秒"); //耗时: 1 毫秒

		
	}
}
