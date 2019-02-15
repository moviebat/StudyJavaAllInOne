package com.dyq.object;

/**
 * 在类的加载过程中，类的static成员变量会被初始化，
 * 另外，如果类中有static语句块，则会执行static语句块。
 * static成员变量和static语句块的执行顺序同代码中的顺序一致。
 * 记住，在Java中，类是按需加载，只有当需要用到这个类的时候，
 * 才会加载这个类，并且只会加载一次。
 *
 */
public class LoadClass {
    public static void main(String[] args) {
        Bread bread1 = new Bread();
        Bread bread2 = new Bread();
        System.out.println();
    }

}

class Bread {
    private static Milk milk = new Milk();
    static{
        System.out.println("Bread is loaded");
    }
    public Bread() {
        System.out.println("construct bread");
    }
}

class Milk{
    public Milk(){
        System.out.println("静态成员变量最先初始化");
    }
}