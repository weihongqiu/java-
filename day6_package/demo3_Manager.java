package day6_package;

import java.util.ArrayList;
//子类：群主
public class demo3_Manager extends demo3_User {
    public demo3_Manager() {
//无参构造方法
    }

    public  demo3_Manager(String name, int money) {
        super(name, money);

    }
    public ArrayList<Integer> send(int totalMoney, int count) {
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();//集合对象
        //首先看一下群主自己有多少钱
        int leftMoney = super.getMoney();//群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;//返回空集合

        }
        //扣钱，重新设置余额
        super.setMoney(leftMoney - totalMoney);
        //发红包
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
            int last = avg + mod;
            redList.add(last);
            return redList;




    }
}