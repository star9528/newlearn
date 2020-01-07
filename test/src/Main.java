import java.sql.SQLOutput;

class Person {//成员方法
    public int name;
    public String sex;
    public void eat(){
        System.out.println("吃饭！");
    }
    public void sleep(){
        System.out.println("睡觉！");
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person();//通过new实例化对象
        person.eat();//成员方法调用需要通过对象的引用调用
        person.sleep();
        Person person2 = new Person();
        Person person3 = new Person();
    }
}