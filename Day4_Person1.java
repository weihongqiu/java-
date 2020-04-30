package day4_demo;


public class Day4_Person1{
    public static void main(String[] args)
    {
        Day4_Person person=new Day4_Person();

        //设置自己的名字
        //person.name="王健林";
        //person.sayHello("李嘉诚");

        person.setAge(30);
        System.out.println(person.getAge());
        person.setMale(true);

        System.out.println(person.isMale());

    }
}

