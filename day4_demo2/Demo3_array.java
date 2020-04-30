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
* */
public class Demo3_array {

    private String name;
    private int age;

    public Demo3_array() {
    }

    public Demo3_array(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
