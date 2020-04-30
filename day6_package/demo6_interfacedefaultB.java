package day6_package;

public class demo6_interfacedefaultB implements MyinterfaceDefault {
@Override
    public void methodAbs()
{
    System.out.println("实现了抽象方法，BBB");
}
@Override
public void methodDefault()
{
    System.out.println("实现类B覆盖重写了接口的默认方法");
}

}
