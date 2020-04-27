package hongqiu;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.Arrays;

public class Demo1Method {
    public static void main(String[] args) {
        //厨师
        cook();//方法调用
        //农民
        farmer();
        //商贩
        seller();
    }
    //方法定义
        public static void cook(){
            System.out.println("洗菜");

        }
        public static void farmer(){
            System.out.println("播种");

        }
        public static void seller(){
        System.out.println("进货");

    }

    }


