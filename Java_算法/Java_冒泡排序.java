package Java_算法;

import java.util.Random;
import java.util.Scanner;

public class Java_冒泡排序 {
	public static void main(String[] args) {
		//变长数组
		System.out.println("请输入变长数组：");
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		//随机初始化数组[10]
		Random r = new Random();
		int[] arr = new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(100);		
		}
		System.out.print("排序前:");
		for(int i =0;i<arr.length;i++) {
			System.out.printf("--[%d]",arr[i]);
		}
		System.out.println();
	//冒泡排序
		for(int j=0;j<arr.length-1;j++) {
		for(int i=0;i<arr.length-1;i++) {  //for(int i=0;i<arr.length-1-j;i++) {}
			if(arr[i]>=arr[i+1]) {
				int h;
				h=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=h;
			}
		}
		}
		System.out.print("排序后:");
		for(int i =0;i<arr.length;i++) {
			System.out.printf("--[%d]",arr[i]);
		}	
	}
}
