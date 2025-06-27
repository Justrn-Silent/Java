package Java_进阶;
class Day{  //日期类
	private int year;  //年
	private int month;  //月
	private int date; //日
	
		//构造函数
		Day(int year,int month,int date){
			this.year=year;
			this.date=date;
			this.month=month;
		}
	//构造函数
		int GetYear() {
			return year;  //返回年
		}
		int GetMonth() {
			return month; //返回月
		}
		int GetDate() {
			return date; //返回日
		}
}
public class Class_深入日期类{
	public static void main(String[]args) {
		Day A = new Day(2006,2,16);
		System.out.printf("%d年%d月%d日",A.GetYear(),A.GetMonth(),A.GetDate());
		
	}
}
	
