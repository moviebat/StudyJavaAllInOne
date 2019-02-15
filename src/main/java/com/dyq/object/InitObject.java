package com.dyq.object;

/**
 * 在生成对象的过程中，会先初始化对象的成员变量，然后再执行构造器。
 * 也就是说类中的变量会在任何方法（包括构造器）调用之前得到初始化，
 * 即使变量散步于方法定义之间。
 * 打印顺序为：
 * first build bread
 * Second build Meal
 */
public class InitObject {

    public static void main(String[] args) {
        new Meal();
    }
}
class Meal{

    public Meal(){
        System.out.println("Second build Meal");
    }
    Bread1 bread = new Bread1();
}

class Bread1{
    public Bread1(){
        System.out.println("first build bread");
    }
}