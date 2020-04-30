package day5_package;
/*
字符串转换方法：
1、将当前字符串拆分为字符数组作为返回值
public char[] tocharArray()
2、获得当前字符串底层的字节数组
public byte[]getBytes()
3、将所有出现的老字符串替换成新的字符串，返回替换的结果新字符串
public String replace(CharSequence oldString,CharSequence newString)
备注：CharSequence可以接受字符串类型
 */
public class demo1_Stringconvert {
    public static void main(String[] args) {
char[] chars="hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        //转换成为字节数组
       byte[] bytes= "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);

            //内容替换，replace使用
            String str1="how do you do?";
           String str2= str1.replace("o","*");
            System.out.println(str2);


        }
    }
}
