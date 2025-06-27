package Three_Game;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Three_method {
	//启动
	static void main() {
	int scr=0;
	do {
		Three_method.phone();  //初始化界面函数
		Scanner sc =new Scanner(System.in);
		System.out.print("请输入(1,Game OR 0,Exit )");
		 scr = sc.nextInt();
		if(scr==1) {
			Three_method.QP();  //棋盘初始化函数
			while(true){
			Three_method.PR();//打印棋盘函数
			Three_method.User();//用户输入函数
			Three_method.Win_Out();//胜负判断函数
			if(Three_method.Put()==1) {Three_method.PR();Three_method.PUT_1();  break;}
			if(Three_method.Put()==0) {Three_method.PR();Three_method.PUT_2();  break;}
			if(Three_method.Put()==2) {Three_method.PR(); Three_method.PUT_3(); break;}
			if(Three_method.Put()==3) {}
			Three_method.PR();//刷新棋盘函数
			Three_method.PC();//电脑输入函数
			Three_method.Win_Out();//胜负判断函数
			if(Three_method.Put()==1) {Three_method.PR(); Three_method.PUT_1(); break;}
			if(Three_method.Put()==0) {Three_method.PR();Three_method.PUT_2();  break;}
			if(Three_method.Put()==2) { Three_method.PR();Three_method.PUT_3(); break;}
			if(Three_method.Put()==3) {}
			//Three_method.PR();//刷新棋盘函数
			}
		}else if(scr==0) {
			System.out.print("退出！！");
			break;
		}else if(scr!=0&&scr!=1) {
			System.out.println("输入超出范围，重新输入!!\n");
			scr=1;
		}
	}while(scr==1);
}
	
	
	 //初始化棋盘格
	 static char arr[][]=new char[3][3];  
	 //用户坐标
		static int a=0;
		static int b=0;
	//电脑坐标
		static int aU=0;
		static int bU=0;
	//界面初始化函数
	public static void phone() {
			System.out.println("****************************************************************************************");
			System.out.println("****************************************************************************************");
			System.out.println("***********         1,Game             0,Exit       ********************");
			System.out.println("****************************************************************************************");
			System.out.println("****************************************************************************************");
		}
	
	
	//初始化棋盘
	public static void QP() {
		
		 //占位
		for(int i=0;i<3;i++) { 
			for(int j = 0;j<3;j++) {
				arr[i][j]=' ';
			}
		}
	}
	public static void PR() {
		//打印棋盘
		for(int i =0;i<3;i++) {
					System.out.printf(" %c | %c | %c \n", arr[i][0],arr[i][1],arr[i][2]);
					if(i<2) {
					System.out.printf("------------\n");
					}
		}
	}
	
	//用户输入函数
	public static void User() {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入坐标：");
		int Ss = sc.nextInt();
		System.out.println();
		switch(Ss) {
		case 1:  a=0;
				b=0;
			break;
		case 2: a=0;
				b=1;
			break;
		case 3: a=0;
				b=2;
			break;
		case 4: a=1;
				b=0;
			break;
		case 5: a=1;
				b=1;
			break;
		case 6: a=1;
				b=2;
			break;
		case 7: a=2;
				b=0;
			break;
		case 8: a=2;
				b=1;
			break;
		case 9: a=2;
				b=2;
			break;
		}
		if(arr[a][b]!=' ') {
			System.out.println();
		System.out.println("输入位置已被占用，重新输入!!");
	}else {
		arr[a][b]='*';
		break;
	}
		}
	}
	
	//电脑输入函数
	public static void PC() {
		while(true) {
			 //随机生成0~2
			Random R =new Random(); 
			int R1 = R.nextInt(3);
			int R2 = R.nextInt(3);
		if(arr[R1][R2]!=' ') {
			 
		}else {
			System.out.println("电脑输入：");
			System.out.println();
			arr[R1][R2]='#';
			break;
		}
		}
	
	}
	//平方计算
	static int square(int num) {
        return num * num;
    }
//	//电脑输入函数
//	public static void PC() {
//			if(arr[1][1]==' ') {
//				arr[1][1]='#';
//				aU=1;
//				bU=1;
//			}else if(arr[1][1]!=' ') {
//				if(arr[1][1]=='#') {
//					if(Math.sqrt(square(aU-a)+square(bU-b))==Math.sqrt(2)) {
//						
//						
//					}
//				}
//			}
//		
//		
//		
//		
//		
//	}
	
	
	//Win or Out
	public static char Win_Out() {
		//User
		//行
		for(int i =0;i<3;i++) {
			if(arr[i][0]=='*'&&arr[i][1]=='*'&&arr[i][2]=='*') {
				return '*';
			}
		}
		//列
		for(int i =0;i<3;i++) {
			if(arr[0][i]=='*'&&arr[1][i]=='*'&&arr[2][i]=='*') {
				return '*';
			}
		}
		//交叉
		for(int i =0;i<3;i++) {
			if(arr[0][0]=='*'&&arr[1][1]=='*'&&arr[2][2]=='*') {
				return '*';
			}
		}
		for(int i =0;i<3;i++) {
			if(arr[2][2]=='*'&&arr[1][1]=='*'&&arr[2][0]=='*') {
				return '*';
			}
		}
		//PC
			//行
			for(int i =0;i<3;i++) {
				if(arr[i][0]=='#'&&arr[i][1]=='#'&&arr[i][2]=='#') {
					return '#';
				}
			}
			//列
			for(int i =0;i<3;i++) {
				if(arr[0][i]=='#'&&arr[1][i]=='#'&&arr[2][i]=='#') {
					return '#';
				}
			}
			//交叉
			for(int i =0;i<3;i++) {
				if(arr[0][0]=='#'&&arr[1][1]=='#'&&arr[2][2]=='#') {
					return '#';
				}
			}
			for(int i =0;i<3;i++) {
				if(arr[0][2]=='#'&&arr[1][1]=='#'&&arr[2][0]=='#') {
					return '#';
				}
			}
			for(int i =0;i<3;i++) {
				if(arr[0][i]!=arr[1][i]&&arr[1][i]!=arr[2][i]&&arr[1][i]!=' '&&arr[2][i]!=' '&&arr[0][i]!=' '&&arr[i][0]!=arr[i][1]&&arr[i][1]!=arr[i][2]&&arr[i][0]!=' '&&arr[i][1]!=' '&&arr[i][2]!=' ') {
					return '!';
				}
			}
			return 0;
				
			
	}
	
	
	//put_win or out
	public static int Put() {
		char ver =Win_Out();
		if(ver=='*') {
			return 1;
		}else if(ver=='#'){
			return 0;
		}else if(ver=='!'){
			return 2;
		}
		
		return 3;
		
	}
	
	//结果输出
	public static void PUT_1() {
		System.out.println();
		System.out.println("you Win!!");
		System.out.println();
	}
	public static void PUT_2() {
		System.out.println();
		System.out.println("you Out!!");
		System.out.println();
	}
	public static void PUT_3() {
		System.out.println();
		System.out.println("play even!!");
		System.out.println();
	}
}


