package day5_package;
/*
在继承关系中，子类就是一个父类，也就是子类可以当作父类看待
父类是员工，子类是讲师，讲师就是一个员工，is-a
父类格式：
public class 父类名称{}
子类格式：
public class 子类名称 Extends父类名称{}

在父子类的继承中，如果变量重名，则创建子类对象时，访问有两种方式：
直接通过子类对象访问成员变量
等号左边是谁，就优先用谁，没有则向上找

间接通过成员方法访问成员变量
该方法属于谁，就优先用谁，没有则向上找
 */
public class demo4_ExtendsField {

    public static void main(String[] args) {
        //创建一个父类对象
        Fu fu=new Fu();
        System.out.println(fu.numFu); //只能使用父类的内容，不能使用子类内容
        Zi zi=new Zi();//等号左边是谁，就优先用谁，没有则向上找
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println(zi.num);
    //方法是子类的，就用子类中的，没有再向父类找
        zi.methodZi();//200
zi.methodFu();//100
    }
    }




