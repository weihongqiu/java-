package day5_package;

public class demo1_StaticStudent {
    public static void main(String[] args) {
//首先设置教室，静态变量，应该利用类名称进行调用
        Student.room="101教室";
        Student one=new Student("郭靖",19);
        Student two=new Student("黄蓉",16);
        System.out.println("姓名："+one.getName()+
                "年龄:"+one.getAge()+"教室"+Student.room);
        System.out.println("姓名："+two.getName()+
                "年龄:"+two.getAge()+"教室"+Student.room);

    }
}
