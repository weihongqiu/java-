package day3_package;

import java.util.Arrays;

public class Day3_demo7Array_object {

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40};
        //面向过程思想
        System.out.print("[");
        for(int i=0;i<array.length;i++)
        {
            if(i==array.length-1)
            {
                System.out.print(array[i]+"]");
            }
            else{
                System.out.print(array[i]+",");
            }
        }
        //面向对象
        //找一个JDK给我们提供好的Arrays类
        //其中有一个tostring方法，直接就能把数组变成想要的格式字符串
        System.out.println(Arrays.toString(array));
    }
}