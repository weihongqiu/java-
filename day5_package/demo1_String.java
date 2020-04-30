package day5_package;

public class demo1_String {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();
        System.out.println("第一个字符串"+str1);
        //根据字符数组创建字符串
        char[] charArray={'h','e','l','l','0'};
        String str2=new String(charArray);
        System.out.println("第2个字符串："+str2);
        byte[] byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println("第三个字符串："+str3);
        //直接创建，没有new，直接创建也是字符串对象
        String str4="hello";
        System.out.println("第四个字符串："+str4);
        String str5="hello";
    }
}
