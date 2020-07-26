package modle.single.to.com.build;
//二.懒汉式建立，跟Hungry的结构差不多，只是在创建实例化对象时不给他初始化,即为空值

public class Lazy {
    //1.
    private Lazy(){

    }
    //2.创建一个静态私有实例化对象但不给初始化
    private static Lazy instance=null;
    //3.创建一个公有静态返回实例化对象的方法，并在运行时判断实例化对象是否初始化后，再返回实例化对象

    public static Lazy getInstance() {
        if(instance==null)
            instance=new Lazy();

        return instance;
    }
}
