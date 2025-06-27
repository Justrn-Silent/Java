package IO;

import java.io.File;
/*
exists()			//查询目录是否存在
isDirectory()		//判断当前路径是否为目录
mkdir()		//创建目录
getParentFile()		//获取当前目录的父级目录。
list()		//返回一个字符串数组，包含目录中的文件和目录的路径名,
listFiles()		//返回一个 File 数组，表示用此抽象路径名表示的目录中的文件, 
 */
public class File类的使用_操作目录 {
	public static void main(String[] args) {
		File file = new File("F:\\java code\\.metadata\\Student_1\\src\\IO\\a");
		System.out.println(file.mkdir());
		File file1 = new File("F:\\java code\\.metadata\\Student_1\\src\\IO\\a\\b\\c");
		System.out.println(file1.mkdir()); //False
		System.out.println(file1.mkdirs()); //True
		System.out.println(file1.exists());
		//-------------------------------------
		File f =new File("F:\\java code\\.metadata\\Student_1\\src");
		String[] s = f.list();  //list打印当前目录下的文件名
		for(String t:s) {
			System.out.println(t);
		}
		System.out.println("----------------");
		File[] e = f.listFiles();  //listFiles打印目录绝对地址与目录下的文件名
		for(File i:e) {
			System.out.println(i);
		}
	}
}
