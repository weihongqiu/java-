package day6_package;

//发红包案例
//父类，用户
public abstract class demo3_User {
   private String name;
   private int money;

    public demo3_User() {
//无参构造方法
    }

    public demo3_User(String name, int money) {
        this.name = name;
        this.money = money;
    }
     public void show()
     {
         System.out.println("我叫："+name+"我有多少钱"+money);
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
