package 在线商城商品分类管理系统_重构版;

import java.util.List;
import java.util.Scanner;

class goods{
	private String name;
	private double price;
	public goods(String name, double s3) {
		this.name = name;
		this.price = s3;
	}
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "商品名称" + name + " 价格：" + price;
	}	
} 
public class product {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) throws error {
		Main();
	}
	public static void Main()  {
		boolean out =true;
		while(out) {
			try {
	            System.out.println("1. 添加商品分类");
	            System.out.println("2. 添加商品到分类");
	            System.out.println("3. 显示所有分类及商品");
	            System.out.println("4. 计算某个分类下商品的总价");
	            System.out.println("5. 查找包含特定商品的分类");
	            System.out.println("6. 退出");
	            System.out.println("请选择操作：");
	            String s =scan.next();
			switch(s) {
			case "1":
				addproduct_class();
				break;
			case "2":
				addproduct_to_class();
				break;
			case "3":
				show_allproductclass();
				break;
			case "4":
				priduct_allprice();
				break;
			case "5":
				find_product();
				break;
			case "6":
				System.out.println("退出成功！！");
				out=false;
				break;
			 default:
                 System.out.println("无效的选择，请重新输入。");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}	
	}
	private static void addproduct_class() throws error {
		System.out.println("请输入新增的商品分类：");
		String sc =scan.next();
		storage_space.add_class(sc);
		
	}
	private static void addproduct_to_class() throws error {
		if(!storage_space.m.isEmpty()) {
		System.out.println("请输入商品分类名称：");
		String sc_1 =scan.next();
		System.out.println("请输入要添加的商品名称：");
		String sc_2 =scan.next();
		System.out.println("请输入商品价格：");
		double sc_3 =scan.nextInt();
		storage_space.add_product(sc_1,sc_2,sc_3);
		}else {
			throw new error("请先创建分类！！");
		}
		
	}
	private static void show_allproductclass() {
		String key[] = new String[storage_space.m.size()];
		String k = String.valueOf(storage_space.m.keySet());		
		key =k.split(",");
		for(int i=0;i<storage_space.m.size();i++) {
			System.out.println(key[i].charAt(1)+"类：");
			goods g1 = (goods) storage_space.m.get(key[i].charAt(1));
			System.out.print(g1);
			System.out.println();
		}
		
	}
	private static void priduct_allprice() {
		
		
	}
	private static void find_product() {
		
		
	}

}
