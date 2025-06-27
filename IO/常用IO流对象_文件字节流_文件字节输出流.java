package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 常用IO流对象_文件字节流_文件字节输出流 {
	public static void main(String[] args) throws IOException {
		//基础计时
		long startTime = System.currentTimeMillis();
		//需测试代码
		FileInputStream file = new FileInputStream("F:\\java code\\.metadata\\Student_1\\src\\IO\\1.png");  //输入流
		FileOutputStream file1 = new FileOutputStream("F:\\java code\\.metadata\\Student_1\\src\\IO\\a.png"); //输出流
		int temp =0;
		while((temp=file.read())!=-1) {
			file1.write(temp);
		}

		/*
		 错误写法：
		 while((file.read())!=-1) {  	// 第一次读取
    			file1.write(file.read());     // 第二次读取（跳过了第一个字节）
			}	
		 */
		
		file1.flush(); //刷新数据
		/*
		 当使用缓冲流（如 BufferedOutputStream、BufferedWriter）时，数据会先暂存在内存缓冲区中。
		 调用 flush() 会立即将缓冲区中的数据写入目标（如文件或网络），而不是等待缓冲区填满或流关闭。
		 */
		file.close();
		//结果：
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("耗时: " + duration + " 毫秒");//耗时: 182 毫秒

	}
}
