package day3_package;

public class Day3_demo3Arraycount {
   //如何获取数组长度
   //格式：数组名称.length
    public static void main(String[] args) {
        int[] arrayA={10,20,30,3,7,5,4,3,2,5,54};//动态初始化

        /*
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
*/
        int max=arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if(arrayA[i]>max)
            {
                max=arrayA[i];
            }

        }
        System.out.println(max);
    }

}
