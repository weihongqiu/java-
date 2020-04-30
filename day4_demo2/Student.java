package day4_demo2;

/*构造方法
专门用来创建对象的方法，当用new创建对象时，就是调用构造方法
public 类名称 （参数类型 参数名称）
{方法体}
注意事项：
1、构造方法 的名称必须与所在类名称完全一样
2、不要写返回值类型，void也不要写
3、构造方法不能return
4、如果没有编写任何构造方法，编译器就会创造一个构造方法，没有参数、方法体，什么都不做
5、一旦写了一个构造方法，编译器就不再创造
6、构造方法也可以进行重载，重载：方法名相同，参数列表不同
* */
public class Student {
     private String name;
     private int age;
public Student()
{
    System.out.println("无参数构造方法执行了");
}
public Student(String name,int age)
{
    System.out.println("有参构造方法执行了");
    this.name=name;
    this.age=age;
}

public void setName(String name)
{
    this.name =name ;

}

public String getName()
    {
        return name ;
    }

    public void setAge(int age)
    {
        this.age =age;

    }

    public int getAge()
    {
        return age ;
    }
}

