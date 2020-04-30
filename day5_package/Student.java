package day5_package;
//如果一个成员变量使用了static关键字，那么变量不再属于自己，
//而是属于所在的类，多个对象共享同一份数据

public class Student {

    private int id;
    private String name;
    private int age;
    static String room;//教室
private static int idCounter=0;//学员计数器，每当new一个新对象时， 计数器+1

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
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
