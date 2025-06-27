package 银行模拟储蓄系统_重构版;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.regex.Pattern;

public class bank_Account {
	private String Account_name;  //账号
	private String Account_ID;  //姓名
	private double money_last;  //余额
	private Date date;
	 SimpleDateFormat s =new SimpleDateFormat("yyyy-MM-dd");
	public bank_Account(String account_name, String account_ID, double money_last, String date) throws ParseException, 输入错误 {
		if(account_name.length()==6) {
		Account_name = account_name;
		}else {
			throw new 输入错误(account_name+"输入格式出错，账号定义为7位");
		}
		if(account_ID!=null) {
		Account_ID = account_ID;
		}else {
			throw new 输入错误("输入出错ID不能为空！！");
		}
		if(money_last>=100) {
		this.money_last = money_last;
		}else{
			throw new 输入错误("你存入金额："+money_last+"【存入金额必须100元起步】");
		}
//		if(pat_1.matcher(date).matches()||pat_2.matcher(date).matches()||pat_3.matcher(date).matches()||pat_4.matcher(date).matches()) {
		try {
			this.date = s.parse(date);
		//}else {
		}catch (DateTimeParseException e) {
			throw new 输入错误(date+"【输入格式有误！！】");
		}
	}		
		
	

	public double getMoney_last() {
		return money_last;
	}
	public void setMoney_last(double money_last) {
		this.money_last = money_last;
	}
	public String getAccount_name() {
		return Account_name;
	}
	public String getAccount_ID() {
		return Account_ID;
	}
	public Date getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		System.out.println("------------银行账户管理系统------------");
		return "-----------------------------------------\n账户名：" + Account_name +"\n"+ "账号：" + Account_ID +"\n"+ "余额："
				+ money_last +"\n"+ "注册时间：" + s.format(date) +"\n"+ "-----------------------------------------";
	}

	
}
