package com.dyq.special.lambda;

/**
 * Runnable 的 lambda表达式,使用块格式,将五行代码转换成单行语句。
 * 直接将匿名的类名称用()替换，然后类体改为->，直接写返回值
 * // 1. 不需要参数,返回值为 5
 * () -> 5
 */
public class LambdaRunnable {
    public static void main(String[] args) {
        // 1.1使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();

        // 1.2使用 lambda expression
        new Thread(() -> System.out.println("Hello world !")).start();

        // 2.1使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

        // 2.2使用 lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");

        // 直接调用 run 方法(没开新线程哦!)
        race1.run();
        race2.run();
    }
}
