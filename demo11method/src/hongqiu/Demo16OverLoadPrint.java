package hongqiu;

public class Demo16OverLoadPrint {
    public static void main(String[] args) {

        myPrint((byte) 110);
    }


    public static void myPrint(byte num){
        System.out.println(num);
        System.out.println("byte参数");
    }
    public static void myPrint(int num){
        System.out.println(num);
        System.out.println("int参数");
    }

}
