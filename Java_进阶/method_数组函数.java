package Java_进阶;

public class method_数组函数 {
	static int[] arr() {  //通式：static type[] 名称(){}
		int ar[]=new int[6];
		for(int i=0;i<6;i++) {
			ar[i]=i;
		}
		return ar;
	}
	public static void main(String[]args) {
		int arr1[]=arr();
		
	}
}
