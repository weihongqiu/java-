package day4_demo2;
//标准类：包含四部分
/*
1、所有成员变量都要使用private关键字修饰
2、为每一个成员变量编写一对getter/setter方法，
按照code-generate-getter and setter自动生成
3、编写一个无参数的构造方法，code-generate-constructor(构造器)
4、编写一个全参数的构造方法
* */

public class Stu_Javabean {
    private String name;
    private int age;
//以上自己写，后面快捷键自动生成
    public Stu_Javabean() {
    }

    public Stu_Javabean(String name, int age) {
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