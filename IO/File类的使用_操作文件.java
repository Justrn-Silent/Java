package IO;

import java.io.File;
import java.io.IOException;
/*
针对文件操作的方法
createNewFile()  //创建新文件。
delete()  //直接从磁盘上删除
exists()  //查询磁盘中的文件是否存在
getAbsolutePath()  //获取绝对路径
getPath()   //获取相对路径
getName()   //获取文件名 相当于调用了一个 toString 方法。
isFile()		//判断是否是文件
length()		//查看文件中的字节数
isHidden()	//测试文件是否被这个抽象路径名是一个隐藏文件。 
 */
public class File类的使用_操作文件 {
public static void main(String[] args) {
	File f  =new File("F:\\java code\\.metadata\\Student_1\\src\\IO\\aa.txt");
	try {
		boolean a1 = f.createNewFile();  //创建新文件
		System.out.println(a1);
	} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	System.out.println(f.exists());  //查询磁盘中的文件是否存在
	System.out.println(f.getAbsolutePath()); //获取绝对路径
	System.out.println(f.getPath()); //获取相对路径
	System.out.println(f.getName()); //获取文件名 相当于调用了一个 toString 方法。
	System.out.println(f);  //toString是打印文件path
	System.out.println(f.isFile());  //判断是否是文件
	System.out.println(f.delete());  //直接从磁盘上删除
}
}
