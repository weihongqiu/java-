package day5_package;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数
种类有大写字母、小写字母、数字、其他
思路：
1、键盘输入，利用scanner
2、键盘输入字符串，那么String str=sc.next;
3、定义四个变量，分别代表四种字符出现次数
4、需要对字符串内容遍历，String->char[],方法：toCharArray()
5、遍历char[]字符数组，对字符种类进行判断，并且用四个变量进行++动作
6、打印输出四个变量，分别代表四种字符次数
 */
public class demo1_Stringcout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input=sc.next();//获取键盘输入的一个字符串
        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;
        char[] charArray=input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
          if('A'<ch && ch<'Z')
          {
               countUpper++;
          }
          else if('a'<ch && ch<'z')
          {
              countLower++;
          }
          else if('0'<ch && ch<'9')
          {
              countNumber++;
          }
          else
          {
              countOther++;

          }
        }
        System.out.println(countUpper);
        System.out.println( countLower);
        System.out.println( countNumber);
        System.out.println( countOther);
    }
}
