package day5_package;

public class demo1_StaticMethod {
    public static void main(String[] args) {
        demo2_MyClass obj = new demo2_MyClass();//创建对象
        obj.method();

        demo2_MyClass.methodStatic();
        myMethod();
    }
public static void myMethod()
        {
            System.out.println("自己内部的静态方法");
        }


}
