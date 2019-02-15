package com.dyq.object;

/**
 * 1.先看引用变量a1的类型，为A，b是B的一个实例；
 * 2.在类A中查看是否有方法show(B obj),发现不存在；
 * 3.查看A是否有超类（父类），发现不存在；
 * 4.查看A中是否有方法show(A obj）,存在；
 * 注：参数b是B的实例，B为A的子类，将参数b转换为a再找方法，在A中查找是否有B可以继承的方法show(A obj)
 * 5.a1是对本身对象的引用，所以不考虑方法的重写，答案为 A and A.
 */
class A {
    public String show(A obj) {
        return ("A and A");
    }
    public String show(D obj) {      //方法的重载
        return ("A and D");
    }
}
class B extends A {
    public String show(B obj) {       //方法的重载
        return ("B and B");
    }
    public String show(A obj) {       //方法的重写
        return ("B and A");
    }
}
class C extends B {
}
class D extends B {
}
public class Polymorphic {
    public static void main(String args[]) {
        A a1 = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        //多态：父类类型的变量指向子类对象的引用
        A a2 = new B();
        //多态的表现形式：相同类型的变量，调用相同的方法，产生不一样的结果。
        System.out.println(a1.show(b));   //A and A
        System.out.println(a1.show(c));   //A and A
        System.out.println(a1.show(d));   //A and D
        System.out.println(a2.show(b));   //B and A
        System.out.println(a2.show(c));   //B and A
        System.out.println(a2.show(d));   //B and A => A and D
        System.out.println(b.show(b));    //B and B
        System.out.println(b.show(c));    //B and B
        System.out.println(b.show(d));    //B and B => A and D
    }
}
