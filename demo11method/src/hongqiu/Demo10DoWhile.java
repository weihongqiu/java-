package hongqiu;

import java.util.Arrays;

/*
初始表达式
do{
循环体；
步进表达式；
}
while（布尔表达式）;
*/
public class Demo10DoWhile {
    public static void main(String[] args) {
        int i=1;

        do{
            System.out.println("你好"+i);
            i++;

        }
        while(i<=10);
    }
}
