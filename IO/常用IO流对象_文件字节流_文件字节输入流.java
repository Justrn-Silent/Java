package IO;

import java.io.FileInputStream;
import java.io.IOException;

/*
 Filelnputstream 通过字节的方式读取文件，适合读取所有类型的文件(图像、视频、文本文件等)。
 Java也提供了 FileReader 专门读取文本文件。
FileOutputstream 通过字节的方式写数据到文件中，适合所有类型的文件。
Java 也提供了 FileWriter 专门写入文本文件。 
 */
public class 常用IO流对象_文件字节流_文件字节输入流 {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("F:\\java code\\.metadata\\Student_1\\src\\IO\\1.png");
		int temp=0;
		while((temp=file.read())!=-1) {
			System.out.print(temp+" ");
		}
		file.close();
	}
}
