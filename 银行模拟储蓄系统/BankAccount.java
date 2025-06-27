package 银行模拟储蓄系统;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Date;

//账户基类（封装实现）
public class BankAccount {
 private String accountNo;  //账号
 private String owner;  //姓名
 private double balance;  //金额
 private Date openDate;  //开户日期(yyyy-MM-dd)
 	//之前必须将字符串分割再传参
 SimpleDateFormat s =new SimpleDateFormat("yyyy-MM-dd");
 public BankAccount(String no, String name, double amt, String dateStr) throws InvalidAccountException, ParseException {
     // 验证账号格式
     if (!no.matches("\\d{6}")) {
         throw new InvalidAccountException("账号必须为6位数字：" + no);
     }

     // 解析开户日期
     try {
    
         this.openDate = s.parse(dateStr);  //解析字符串中的日期yyyy-mm-dd
     } catch (DateTimeParseException e) {
         throw new InvalidAccountException("日期格式错误：" + dateStr);
     }

     // 验证开户日期
     if (openDate.after(new Date())) {  //判断日期是否在当前日期之前(isafter判断)(now当前日期)
         throw new InvalidAccountException("开户日期不能晚于当前日期");
     }

     // 验证初始金额
     if (amt < 10) {
         throw new InvalidAccountException("初始金额不能小于10元");
     }

     this.accountNo = no;
     this.owner = name;
     this.balance = amt;
 }

 // 转账方法（需子类重写）
 public void transferTo(BankAccount target, double amount)throws InsufficientBalanceException, TransferLimitException {
     if (amount > this.balance) {
         throw new InsufficientBalanceException(
                 String.format("余额不足 (当前余额：%.2f)", this.balance));
     }
     this.balance -= amount;
     target.balance += amount;
 }

 @Override
 public String toString() {
	 
     return String.format("%s | %s | 余额：%.2f | 开户：%s",accountNo, owner, balance, s.format(openDate));
 }

 // Getter方法
 public String getAccountNo() { return accountNo; }
 public double getBalance() { return balance; }
}

/*--------------------------------------------------------------------------------------------------------------------------------*/

//储蓄账户子类（继承与多态）
class SavingsAccount extends BankAccount {
 private static final double MAX_TRANSFER = 50000;

 public SavingsAccount(String no, String name, double amt, String dateStr)throws InvalidAccountException, ParseException {
     super(no, name, amt, dateStr);
 }

 @Override
 public void transferTo(BankAccount target, double amount)
         throws InsufficientBalanceException, TransferLimitException {
     // 检查转账限额
     if (amount > MAX_TRANSFER) {
         throw new TransferLimitException(
                 String.format("单笔转账不得超过%.2f元", MAX_TRANSFER));
     }
     super.transferTo(target, amount);
 }
}