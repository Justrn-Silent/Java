package 银行模拟储蓄系统;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BankSystem {
    private static SavingsAccount[] accounts = new SavingsAccount[10];
    private static int count = 0;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== 银行账户管理系统 ====");
        System.out.println("开户格式：账号,姓名,金额,开户日期(yyyy-MM-dd)");
        System.out.println("转账格式：转出账号,转入账号,金额");
        System.out.println("查询所有账户：输入 *");

        while (true) {
            System.out.print("\n请输入操作：");
            String input = scanner.nextLine().trim(); 

            try {
                if (input.equals("*")) {
                    showAllAccounts();
                } else if (input.contains(",")) {  // 判断字符串是否存在指定字符串，
                    processOperation(input);
                }else {
                	System.out.println("格式错误！！");
                }
            } catch (InvalidAccountException | InsufficientBalanceException| TransferLimitException | DateTimeParseException e) {
                System.out.println("操作失败: " + e.getMessage());
            }
        }
    }

    private static void processOperation(String input) throws Exception {
        String[] parts = input.split(",");  //按照逗号分割

        if (parts.length == 4) {
            createAccount(parts);
        } else if (parts.length == 3) {
            transferMoney(parts);
        } else {
            throw new InvalidAccountException("无效的输入格式");
        }
    }

    private static void createAccount(String[] parts) throws Exception {
        if (count >= accounts.length) {
            throw new InvalidAccountException("系统账户已达上限");
        }

        String accountNo = parts[0].trim();  //trim()去除首尾空白符
        String name = parts[1].trim();
        double amount = Double.parseDouble(parts[2].trim());  //string-->double
        String dateStr = parts[3].trim();

        SavingsAccount account = new SavingsAccount(accountNo, name, amount, dateStr);  //调用传参-->父类
        accounts[count++] = account;
        System.out.println("开户成功：" + account);
    }

    private static void transferMoney(String[] parts) throws Exception {
        String fromNo = parts[0].trim();
        String toNo = parts[1].trim();
        double amount = Double.parseDouble(parts[2].trim());

        BankAccount from = findAccount(fromNo);  //获取转出账号
        BankAccount to = findAccount(toNo);    //获取转入账号

        if (from == null || to == null) {
            throw new InvalidAccountException("账户不存在");
        }
        from.transferTo(to, amount);

        System.out.printf("转账成功：%s -> %s 金额：%.2f\n",
                from.getAccountNo(), to.getAccountNo(), amount);
    }

    private static BankAccount findAccount(String accountNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNo().equals(accountNo)) {
                return accounts[i];
            }
        }
        return null;
    }

    private static void showAllAccounts() {
        System.out.println("\n=== 账户列表 ===");
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
    }
}

