package day6_package;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class demo3_main {
    public static void main(String[] args) {
    demo3_Manager manager=new demo3_Manager("群主",100);
        demo3_Member one=new demo3_Member("成员A",0);
        demo3_Member two=new demo3_Member("成员B",0);
        demo3_Member three=new demo3_Member("成员C",0);
        manager.show();
        one.show();
        two.show();
        three.show();
        ArrayList<Integer>redList=manager.send(20,3);
        //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
    }

