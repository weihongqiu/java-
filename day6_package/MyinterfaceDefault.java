package day6_package;
/*
在任何版本Java中，接口都能定义抽象方法
格式：
public abstract 返回值类型 方法名称（参数列表）；
接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
 可以选择性省略
 */
public interface MyinterfaceDefault {
public abstract void methodAbs();
public default void methodDefault()
{
    System.out.println("新添加的默认方法");
}
}
