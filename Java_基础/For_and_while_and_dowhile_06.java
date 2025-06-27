package Java_基础;

public class For_and_while_and_dowhile_06 {
    public static void main(String[] args) {
    	  final int SS =5;
    	  
        // for循环
        // 结构：for(初始化;条件;递增;){循环体}
    	//左向直角三角形
    	  System.out.println("左向直角三角形");
        for (int a = 0; a < SS; a++) { 
            for (int b = 0; b <= a; b++) { 
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        //右向直角三角形
        System.out.println("右向直角三角形");
        for(int c =0;c<SS;c++) {
        	for(int d =1;d<SS-c;d++) {
        		System.out.print(" ");
        	}
        	for(int e =0;e<=c;e++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        //等腰三角形
        System.out.println("等腰三角形");
        for (int i = 0; i < SS; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //菱形
        System.out.println("菱形");
        for (int i = 0; i < SS; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int f=0;f<4;f++) {
        	for(int g=0;g<=f;g++){
        		System.out.print(" ");
        	}
        	
        	for(int h=1;h<=7-2*f;h++) {
        		System.out.print("*");
        	}
        	System.out.println();
        	
        }
      
        //9 9乘法表
        System.out.println("9 9乘法表");
        for(int l =1;l<=9;l++) {
        	for(int m=1;m<=l;m++) {
        		System.out.printf(" %d*%d=%-2d",m,l,m*l);
        	}
        	System.out.println();
        }
        
        
        //while循环
        //结构：while(条件){}
        
        //do-while循环
        //结构：do{ }while(表达式);
        //特点：不管表达式是否成立都会先运行do{}里面的循环体
        
        
//---------------------------------------------------------------------------------
        
        //递增，减 运算符
        
        //前缀自增（++i）：
        //首先变量i的值被增加1。
        //然后表达式的值是增加后的i的值。

        int a = 5;
        int b = ++a;
        System.out.println(b); // 输出：6
        System.out.println(a); // 输出：6
        
        //后缀自增（i++）：
       // 表达式的值是变量i的当前值。
        //然后变量i的值被增加1。

        int a1 = 5;
        int b1 = a1++;
        System.out.println(b1); // 输出：5
        System.out.println(a1); // 输出：6
        
        //前缀自减（--i）：
        //首先变量i的值被减去1。
        //然后表达式的值是减去后的i的值。
        int a2 = 5;
        int b2 = --a2;
        System.out.println(b2); // 输出：4
        System.out.println(a2); // 输出：4
        
        //后缀自减（i--）：
       // 表达式的值是变量i的当前值。
        //然后变量i的值被减去1。

        int a3 = 5;
        int b3 = a3++;
        System.out.println(b3); // 输出：5
        System.out.println(a3); // 输出：4
    }
}

