package hongqiu;

import java.util.Arrays;

/*while标准格式：
while（条件判断）{
循环体
}
扩展格式：
初始化表达式；
while（条件判断）
{
循环体；
步进语句；
}

*/

public class Demo8While {
    public static void main(String[] args) {
       int i=1;
       while(i<=10)
       {
           System.out.println("你好" +i);
           i++;
       }
    }
}
