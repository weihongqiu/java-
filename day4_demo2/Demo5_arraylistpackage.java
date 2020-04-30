package day4_demo2;

import java.util.ArrayList;

/*
注意：泛型只是引用类型，不能是基本类型
如果希望向集合中存储基本数据类型，必须使用基本类型对应的包装类
基本类型 包装类（引用类型，包装类都位于java.lang包下）
byte Byte
short Short
int Integer[特殊]
long Long
float Float
double Double
char Character[特殊]
boolean Boolean
从JDK1.5开始，支持自动装箱，自动拆箱
自动装箱：基本类型-->包装类型
自动拆箱：包装类型-->基本类型
* */
public class Demo5_arraylistpackage {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();//创建ArrayList集合
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(200);
        lista.add(12);
        System.out.println(lista);
        int num=lista.get(1);
        System.out.println(num);
    }

}
