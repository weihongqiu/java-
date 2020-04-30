package day4_demo2;

import java.util.ArrayList;

/*
数组长度不可改变，但ArrayList可以改变
java.util
对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：也就是在一个集合当中的所有元素，全部统一类型，注意：泛型只是引用类型，不能是基本类型
常用的方法：
1创建、
2、添加add：public boolean add(E e);参数类型和泛型一致
3、获取get:public E get(int index);参数是索引编号，返回值就是对应位置的元素
4、删除remove：public E move(int index);
5、获取集合尺寸长度，返回值是集合元素个数
备注：add添加时一定会成功的，因此可以省略返回值，但其他的方法一定要去确定返回是否成功
注意事项：
1对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
* */
public class Demo4_arraylist {
    public static void main(String[] args) {
        //备注：从JDK1.7+开始，右侧尖括号内可以不写内容，但是<>本身是要写的
        ArrayList<String> list=new ArrayList<>();//创建ArrayList集合
        System.out.println(list);
//向集合中添加数据，需要用add方法
        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");
        boolean success=list.add("古力娜扎");
        System.out.println(list);
        System.out.println("添加的动作是否成功:"+success);
   //获取元素
        String name=list.get(2);
        System.out.println(name);
        //删除元素
        String who_remove=list.remove(1);
        System.out.println("被删除的人"+who_remove);
        int size=list.size();
        System.out.println(size);
        //遍历集合
        //list.fori快捷方式
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }

}
