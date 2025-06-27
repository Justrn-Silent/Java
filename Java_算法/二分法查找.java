package Java_算法;

import java.util.Random;
import java.util.Scanner;

public class 二分法查找 {
	
	static int[] oo() {
			int[] arr = {65,55,32,12,43,44,22,54,33};
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
			return arr;
		}
	public static void main(String[] args) {
		int arr1[]=oo();
		//22
		
	}
}
