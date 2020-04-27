package hongqiu;

import java.util.Arrays;

public class Demo5scoreRank {
    public static void main(String[] args) {
       int score=50;
       if(score<0||score>100) {
           System.out.println("你的成绩错误");
       }
       else if(score>=90&&score<=100)
       {
           System.out.println("你的成绩为优秀");

       }
       else if(score>=80&&score<90)
       {
           System.out.println("你的成绩为好");
       }
       else if(score>=70&&score<79)
       {
           System.out.println("你的成绩为良");
       }
       else if(score>=60&&score<69)
       {
           System.out.println("你的成绩为及格");
       }
       else
       {
           System.out.println("你的成绩为不及格");
       }
    }

}
