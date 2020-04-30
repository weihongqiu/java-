package day5_package;
/*
一旦使用ststic修饰成员方法，那么就成为了静态方法
静态方法不属于对象，属于类
如果没有static关键字的普通成员方法，那么必须首先创建对象，然后通过对象使用它
 但是静态方法不用创建对象也可以直接使用，通过类名称调用或者对象名,推荐类名称调用
对于本类中方的静态方法，可以省略类名称
注意事项：
1、静态不能直接访问非静态
原因：内存中先有的静态内容，后有非静态内容
2、静态方法中不能用this
原因：this代表当前对象，因为调用利用类名称不用对象，所以就不存在this之说
 */
public class demo2_MyClass {
    int num;//成员变量
    static int numStatic;//静态变量
    //成员方法
    public void method()
    {
        System.out.println("这是一个普通的成员方法");
    //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }
    //静态方法
    public static void methodStatic()
    {
        System.out.println("这是一个静态方法");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态方法不可以访问非静态
        //System.out.println(num);//报错
    }



}
