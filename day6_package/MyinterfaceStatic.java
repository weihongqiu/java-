package day6_package;
/*
在任何版本Java中，接口都能定义抽象方法
格式：
public abstract 返回值类型 方法名称（参数列表）；
接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
 可以选择性省略
 */
public interface MyinterfaceStatic {
public static void methodStatic()
    {
        System.out.println("这是一个接口的静态方法");
    }
}
