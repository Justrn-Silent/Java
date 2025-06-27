package 在线商城商品分类管理系统_重构版;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class error extends Exception{
	public error(String e) {
		super(e);
	}
}
public class storage_space {
	static Map<String,List<goods>> m = new HashMap<>();
	//添加商品分类
	public static void add_class(String s) throws error {
		if(m.isEmpty()) {
			m.put(s, null);	
			System.out.println("商品分类名：【"+s+"】添加成功！！");
		}else if(!m.containsKey(s)) {
			m.put(s, null);	
			System.out.println("商品分类名：【"+s+"】添加成功！！");
		}else {
			throw new error("分类名称不能相同！！");
		}	
	}
	public static void add_product(String s1,String s2,double s3) throws error {
		if(m.containsKey(s1)) {
			goods g = new goods(s2, s3);
			List<goods> l1 =new ArrayList<goods>();
			l1.add(g);
			m.put(s1, l1);	
			System.out.println("【类名:"+s1+"】【商品为："+s2+"】【价格为："+s3+"】"+"添加成功！");
		}else {
			throw new error("没有查找到"+s1+"类别");
		}
		
	}
}
