package IO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO流入门案例_第一个简单的IO流程序 {
	/*
	 * FileInputStream与FileReader(Reader所有字符流的父类)区别：：
核心差异：	FileInputStream处理字节（无编码转换），FileReader处理字符（通过编码转为Unicode）。
码表关联：	ASCII是Unicode的子集，因此在兼容范围内两者码值相同
			但FileReader的底层逻辑是通过编码映射到Unicode，而非直接使用ASCII表。 
	 */
	public static void main(String[] args) {
		FileInputStream file = null;
		try {
			file =new FileInputStream("F:/java code/.metadata/Student_1/src/IO/a.txt");
			try {
				while(true) {
					int f =  file.read();   //read未读出字符则返回-1
					if(f==-1) {
						break;
					}
					System.out.print((char)f+" ");
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if(file !=null) {
				try {
					file.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
