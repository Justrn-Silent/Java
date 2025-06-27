package 银行模拟储蓄系统_重构版;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bank_system {
//	private static bank_Account ba[] =new bank_Account[10];
	static List<bank_Account> ba =new ArrayList<>();
	private static int count=0;
	static String []com=null;
	public static void main(String[] args) throws NumberFormatException, ParseException, 输入错误 {
		main();
	}
	static void main() throws NumberFormatException, ParseException {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\t\t\t\t\t==== 银行账户管理系统 ====\r\n"
					+ "\t\t\t\t\t开户格式：账号,姓名,金额,开户日期(yyyy-MM-dd)\r\n"
					+ "\t\t\t\t\t转账格式：转出账号,转入账号,金额\r\n"
					+ "\t\t\t\t\t查询所有账户：输入 *");
			System.out.println("请输入：");
			String s =sc.next();
			com =s.split(",");
			try {
			 if("*".equals(s)) {
					Allaccount();
					
			}else if(com.length==4){
			
					CreatAccount();
				
			}else if(com.length==3) {
				StreamAccount();
				
				
			}else {
				System.out.println("输入错误！！");
		}
			} catch (输入错误 e) {
				// TODO 自动生成的 catch 块
				System.out.println("操作失败："+e.getMessage());
			}
	}
}
	private static void StreamAccount() throws NumberFormatException {
		boolean o =false;
		for(int i=0;i<count;i++) {
			if(ba.get(i).getAccount_name().equals(com[0])) {
				for(int j=0;j<count; j++) {
					if(ba.get(j).getAccount_name().equals(com[1])) {
							double out=ba.get(i).getMoney_last()-Double.parseDouble(com[2].trim());
							if(ba.get(i).getMoney_last()-Double.parseDouble(com[2].trim())>=0) {
								ba.get(i).setMoney_last(out);
							}else {
								System.out.println("转出账号余额不足！！");
								break;
							}
							
							double in =ba.get(j).getMoney_last()+Double.parseDouble(com[2].trim());
							ba.get(j).setMoney_last(in);
							o=true;
							}
					
						}
				
					}
			
				}
		if(o) {
			System.out.println("转账成功！！");
		}else {
			System.out.println("转账失败！！");
		}
				}
		
		
		
	
	private static void CreatAccount() throws NumberFormatException, ParseException, 输入错误 {
	
//		ba[count]=new bank_Account(com[0].trim(), com[1].trim(), Double.parseDouble(com[2].trim()),com[3]);
			ba.add(new bank_Account(com[0].trim(), com[1].trim(), Double.parseDouble(com[2].trim()),com[3]));
		count++;
		System.out.println("创建成功");
		}
	
	private static void Allaccount() {
		for(int i =0;i<count;i++) {
			System.out.println(ba.get(i));
		}
		
	}
}


