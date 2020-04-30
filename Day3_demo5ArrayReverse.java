package day3_package;

public class Day3_demo5ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA={10,20,30,3,7,5,4,3,2,5,54};//动态初始化
        printArray(arrayA);
    }
public static void printArray(int[] arrayA)
        {
            for (int i = 0; i < arrayA.length; i++) {
                System.out.println(arrayA[i]);
            }
            System.out.println("============");
        }


/*
        for(int min=0,max=arrayA.length-1;min<max;min++,max--)
        {
            int temp=arrayA[min];
            arrayA[min]=arrayA[max];
            arrayA[max]=temp;
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
        */



}
