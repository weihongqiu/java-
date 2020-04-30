package day5_package;

/*
String当中与获取有关的常用方法有：
1、public int length()：获取字符串当中含有的字符个数
2、public String concat(String str)将当前字符串和参数字符串拼接成为返回值新的字符串
3、public char charAt(int index)获取指定索引位置的单个字符
4、public int indexOf(String str)查找参数字符串在本字符串中首次出现的索引位置，如果没有，返回-1
 */

public class demo1_StringGet {
    public static void main(String[] args) {
int length="afdsfkfrkfsfr".length();
        System.out.println("字符串长度是："+length);
        //拼接字符串
        String str1="hello";
        String str2="world";
        String str3=str1.concat(str2);
//获取指定索引位置的单个字符
        char ch="hello".charAt(1);
        System.out.println(ch);
//查找小字符串在大字符串中出现的第一次索引位置
        String original="helloworld";
        int index=original.indexOf("llo");
        System.out.println(index);



    }
}
