package IO;

import java.io.FileReader;
import java.io.IOException;

/*
文件字符流
前面介绍的文件字节流可以处理所有的文件如果我们处理的是文本文件，也可以使用文件字符流，它以字符为单位进行操作。
 */
public class 常用IO流对象_文件字符流_文件字符输入流 {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("F:/java code/.metadata/Student_1/src/IO/a.txt");
		int temp =0;
		while((temp=file.read())!=-1){  //Uncoded码表
			System.out.print((char)temp+" ");
		}
	}
}
