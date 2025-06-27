package Java_基础;

public class 条件判断语句_04 {
	public static void main(String[]args) {
		int a =1;
		//if语句
		if(a==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
			//false
		}
		//switch语句
		
		switch(a) {
		case 1:
			break;  //break的重要性：如果程序运行case 1后代码没有break；将会继续运行case 2的代码直到遇到break；
		case 2:
			break;
		case 3:
			break;
		default: //其他情况
			break;
		}
	}
}
