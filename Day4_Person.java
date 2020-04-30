package day4_demo;

//问题描述：定义Preson的年龄时，无法阻止不合理的数值被设置进来。
//解决方案：用private关键字将需要保护的成员变量进行修饰
//一旦使用private进行修饰，那本类中仍然可以随意访问。但是一旦超出本类范围外就不能直接访问了
//修改private值利用setter方法，返回private值利用getter方法，
// 针对一般情况下的数据类型，但boolean类型例外，getter方法一定要写成isXxx的形式，而setter方法不变
//通过谁调用的方法谁就是this。例如本例中person对象调用的sayhello
//this的作用就是区分重名的情况

public class Day4_Person {

    String name;//自己的名字

     private int age;
    private boolean male;
/*
//参数name是对方的名字
    public void sayHello(String name) {
        System.out.println(name + "你好，我是" + this.name);
    }

*/


    public void show()
    {
        System.out.println("我叫"+name+"年龄："+age);
    }
    //既然外部类无法设置age值，那么下面的setAge类专门用于向age设置数据
    public void setAge(int num)
    {
        if(num<100&&num>=9)
        {age=num;}
        else
        {
            System.out.println("数据不合理");
        }
    }
    //专门获取age数据
    public int getAge()
    {
        return age;
    }
    public void setMale(boolean b)
    {
        male=b;
    }
    public boolean isMale()
    {
        return male;
    }
}
