package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 常用IO流对象_文件字符缓冲流_通过字符缓冲流实现文本文件的拷贝 {
	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("F:\\java code\\.metadata\\Student_1\\src\\IO\\a.txt");
		FileWriter fw =new FileWriter("F:\\java code\\.metadata\\Student_1\\src\\\\IO\\fw_copy.txt");
		BufferedReader br =new BufferedReader(fr);
		BufferedWriter bw =new BufferedWriter(fw);
		String s="";
		while((s=br.readLine())!=null) {
			bw.write(s);
			bw.newLine();
		}
		bw.flush();
		
	}
}
