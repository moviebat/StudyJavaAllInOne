package com.dyq.object;

/**
 * 这里面主要考察队this和static的理解。this代表什么？
 * this代表当前对象，那么通过new Main()来调用printValue的话，
 * 当前对象就是通过new Main()生成的对象。而static变量是被对象所享有的，
 * 因此在printValue中的this.value的值毫无疑问是33。
 * 在printValue方法内部的value是局部变量，根本不可能与this关联，所以输出结果是33/3
 */
public class StaticKeyword1 {
    static int value = 33;

    public static void main(String[] args) throws Exception{
        new StaticKeyword1().printValue();
    }

    private void printValue(){
        int value = 3;
        System.out.println(this.value);
        System.out.println(value);
    }
}
