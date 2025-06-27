package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 常用IO流对象_文件字符流_使用字符流实现文本文件的拷贝处理 {
	public static void main(String[] args) throws IOException {
		FileReader r1 = new FileReader("F:\\java code\\.metadata\\Student_1\\src\\IO\\a.txt");
		FileWriter w1 = new FileWriter("F:\\java code\\.metadata\\Student_1\\src\\IO\\a2.txt");
		char[] buff =new char[1024];
		int temp=0;
		while((temp=r1.read(buff))!=-1) {
			w1.write(buff,0,temp);
		}
		w1.flush();
		r1.close();
		w1.close();
	}
}
