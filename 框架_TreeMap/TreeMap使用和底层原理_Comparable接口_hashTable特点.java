package 框架_TreeMap;

import java.util.Map;
import java.util.TreeMap;
//TreeMap与hashmap不同，TreeMap会自动排序
public class TreeMap使用和底层原理_Comparable接口_hashTable特点 {
	public static void main(String[]args) {
		Map<Integer,String> treemapl = new TreeMap<>();
		treemapl.put(20,"aa");
		treemapl.put(3, "bb");
		treemapl.put(6,"cc");
	
			//按照key递增的方式排序
	for(Integer key:treemapl.keySet()){
		System.out.println(key+"---"+treemapl.get(key));
	
		}
	Map<Emp,String>treemap2 = new TreeMap<>();
	treemap2.put(new Emp(100,"张三",50000),"张三是个好小伙");
	treemap2.put(new Emp(200,"李四",5000),"李四工作不积极");
	treemap2.put(new Emp(150,"王五",6000),"王五工作还不错");
	
	for(Emp key:treemap2.keySet()){
		System.out.println(key+"---"+treemap2.get(key));
	}
}
}
class Emp implements Comparable<Emp>{
	int id;
	String name;
	double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Emp o) {  //负数:小于，0:等于，正数:大于
		// 这个方法会被TreeMap自动调用！！
		/*
		 Compares this object with the specified object for order. 
		 Returns anegative integer, zero, or a positive integer as this object is lessthan, 
		 equal to, or greater than the specified object. 
		 将此对象与指定对象进行比较以进行顺序。当此对象小于、等于或大于指定对象时，返回负整数、0或正整数。
		 */
		if(this.salary>o.salary){
			return 1;
			}else if(this.salary<o.salary){
				return -1;
				}else{
					if(this.id>o.id){
						return 1;
						}else if(this.id<o.id){
							return -1;
							}else{
								return 0;
				}
			}
		}
	public String toString() {
		return "id:"+id+",name:"+name+",salary:"+salary;
	}
	}
	/*
HashMap与HashTable的区别
1.HashMap:线程不安全，效率高。允许key或value为null。
2.HashTable: 线程安全，效率低。不允许key或value为null。   
	 */
