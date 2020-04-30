package day4_demo;

import day4_demo.Day4_demo8class_object;

//出现问题，导入包进行使用出错
// 因为在一个模块下并不是在同一个包下，转移到一个包中问题解决
public class Day4_demo9class_object {
//成员变量
public static void main(String[] args) {
    Day4_demo8class_object stu=new Day4_demo8class_object();

    System.out.println(stu.name);
    System.out.println(stu.age);
    stu.name ="赵丽颖";
    stu.age=18;
    System.out.println(stu.name);
    System.out.println(stu.age);
stu.sleep("小强");
   stu.eat();//调用类中的方法
//将stu保存的对象地址赋值给stu1
    Day4_demo8class_object stu1=stu;

    System.out.println(stu1.name);
    System.out.println(stu1.age);
    stu1.name ="冯绍峰";
    stu1.age=45;
    System.out.println(stu1.name);
    System.out.println(stu1.age);
    stu1.sleep("小斌");
    stu1.eat();//调用类中的方法

}
}
