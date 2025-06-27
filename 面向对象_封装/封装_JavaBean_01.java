package 面向对象_封装;

public class 封装_JavaBean_01 {
	private int old;
	private boolean man;
	private String name;
	private double hight;
	
	public int getOld() {  //返回属性
		return old;
	}
	public void setOld(int old) { //修改属性
		if(old>=1&&old<=120) {
		this.old = old;
		}else {
			System.out.println("输入错误，重新输入！！");
		}
	}
	public void isMan() {//返回属性
		if(man==false) {
		System.out.println("女");
		}
		else if(man==true){
			System.out.println("男");
		}
		
	}
	
	public void setMan(String m) {//修改属性
		if(m.equals("女")) {
		this.man = false;
		}
		else if(m.equals("男")){
		this.man = true;
		}else {
	System.out.println("输入错误！！");
		}
	}
	public String getName() {//返回属性
		return name;
	}
	public void setName(String name) {//修改属性
		this.name = name;
	}
	public double getHight() {//返回属性
		return hight;
	}
	public void setHight(double hight) {//修改属性
		if(hight>0) {
		this.hight = hight;
		}else {
			System.out.println("输入错误！！");
		}
	}
	
	
}
