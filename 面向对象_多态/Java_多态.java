package 面向对象_多态;
/*多态指的是同一个方法调用，由于对象不同可能会有不同的行为。现实生活中，同一个方法，具体实现会完全不同
 
 多态的要点
1.多态是方法的多态，不是属性的多态(多态与属性无关)。
2.多态的存在要有3个必要条件:继承，方法重写，父类引用指向子类对象。
3.父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了。
  */
 class Animal {
    void sat() {
        System.out.println("ooo");
    }
}

 class dog extends Animal {
    void sat() {
        System.out.println("www");
    }
    void eat() {
    	System.out.println("ccc");
    }
  
}
 class cat extends Animal {
    void sat() {
        System.out.println("mmm");
    }
}

 class bird extends Animal {
    void sat() {
        System.out.println("jjj");
    }
}

public class Java_多态 {
    static void DT(Animal A) {
        A.sat();
    }

    public static void main(String[] args) {
        Animal s = new Animal();  
        DT(s);
        Animal s1 = new dog();
        //s1接收的是堆区dog类的空间地址，但是由于s1接收数据类型的限制只能是Animal类型的数据，所以dog独有的字段，s1是无法调用的
        //这种情况也叫做：向上自动转型(隐式)
        DT(s1);
        Animal s2 = new cat();
        DT(s2);
        Animal s3 = new bird();
        DT(s3);
        //既然有向上自动转型也有向下转型：
        dog s4 = (dog)new Animal();//强制转型
        s4.eat(); //虽然编译成功，但运行报错：Animal cannot be cast to dog
        //s4接收的是堆区Animal类的空间地址，但是由于s4接收数据类型的限制只能是dog类型的数据
        //当s4.eat();时候满足接收类型但由于s4指向Animal类且Animal类中没有eat方法，所以运行报错
        }
}

