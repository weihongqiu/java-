//使用对象类型作为方法参数
package day4_demo;

public class Day4_demo10class_param {

public static void main(String[] args)
{
    Day4_demo8class_object stu=new Day4_demo8class_object();
stu.name="迪丽热巴";
stu.age=29;
method(stu);
}
public static void method(Day4_demo8class_object param)
{
    System.out.println(param.name);
    System.out.println(param.age);
}
}
