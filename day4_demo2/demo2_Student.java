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
public class demo2_Student {

    public static void main(String[] args) {
        Student stu=new Student();//其实就是在调用构造方法,无参构造方法
        Student stu2=new Student("赵丽颖",20);//全参构造方法
        System.out.println("姓名："+stu2.getName()+"年龄"+stu2.getAge());
        stu2.setAge(31);
        stu2.setName("冯绍峰");
        System.out.println("姓名："+stu2.getName()+"年龄"+stu2.getAge());
    }
}
