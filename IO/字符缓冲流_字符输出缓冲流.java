package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 3.2字符输出缓冲流
Bufferedwriter 是针对字符输出流的缓冲流对象，在字符输出缓冲流中可以使用newLine();方法实现换行处理
 */
public class 字符缓冲流_字符输出缓冲流 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("F:\\java code\\.metadata\\Student_1\\src\\IO\\aa.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("加入1");
		bw.write("加入2");
		bw.newLine();  //换行
		bw.write("加入3");
		bw.write("加入4");
		bw.newLine();  //换行
		bw.close();
		fw.close();
	}
}
