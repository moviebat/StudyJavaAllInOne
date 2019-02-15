package com.dyq.object;

/**
 * 如果把父类的无参构造器去掉，则子类必须通过super显示调用有参数构造器来构造该对象
 * 否则会报错：There is no default constructor available in '
 */
public class NoParameterConstructor {
    public static void main(String[] args) {
        Circle circle = new Circle();
    }
}
class Shape1 {
    protected String name;
//    public Shape(){
//        name = "shape";
//        System.out.println("shape constructor");
//    }
    public Shape1(String name) {
        this.name = name;
    }
}

class Circle1 extends Shape1 {
    private double radius;
    public Circle1() {
        super("Circle");
        radius = 0;
        System.out.println("Circle constructor");
    }
    public Circle1(double radius) {
        super("Circle");
        this.radius = radius;
    }
    public Circle1(double radius,String name) {
        super(name);
        this.radius = radius;
        this.name = name;
    }
}