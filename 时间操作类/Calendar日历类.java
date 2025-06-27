package 时间操作类;
 //这些都是静态字段，理应用类名访问
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
Calendar 类是一个抽象类，为我们提供了关日期计算的相关功能秒的展示和计算。比如月、日、时、分、秒的展示和计算。
GregorianCalendar 是 Calendar 的一个具体子类,提供了世界上大多数国家/地区使用的标准日历系统。
注意::
月份的表示，一月是0，二月是1，以此类推，12月是11。 
因为大多数人习惯于使用单词而不是使用数字来表示月份，
这样程序也许更易读，父类Calendar使用常量来表示月份:JANUARYFEBRUARY等等。
 */
public class Calendar日历类 {
	public static void main(String[] args) {
	//获得日期信息
		Calendar g = new GregorianCalendar(2025,12,1);
		System.out.println(g.get(g.DAY_OF_WEEK));  //星期几？1-7：1：星期日，2：星期一....7：星期六
		System.out.println(g.get(g.DAY_OF_YEAR));
		System.out.println(g.get(g.WEEK_OF_YEAR));
		
//		ERA：时代。
//		YEAR：年。
//		MONTH：月（注意月份从0开始计数，0表示1月）。
//		DAY_OF_MONTH：月中的一天。
//		DAY_OF_YEAR：年中的一天。
//		DAY_OF_WEEK：周中的一天。
//		HOUR_OF_DAY：一天中的小时数（24小时制）。
//		MINUTE：分钟。
//		SECOND：秒。
//		MILLISECOND：毫秒。
//		WEEK_OF_YEAR：年中的第几周。
//		WEEK_OF_MONTH：月中的第几周‌

	//设置日期信息
		Calendar g1 = new GregorianCalendar(); //不传参数默认当前时间参数
		System.out.println(g1);
	//修改
		g1.set(g1.YEAR, 2018);
		g1.set(g1.MONTH, 2);
		g1.set(g1.DAY_OF_MONTH, 1);
		System.out.println(g1);
	
	//日期的计算
		Calendar g2 = new GregorianCalendar();
		g2.add(g2.DATE, 100);
		System.out.println(g2);
	
	//日期对象与时间对象转换
		Date s = g2.getTime();
		System.out.println(s);
	}
}
