package day3_package;

public class Day3_demo2ArrayLength {
   //如何获取数组长度
   //格式：数组名称.length
    public static void main(String[] args) {
        int[] arrayA=new int[3];//动态初始化
        int[] arrayB={10,20,30,3,7,5,4,3,2,5,54};
        int len=arrayB.length;
        System.out.println("数组长度是"+len);
    }

}
