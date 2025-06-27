package 时间操作类;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 .DateFormat类的作用
把时间对象转化成指定格式的字符串。反之，把指定格式的字符串转化成时间对象。
DateFormat是一个抽象类，一般使用它的的子类SimpleDateFormat类来实现。
 */
/*
y: 年份
M: 月份
d: 日期
H: 小时（0-23）
h: 小时（1-12）
m: 分钟
s: 秒
S: 毫秒
E: 星期几
D: 年中的天数
F: 月份中的星期（1=第一个星期）
w: 年中的周数
W: 月份中的周数
a: 上午/下午标记器
K: 小时（0-11）
k: 小时（1-24）
Z: 时区
 */
public class Dateformat类 {
	public static void main(String[] args) throws ParseException {
//时间对象转化成指定格式的字符串
		DateFormat df =new SimpleDateFormat("yyyy年MM月dd日hh小时mm分ss秒");
		//没什么区别：SimpleDateFormat df =new SimpleDateFormat("");
		String s =df.format(new Date());
		System.out.println(s);
//把指定格式的字符串转化成时间对象
		DateFormat df1 =new SimpleDateFormat("yyyy年MM月dd日hh小时mm分ss秒");
		Date D =df1.parse("2006年02月16日07小时30分40秒"); //接收字符串Date D =df1.parse(s);
		System.out.println(D); //等价于D..toString()
	}
}