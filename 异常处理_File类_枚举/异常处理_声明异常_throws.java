package 异常处理_File类_枚举;

import java.io.FileReader;
import java.io.IOException;

public class 异常处理_声明异常_throws {
	public static void main(String[] args) throws IOException{ // IOException<---继承-----FileNotFoundException
		FileReader reader =null;							//当有两种无关异常时候用逗号分割
		try{
			reader = new FileReader("d:/a.txt");
			System.out.println("step1");
			char c1=(char)reader.read();
			System.out.println(c1);
			System.out.println("step2");
			}finally {
				System.out.println("step3");
			}
	}
}
