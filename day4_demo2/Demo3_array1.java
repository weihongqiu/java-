package day4_demo2;

/*构造方法
专门用来创建对象的方法，当用new创建对象时，就是调用构造方法
public 类名称 （参数类型 参数名称）
{方法体}
注意事项：
1、构造方法 的名称必须与所在类名称完全一样
2、不要写返回值类型，void也不要写
3、构造方法不能return
4、如果没有编写任何构造方法，编译器就会创造一个构造方法，没有参数、方法体，什么都不做
5、一旦写了一个构造方法，编译器就不再创造
* */
public class Demo3_array1 {

    public static void main(String[] args) {
       //首先创建一个长度为3的数组，里面存放person类型的对象
        Demo3_array[] array=new Demo3_array[3];
        Demo3_array one=new Demo3_array("迪丽热巴",18);//对象赋初值
        Demo3_array two=new Demo3_array("古力娜扎",17);
    //将one当中的地址值赋值到数组的0号元素位置
        array[0]=one;
        array[1]=two;
        System.out.println(array[0]);//地址值
        System.out.println(array[1]);
        System.out.println(array[1].getName());
    }
}
