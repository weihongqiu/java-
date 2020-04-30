package day4_demo;

//student类
public class Day4_demo8class_object {
//成员变量
    String name;
    int age;
// 成员方法
    public void sleep(String who)
    {
        System.out.println(who+"去睡觉");
    }
    public void eat()
    {
        System.out.println("吃饭");
    }

    public static class Day4_demo11class_return {

        public static void main(String[] args) {
            Day4_demo8class_object stu = new Day4_demo8class_object();
            Day4_demo8class_object stu1 = getStudent();

            System.out.println(stu1.name);
            System.out.println(stu1.age);
        }


        public static Day4_demo8class_object getStudent() {
            Day4_demo8class_object stu = new Day4_demo8class_object();
            stu.name = "易烊千玺";
            stu.age = 20;
        return stu;
        }
    }

    public static class Day4_demo_Person {

        public static void main(String[] args) {
          /*  Day4_Person person=new Day4_Person();
            person.show();
            person.name="赵丽颖";
            person.setAge(20);
            person.show();
            int a=person.getAge();
            System.out.println(a);

           */
            Day4_Person person=new Day4_Person();
            person.setAge(30);
            person.setMale(true);
            System.out.println("年龄："+person.getAge());
            System.out.println("是不是男生"+person.isMale());
        }
    }
}
