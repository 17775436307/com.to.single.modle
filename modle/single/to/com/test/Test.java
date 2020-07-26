package modle.single.to.com.test;
import modle.single.to.com.build.*;
public class Test {
    public static void main(String []args){
        Hungry one=Hungry.getInstance();//这里是直接调用Hungry的静态公有返回实例对象的方法。因为只创建了私有的构造方法
        Hungry two=Hungry.getInstance();
        System.out.println(one);
        System.out.println(two);
        System.out.println("============================================================");
        Lazy three=Lazy.getInstance();//这里是直接调用Lazy的静态公有返回实例对象的方法。因为只创建了私有的构造方法
        Lazy four=Lazy.getInstance();
        System.out.println(three);
        System.out.println(four);
    }
}

