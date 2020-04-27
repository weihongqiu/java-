package hongqiu;

import java.util.Arrays;

public class Demo7For {
    public static void main(String[] args) {
       for(int i=1;i<=10;i++){
           //continue用法
           if(i==4)
           {
               continue;
           }
           System.out.println("你好 "+i);
       }
    }
}
