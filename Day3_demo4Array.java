package day3_package;

import java.util.jar.JarOutputStream;

public class Day3_demo4Array {
    public static void main(String[] args) {
        int[] arrayA=new int[3];//动态初始化
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        //改变数组当中对策元素内容
        arrayA[1]=10;
        System.out.println(arrayA[1]);
    }

}
