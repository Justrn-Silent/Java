package 多线程模拟发拼手气红包;


import java.text.DecimalFormat;
import java.util.Random;

/**
 * 1.红包类
 *      属性：总金额，数量
 *      方法：发红包
 */
public class RedBag {

    /**
     * Double ---> double
     */
    private Double totalMoney;

    /**
     * Integer ---> int
     */
    private Integer num;

    public RedBag(Double totalMoney, Integer num) {
        this.totalMoney = totalMoney;
        this.num = num;
    }

    public synchronized Double giveMoney(){
        Double money;
        if(num>1){
            /**
             * 当num>1时
             * 假设 totalMoney = 5，随机金额（0,5）
             * 第一次发了 1元，第二次的随机金额 (0,4)
             * 第二次发了 1元，第三次的随机金额 (0,3)
             * 实际应该是（0,totalMoney）
             */
            //生成随机金额
            Random random = new Random();
            double randomDouble = random.nextDouble(); //(0.0,1.0)
            money = randomDouble * totalMoney;

            //格式化
            money = formatDouble(money);

            //更新金额和红包数量
            totalMoney -= money;
            totalMoney = formatDouble(totalMoney);
            num--;
        }else if(num == 1){
            //当num==1,发的金额就是 totalMoney
            money = totalMoney;
            //更新金额和红包数量
            totalMoney = 0.0;
            num--;
        }else{
            //当num==0，发的金额就是 0.0
            money = 0.0;
        }
        return money;
    }

    public Double formatDouble(Double money){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String moneyStr = decimalFormat.format(money);
        return Double.parseDouble(moneyStr);
    }

}
