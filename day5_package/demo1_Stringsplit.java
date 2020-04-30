package day5_package;
/*
字符串分割
public String[] split(String regex);按照参数的规则，将字符串切分成若干部分
注意事项：
split方法参数是正则表达式，如果按照英文.进行切分用“\\.”
 */
public class demo1_Stringsplit {
    public static void main(String[] args) {
String str1="aaa,bbb,ccc,d";
        String[] array1=str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}
