package day5_package;
//如果一个成员变量使用了static关键字，那么变量不再属于自己，
//而是属于所在的类，多个对象共享同一份数据

public class demo1_StaticField {
    public static void main(String[] args) {
    Student one=new Student("郭靖",19);
    Student two=new Student("黄蓉",16);
    one.room="101教室";
        System.out.println("姓名："+one.getName()+
                "年龄:"+one.getAge()+"教室"+one.room+"编号"+one.getId());
        System.out.println("姓名："+two.getName()+"年龄:"
                +two.getAge()+"教室"+two.room+"编号"+two.getId());



    }
}
