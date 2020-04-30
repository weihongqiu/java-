package day5_package;

//字符串内容比较，两种方法：
//public boolean equals(Object obj)参数可以是任何对象，只有参数是一个字符串
//并且内容相同才会是true
//注意事项
// 1、任何对象都能进行Object接收
//2、equals方法具有对称性，也就是a.equals(b)和b.equals(a)一样
//3、如果比较双方一个常量一个变量，推荐把常量字符串写在前面
public class demo1_StringEqual {
    public static void main(String[] args) {
        String str4="hello";
        String str5="hello";
        char[] charArray={'h','e','l','l','o'};
        String str2=new String(charArray);
        System.out.println(str4.equals(str5));
        System.out.println(str5.equals(str2));
        System.out.println("hello".equals(str2));
        String str6=null;
        System.out.println("abc".equals(str6));//推荐
        //System.out.println(str6.equals("abc"));//不推荐，报错，空指针异常NullPointerException
        String str1="Hello";
        String str3="hello";
        System.out.println(str1.equalsIgnoreCase(str3));

    }
}
