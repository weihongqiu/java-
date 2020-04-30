package day4_demo2;
//标准类：包含四部分
/*
1、所有成员变量都要使用private关键字修饰
2、为每一个成员变量编写一对getter/setter方法，
按照code-generate-getter and setter自动生成
3、编写一个无参数的构造方法，code-generate-constructor(构造器)
4、编写一个全参数的构造方法
* */

public class Stu_Javabean1 {
    public static void main(String[] args) {
        Stu_Javabean stu1=new Stu_Javabean();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("姓名："+stu1.getName()+"年龄:"+stu1.getAge());
        Stu_Javabean stu2=stu1;
        stu2.setAge(23);
        System.out.println("姓名："+stu1.getName()+"年龄:"+stu1.getAge());
    }
}