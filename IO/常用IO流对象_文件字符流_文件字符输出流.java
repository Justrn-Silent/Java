package IO;

import java.io.FileWriter;
import java.io.IOException;

public class 常用IO流对象_文件字符流_文件字符输出流 {
	public static void main(String[] args) throws IOException {
		FileWriter w =new FileWriter("F:\\java code\\.metadata\\Student_1\\src\\IO\\a1.txt");
		w.write("w类创建新的txt\n");  //这里\n有效
		w.write("abc\n");
		w.flush();
		//使用FileWriter(file)使用这个方法是在覆盖w类的内容
		FileWriter w1 =new FileWriter("F:\\java code\\.metadata\\Student_1\\src\\IO\\a1.txt",true);
		//FileWriter(File,Bool);  这个重写的方法是有判断是否在上一个w类的基础上追加 
		w1.write("w1类追加成功\n");
		w1.write("修改成功\n");
		w1.append("append追加成功");
		w1.flush();
		w1.close();
		w.close();
	}
}
