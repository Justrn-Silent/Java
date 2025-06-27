package 时间操作类;
import java.util.Date;
/*在计算机中，我们把1970年1月1日00:00:00(时区问题可能显示：08:00:00)定为基准时间，每个度量单位是毫秒(1秒的千分之一)
---------------------------------------------------------------------------------------------
在标准Java类库中包含一个Date类。它的对象表示一个特定的瞬间，精确到毫秒。
1. Date() 分配一个Date对象，并初始化此对象为系统当前的日期和时间，可以精确到毫秒。
2. Date(long date) 分配 Date 对象并初始化此对象，以表示自从标准基准时间
			(称为“历元(epoch)”,即 1970年1月1日 00:00:00 GMT)以来的指定毫秒数。
3.boolean after(Date when) 测试此日期是否在指定日期之后。
4. boolean before(Date when)测试此日期是否在指定日期之前。
5.boolean equals(Object obj) 比较两个日期的相等性。
6.long getTime() 返回自 1970 年1月1日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
7.String toString() 把此 Date 对象转换为以下形式的 String:dow mon dd hh:mm:ss z2z yyyy 
其中:dow 是一周中的某一天(Sun、 Mon、Tue、Wed、Thu、Fri、 Sat) 
 
 */
public class Date时间类 {
	public static void main(String[] args) {
		Date time =new Date();
		System.out.println(time);
		System.out.println("相比1970年1月1日00:00:00相差毫秒："+time.getTime());
		Date time1 =new Date(2000);
		System.out.println(time1);
		System.out.println("相比1970年1月1日00:00:00相差毫秒："+time1.getTime());
		//以1970年1月1日00:00:00为基准
		System.out.println(time.after(time1));
		System.out.println(time.equals(time1));
		System.out.println(time.toString());  //与System.out.println(time);效果一样，无非是显式调用与隐式调用toString()方法
		System.out.println(time1.toString());
	}
}
