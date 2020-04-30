package day3_package;

public class Day3_demo6Arrayreturn {

    public static void main(String[] args) {
        int [] result=calculate(10,20,30);
        System.out.println("总和："+result[0]);

        System.out.println("平均数："+result[1]);

    }
public static int[] calculate(int a,int b,int c)
{
    int sum=a+b+c;
    int avg=sum/3;
    int [] array={sum,avg};
    return array;
}





}
