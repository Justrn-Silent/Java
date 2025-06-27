package 时间操作类;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class 可视化日历 {
	public static void main(String[] args) throws ParseException {
//		Scanner s =new Scanner(System.in);
//		System.out.print("请输入日期(yyyy-mm-dd)：");
//		String str =s.nextLine();
		DateFormat d =new SimpleDateFormat("yyyy-MM-dd");
		Date D1 =d.parse("2006-2-16"); 
		Calendar Ca = new GregorianCalendar();
		Ca.setTime(D1);
		System.out.println(Ca.MONTH);
		System.out.println(Ca.WEEK_OF_MONTH);
		System.out.println(Ca.YEAR);
		System.out.println(Ca.DATE);
		System.out.println("日"+"\t"+"一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六"+"\t");
	
	}
}
