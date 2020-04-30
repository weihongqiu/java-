package day6_package;

/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是抽象方法
接口格式：
public interface 接口名称
{接口内容}
备注：换成了关键字interface后，编译生成的字节码文件后缀仍然是.java-->.class
如果是java7，那么接口可以包含：
1、常量
2、抽象方法
如果是Java 8,还可以额外包含：
3、默认方法
4、静态方法
如果是Java 9 ，还可以额外
5、私有方法

接口的使用步骤：
1、接口不能直接使用，必须有一个实现类来实现该接口
格式：public class 实现类名称 implements接口名称{}
2、接口实现类必须覆盖重写（实现）接口中的所有的抽象方法
实现：去掉abstract关键字，加上大括号方法体
3、创建实现类的对象，进行使用


 */
public abstract class demo4_interface {

}