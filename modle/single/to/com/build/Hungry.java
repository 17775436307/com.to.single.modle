package modle.single.to.com.build;
//单例模式的建立,有三个步骤1.创建类中私有构造2.创建该类型的私有静态实例.3.创建公有静态方法返回静态实例对象
//一.饿汉形式的建立，即创建的时候就给他实例化对象初始化,空间换时间，因为实例化占的空间一直存在，而在写主代码时就不用写实例化对象了
public class Hungry {
    //1.创建类中私有构造
    private Hungry(){

    }
    //2.创建该类型的私有静态实例
    private static Hungry instance=new Hungry();
    //3.创建公有静态方法返回静态实例对象
    public static Hungry getInstance(){
        return instance;
    }
}
