package 多线程模拟发拼手气红包;
/**
 * 要求使用多线程模拟发拼手气红包的情景。首先确认群成员的个数和昵称（假设发红包的人不参与抢红包），发红包的人输入红包总金额和红包个数，群成员进行抢红包。
 * 红包金额随机，(但最多不能超过总金额的一半)。在领取完红包后，显示群成员的红包金额。
 * 拼手气红包规定，当群成员数量小于红包个数时，存在抢不到的成员，(但被抢到的红包大小不能小于0.01元)。
 */

import java.util.*;

/**
 * 1.红包类
 *      属性：总金额，数量
 *      方法：发红包
 * 2.成员类（多线程的）
 *      属性：姓名，金额
 *      方法：抢红包
 * 3.测试类
 */
public class Test {

    public static void main(String[] args) {
//        Random random = new Random();
//        double randomDouble = random.nextDouble(); //(0.0,1.0)
//        System.out.println(randomDouble);
//
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
//        String format = decimalFormat.format(randomDouble);
//        System.out.println(format);
//        double v = Double.parseDouble(format);
//        System.out.println(v);

        System.out.println("请输入成员名称,以0结束");
        Scanner scanner = new Scanner(System.in);
//        List<String> nameList = Arrays.asList("张三", "李四", "王五");
        List<String> nameList = new ArrayList<>();
        while (true){
            String next = scanner.next();
            if (next.equals("0")){
                System.out.println("添加完毕");
                System.out.println("成员有:"+nameList);
                break;
            }
            nameList.add(next);
            System.out.println("添加成功");
        }
        System.out.println("请输入红包金额：");
        double money = scanner.nextDouble();
        System.out.println("请输入红包数量");
        int num = scanner.nextInt();
//        RedBag redBag = new RedBag(5.0,3);
        RedBag redBag = new RedBag(money,num);
        System.out.println("开始抢红包");
        for (String name : nameList) {
            Member member = new Member(name,redBag);
            Thread thread = new Thread(member);
            thread.start();
        }
        System.out.println("抢红包结束");
    }
}
