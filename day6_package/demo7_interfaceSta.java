package day6_package;

//注意事项：
/*
不能通过接口实现类的对象来调用接口当中的静态方法，通过接口名称调用静态方法
 */

public class demo7_interfaceSta  {
    public static void main(String[] args) {
        demo7_interfaceimpl impl=new demo7_interfaceimpl();
        MyinterfaceStatic.methodStatic();//接口名称调用静态方法

    }
}


