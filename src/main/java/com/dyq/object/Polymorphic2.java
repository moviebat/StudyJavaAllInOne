package com.dyq.object;

/**
 * 多态：父类类型的变量指向子类对象的引用
 * 多态的表现形式：相同类型的变量，调用相同的方法，产生不一样的结果
 * 虚拟方法调用：当父类的方法被子类重写时，会调用子类重写的方法，而不是父类的方法
 * 在多态的情况下，只能调用父类的方法和被子类重写的方法;如果想调用子类的方法，需要进行类型的前置转换
 */
class Person {
    public void walk(){
        System.out.println("走路");
    }
}
class Man extends Person{
    public void walk(){
        System.out.println("男人快步走");
    }
    public void work(){
        System.out.println("男人是个工作狂");
    }
}
class Woman extends Person{
    public void walk(){
        System.out.println("女人漫步走");
    }
    public void shopping(){
        System.out.println("女人是个购物狂");
    }
}
public class Polymorphic2 {
    public static void main(String args[]){
        Person p1=new Person();
        //多态：父类类型的变量指向子类对象的引用
        Person p2=new Man();
        Person p3=new Woman();
        //多态的表现形式：相同类型的变量，调用相同的方法，产生不一样的结果。
        p1.walk();   //走路
       // 虚拟方法调用：当父类的方法被子类重写时，会调用子类重写的方法，而不是父类的方法。
        p2.walk();   //男人快步走
        p3.walk();    //女人漫步走

        //在多态的情况下，只能调用父类的方法和被子类重写的方法;如果想调用子类的方法，需要进行类型的前置转换
//         p2.work();   // 错误

        Man m=(Man) p2;
        m.work();      //男人是个工作狂
        Woman w=(Woman) p3;
        w.shopping();   //女人是个购物狂

        //父类类型的变量可以转换成子类类型的变量，但是可能出现“类型转换异常”。
        /*Woman w=(Woman) p2;
        w.shopping();*/

        /*instanceof操作符
        x instance A,要求x所属的类B与类A为父子关系
        instanceof可以检测是否会抛出类型转换异常，返回true表示可以转换类型*/
        System.out.println(p2 instanceof Man); //true
    }
}