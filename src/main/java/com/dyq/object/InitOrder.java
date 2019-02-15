package com.dyq.object;

/**
 * 对象的初始化顺序为：
 * 1、父类的构造器调用以及初始化过程一定在子类的前面：
 * 2、类的初始化
 * 3、类的构造器
 * 故打印顺序为：
 * shape draw constructor
 * shape constructor
 * circle draw constructor
 * circle constructor
 */
public class InitOrder {
    public static void main(String[] args) {
        new Circle2();
    }
}
class Draw {

    public Draw(String type) {
        System.out.println(type+" draw constructor");
    }
}
class Shape2 {
    private Draw draw = new Draw("shape");

    public Shape2(){
        System.out.println("shape constructor");
    }
}
class Circle2 extends Shape2 {
    private Draw draw = new Draw("circle");
    public Circle2() {
        System.out.println("circle constructor");
    }
}