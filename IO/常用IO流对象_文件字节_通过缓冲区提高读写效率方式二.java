package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 1.3.2 方式
通过创建一个字节数组作为缓冲区，数组长度是通过输入流对象的 available()返回当前文件的预估长度来定义的。
在读写文件时，是在一次读写操作中完成文件读写操作的。
注意:如果文件过大，那么对内存的占用也是比较大的。所以大文件不建议使用该方法。 
 */
public class 常用IO流对象_文件字节_通过缓冲区提高读写效率方式二 {
	public static void main(String[] args) throws IOException {
		//基础计时
		long startTime = System.currentTimeMillis();
		//需测试代码
		FileInputStream file22 = new FileInputStream("F:\\java code\\.metadata\\Student_1\\src\\IO\\1.png");  //输入流
		FileOutputStream file33 = new FileOutputStream("F:\\java code\\.metadata\\Student_1\\src\\IO\\a.png"); //输出流
		int temp =0;
		byte buff[]=new byte[file22.available()];
		/*
		 available方法是读取源文件的大小从而设定数组的大小，这样的好处是一次性读完，速度快
		 但弊端是一次性读取源文件(如果源文件非常大)消耗内存大
		 所以不建议读取大文件用这种方法
		 */
		while((temp=file22.read(buff))!=-1) {
			file33.write(buff,0,temp);
		}
		
		file33.flush(); //刷新数据
		/*
		 当使用缓冲流（如 BufferedOutputStream、BufferedWriter）时，数据会先暂存在内存缓冲区中。
		 调用 flush() 会立即将缓冲区中的数据写入目标（如文件或网络），而不是等待缓冲区填满或流关闭。
		 这种方法是用空间换效率
		 */
		file22.close();
		//结果：
		long endTime1 = System.currentTimeMillis();
		long duration1 = endTime1 - startTime;
		System.out.println("耗时: " + duration1 + " 毫秒"); //耗时: 1 毫秒

		
	}
}
