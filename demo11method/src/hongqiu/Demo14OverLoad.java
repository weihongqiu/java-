package hongqiu;

public class Demo14OverLoad {
    public static void main(String[] args) {
        System.out.println(sum( 10,20));
    }
    public static int sum(int a,int b)
    {
        System.out.println("两个参数方法执行");
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        System.out.println("三个参数方法执行");
        return a+b+c;
    }
}
