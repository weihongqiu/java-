package day5_package;

//@Override:写在方法前面，用来检测是不是有效的正确覆盖重写
public class demo5_Override {
    public static void main(String[] args) {

        demo5_Phone phone = new demo5_Phone();
        phone.call();
        phone.send();
        phone.show();

        demo5_newPhone newphone= new demo5_newPhone();
        newphone.call();
        newphone.send();
        newphone.show();

    }

}
