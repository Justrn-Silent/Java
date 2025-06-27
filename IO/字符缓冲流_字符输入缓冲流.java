package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
字符缓冲流
BufferedReader/BufferedWriter 增加了缓存机制，大大提高了读写文本文件的效率。
3.1字符输入缓冲流
BufferedReader 是针对字符输入流的缓冲流对象，提供了更方便的按行读取的方法:readline();
在使用字符流读取文本文件时，我们可以使用该方法以行为单位进行读取。
 */
public class 字符缓冲流_字符输入缓冲流 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("F:\\java code\\.metadata\\Student_1\\src\\IO\\a.txt");
		BufferedReader br = new BufferedReader(fr);
		String temp ="";
		while((temp=br.readLine())!=null) {
			System.out.println(temp);
			
		}
		br.close();
		fr.close();
	}
}
