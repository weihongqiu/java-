package day6_package;

public class demo5_interfacedefMain {
    public static void main(String[] args) {
        demo6_interfacedefaultA a=new demo6_interfacedefaultA();
        a.methodAbs();
        a.methodDefault();//调用默认方法，如果实现类当中没有，会向上找接口
        demo6_interfacedefaultB b=new demo6_interfacedefaultB();
        b.methodAbs();
        b.methodDefault();//实现类B覆盖重写了接口的默认方法

    }
}
