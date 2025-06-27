package 多线程模拟发拼手气红包;

/**
 * 2.成员类（多线程的）
 *      属性：姓名，金额
 *      方法：抢红包
 */
public class Member implements Runnable{

    private String name;

    private Double money;

    private RedBag redBag;

    public Member(String name,RedBag redBag) {
        this.name = name;
        this.redBag = redBag;
    }

    @Override
    public void run() {
        //抢红包的逻辑
        Double money = redBag.giveMoney();
        if(money == 0){
            System.out.println("震惊！！！"+name+"竟然没有抢到红包！！！");
        }else{
            System.out.println("恭喜！！！"+name+"抢到了"+money+"元,今晚请吃饭");
        }
        this.money = money;
    }
}
