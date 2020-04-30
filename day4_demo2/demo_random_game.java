package day4_demo2;

import java.util.Random;
import java.util.Scanner;

//random 类的使用
/*
猜字游戏
1、导包
import java.util.random
2、创建
Random r=new Random();
3、获得一个随机的int数字（int所有范围），int num=r.nextInt();
获取一个随机数字（参数代表了范围，左闭右开），int num=nexInt(3);//[0,3),也就是0~2
 */
public class demo_random_game {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;//产生1-100之间的一个数
        Scanner sc = new Scanner(System.in);
       for(int i=0;i<5;i++){
            System.out.println("请输入你猜测的数字");
            int guessNum = sc.nextInt();
            if (guessNum > randomNum) {
                System.out.println("太大了，请重试");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试");
            } else  {

                System.out.println("恭喜你猜中了");
                break;
            }

        }

    }
}


