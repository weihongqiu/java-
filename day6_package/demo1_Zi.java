package day6_package;

public class demo1_Zi extends demo1_Fu {
    int num=20;
    @Override//覆盖重写
    public void method()
    {
        super.method();
        System.out.println("子类方法");
    }
    public void show()
    {
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
