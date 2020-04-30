package day4_demo2;

import java.util.Random;

//random 类的使用
/*
1、导包
import java.util.random
2、创建
Random r=new Random();
3、获得一个随机的int数字（int所有范围），int num=r.nextInt();
获取一个随机数字（参数代表了范围，左闭右开），int num=nexInt(3);//[0,3),也就是0~2
 */
public class demo_random1 {
    public static void main(String[] args) {
        Random r=new Random();
        int n=5;
        for(int i=0;i<100;i++) {
            int num = r.nextInt(n) + 1;
            System.out.println(num);
        }
        }
    }

