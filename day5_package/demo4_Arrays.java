package day5_package;
/*
java.util.Arrays是一个与数组相关的工具类，里面提供大量的静态方法，用来实现数组常用操作
public static String toString(数组)，将参数数组变成字符串（按照默认格式：[元素1，元素2.。]）
public static void sort(数组)，按照默认的升序对数组元素进行排序
 备注：如果是数值，sort默认从小到大
 如果是字符串，默认字母从小到大
 如果是自定义类型，那么自定义的类型需要有comparable或者comparator接口的支持（今后学习）
 */

import java.util.Arrays;

public class demo4_Arrays {
    public static void main(String[] args) {
        int []intArray={10,20,30};
        String intstr= Arrays.toString(intArray);
        System.out.println(intstr);//[10,20,30]
        int[] array1={4,2,3};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2={"bbb","ccc","aaa"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}
