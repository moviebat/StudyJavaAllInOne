package com.dyq.object;

/**
 * 覆盖只针对非静态方法（终态方法不能被继承，所以就存在覆盖一说了），
 * 而隐藏是针对成员变量和静态方法的。这2者之间的区别是：
 * 覆盖受RTTI（Runtime type  identification）约束的，
 * 而隐藏却不受该约束。也就是说只有覆盖方法才会进行动态绑定，
 * 而隐藏是不会发生动态绑定的。在Java中，除了static方法和final方法，
 * 其他所有的方法都是动态绑定。因此，
 * 所以打印顺序为：
 * shape constructor
 * circle constructor
 * shape
 * this is circle
 * shape
 *
 */
public class InitOrder2 {
    public static void main(String[] args) {
        Shape3 shape3 = new Circle3();
        System.out.println(shape3.name);
        shape3.printType();
        shape3.printName();
    }
}
class Shape3 {
    public String name = "shape";

    public Shape3(){
        System.out.println("shape constructor");
    }

    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape");
    }
}

class Circle3 extends Shape3 {
    public String name = "circle";

    public Circle3() {
        System.out.println("circle constructor");
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }
}