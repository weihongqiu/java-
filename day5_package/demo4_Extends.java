package day5_package;
/*
在继承关系中，子类就是一个父类，也就是子类可以当作父类看待
父类是员工，子类是讲师，讲师就是一个员工，is-a
父类格式：
public class 父类名称{}
子类格式：
public class 子类名称 Extends父类名称{}

 */
public class demo4_Extends {

    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher=new Teacher();
        teacher.method();
        //子类当中什么都没有，但是执行了父类中的内容
        Assistant assistant=new Assistant();
        assistant.method();
    }
    }




