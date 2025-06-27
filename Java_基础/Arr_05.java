package Java_基础;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Arr_05 {
	public static void main(String[]args) {
		//第一种数组声明方式
		
		//type 数组名[]=new type[长度]
		/*
		 数组名[]  ：只是单纯声明是数组 ，[]方括号内不能添加数
		 type[长度] ：这才是申请空间大小与返回类型
		 这种声明方式：只是声明数组，但没有初始化这些内存空间中的值，没有初始化默认为0
		 这种方式初始化空间：循环结构
		*/			 
		//数组(相比C的数组，Java的数组封装了一个类[结构体])
		int a[]=new int[5];
		for(int a1 =0;a1<a.length;a1++) { //length是数组里面的类成员，作用是获取数组的内存长度 ,返回类型是int
			a[a1]=a1+1;
			System.out.printf("a[%d]=%d\n",a1,a[a1]);
		}
		System.out.println();  //换行
		
		
		//第二种数组声明方式
		//type 数组名[]={元素1，元素2，元素3，元素4，.......};
		/*
		   数组名[]  ：只是单纯声明是数组 ，[]方括号内不能添加数
		   数组的大小由初始化时提供的元素数量决定
		   由于使用了初始化列表，Java编译器能够推断出数组元素的类型
		 */
		int b[]= {1,2,3,4,5,6,7};
		for(int a1=0;a1<b.length;a1++) {
			System.out.printf("b[%d]=%d\n",a1,b[a1]);
		}
		
		System.out.println();  //换行
		
		
		
		//类似C99变长数组
		Scanner sanf = new Scanner(System.in);
		System.out.print("请输入数组长度：");
		int aa =sanf.nextInt();
		int arr[] = new int[aa];  //变长数组
		for(int a1 =0;a1<arr.length;a1++) { 
			arr[a1]=a1+1;
			System.out.printf("a[%d]=%d\n",a1,arr[a1]);
		}
		
		System.out.println();  //换行
		
		
		
		//拓展for(for-each)语句，只用于读取不用于修改,遍历数组的便捷方式
		int a2[]= {1,2,3,4,5,6,7,8};
		for(int a1:a2) { //length是数组里面的类成员，作用是获取数组的内存长度
			System.out.printf("%d\n",a1);
			
		}
		
		System.out.println();  //换行
		
		//Java的数组名(在C中的数组名表示数组首元素地址或者整个数组地址)
		int arr_1[]= new int[6];
			arr_1[0]=1;
		System.out.println(Integer.toHexString(arr_1[0])); //首元素地址
		
		System.out.println("打印数组名："+arr_1); //[I@4cb2c100  -->>打印地址
		
		System.out.println(arr_1[0]); //首元素
									/*其中：：
									 	[	:表示当前是数组
									 	I	:表示当前数组返回类型是int
									 	@	:固定标识符
								 4cb2c100  :表示当前数组的地址，即：0X4cb2c100  (注意这里仅仅只是arr_1首元素的地址，并不是首元素地址的值16进制地址)
									 */
		//结论：：在Java中数组名的地址就是数组首元素地址（所以两个存储内容相同不同的数组名进行比较大小很显然是不同的）
		
		//例子：
		//数组判断MAX与MIN
		int a3[]= {1,2,3,4,5,6,7,8};
		int max=a3[0];
		int min=a3[0];
			for(int a4=0;a4<8;a4++) {
				if(max<a3[a4]) {
					max=a3[a4];
				}
				if(min>a3[a4]) {
					min=a3[a4];
				}
			}
			System.out.printf("max:%d\n",max);
			System.out.printf("min:%d\n",min);
		
			
			System.out.println();  //换行
			
			
			
		//倒序排序
			int sw[]= {1,2,3,4,5,6,7,8};
			for(int a5=0;a5<sw.length/2;a5++) {
				int SW=0;
				SW=sw[a5];
				sw[a5]=sw[sw.length-a5-1];
				sw[sw.length-a5-1]=SW;
			}
			System.out.print("倒序结果：");
		for(int a5=0;a5<sw.length;a5++) {
			System.out.printf(" %d",sw[a5]);
			
		}
		
		
		System.out.println();  //换行
		
		
		//冒泡排序
		//1,随机数组生成
		System.out.printf("请输入数组长度:");
		Scanner sc = new Scanner(System.in);
		Random sj = new Random();
		int scs = sc.nextInt();
		int nn[] = new int[scs];
		System.out.print("数组初始化：");
		for(int o=0;o<scs;o++) {
			nn[o]= 10+ sj.nextInt(90);
			System.out.printf(" %d",nn[o]);
		}
		
		System.out.println();
		
		//2,冒泡排序
	//	int nn[]= {22,1,0,5,3,2,6,7};
		for(int ii=1;ii<nn.length;ii++) {
			for(int i =0;i<nn.length-1;i++) {
			if(nn[i]>nn[i+1]) {
				int j=0;
				j=nn[i];
				nn[i]=nn[i+1];
				nn[i+1]=j;
			}
		}
		}
		//3,输出排序结果
		for(int j:nn) {
			System.out.printf(" %d", j);
		}
		
		
		System.out.println();  //换行
	
		//final修饰符，常量修饰

		final int arr1[]= new int[10];
		int arr2[]= new int[10];
		arr2 =new int[4];  //成立
		//arr1 = new int[4];  //报错
		arr1[0]=1;  //成立
		arr2[0]=1;  //成立
		//final修饰的数组无法修改其数组长度
		
		
		System.out.println();  //换行
		
		
		//二维数组(多维数组)
		//初始化两种方法：
		int arr3[][]=new int[3][5];
		int arr4[][]= {	{1,2,3,4,5},
						{2,3,4,5,6},
						{3,4,5,6,7}};
		//创建arr3数组
		for(int i =0;i<3;i++) {
			for(int j =0;j<5;j++) {
				arr3[i][j]=10+sj.nextInt(90);
				
			}
		}
		//打印arr3数组
		for(int i1 =0;i1<3;i1++) {
			for(int j1 =0;j1<5;j1++) {
				System.out.printf(" arr3[%d][%d]=%-2d", i1,j1,arr3[i1][j1]);
			}
			System.out.println();  //换行
		}
		
		
		System.out.println("--------------------------------------------------");  //换行
		
		
		//打印arr4数组
		for(int i1 =0;i1<3;i1++) {
			for(int j1 =0;j1<5;j1++) {
				System.out.printf(" arr3[%d][%d]=%-2d", i1,j1,arr4[i1][j1]);
			}
			System.out.println();  //换行
		}
		
		
		System.out.println();  //换行
		
		
	}
}
