package com.dyq.object;

/**
 * 1、在执行开始，先要寻找到main方法，因为main方法是程序的入口，
 * 2、但是在执行main方法之前，StaticKeyword2类，
 * 3、而在加载StaticKeyword2类的时候发现Test类继承自Base类，因此会转去先加载Base类，
 * 4、在加载Base类的时候，发现有static块，便执行了static块。
 * 5、在Base类加载完成之后，便继续加载Test类，然后发现Test类中也有static块，便执行static块。
 * 6、在加载完所需的类之后，便开始执行main方法。
 * 7、在main方法中执行new StaticKeyword2()的时候会先调用父类的构造器，
 * 8、然后再调用自身的构造器。因此，便出现了下面的输出结果：
 * base static
 * StaticKeyword2 static
 * base constructor
 * StaticKeyword2 constructor
 */

public class StaticKeyword2 extends  Base{
    static{
        System.out.println("StaticKeyword2 static");
    }
    public StaticKeyword2(){
        System.out.println("StaticKeyword2 constructor");
    }
    public static void main(String[] args) {
        new StaticKeyword2();
    }
}

class Base{
    static{
        System.out.println("base static");
    }
    public Base(){
        System.out.println("base constructor");
    }
}
