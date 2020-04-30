package day5_package;
/*
字符串截取的方法：
1、public String substring(int  index)截取从参数位置一直到末尾，返回新字符串
2、public String Substring(int begin int end)截取从begin开始，一直到end结束，左闭右开
 */


public class demo1_StringSub {
    public static void main(String[] args) {
    String str1="helloworld";
    String str2=str1.substring(5);
        System.out.println(str2);
        String str3=str1.substring(4,7);


        //strA中保存的是地址值，字符串内容是不变的，变得是地址值
        String strA="hello";
        strA="java";
        System.out.println(strA);

    }
}
