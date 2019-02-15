package com.dyq.exception;

/**
 * 如何自己定义一个异常类来管理相应的异常？
 *  1) 为这个找一个近似的类作为父类。
 *  2) 在该类中编写两个构造器:
 *  a) 默认构造器;
 *  b) 带String message参数的构造器且在该构造器中使用 super(message); 语句
 *      来调用父类的构造器完成异常原因的更改。
 */


public class MyException {
    public static void main(String[] args) {
        Cat cat1 = null;
        try{
            cat1 = new Cat("静静",2,true);
        }catch(Exception e ){
            System.out.println("有错误！");
        }
        System.out.println(cat1.toString());

        Cat cat2 = null;
        try{
            cat2 = new Cat("小谷",-4,true);
        }catch(Exception e){
            System.out.println("输入的年龄非法！异常的原因是："+e.getMessage());
        }
        System.out.println(cat2.toString());



    }
}

//定义一个异常类
class IllegalAgeException extends Exception{
    public IllegalAgeException(){

    }
    public IllegalAgeException(String message){
        super(message);
    }
}

//定义一个Cat类，当年龄为负数是抛出年龄非法的自定义异常
class Cat{
    private String name;
    private int age;
    private boolean gender;

    public Cat(){

    }

    public Cat(String name,int age, boolean gender) throws IllegalAgeException{
        this.name = name;

        if(age<0){
            throw new IllegalAgeException("给定的年龄"+ age +"是非法的");
        }
        this.age = age;
        this.gender = gender;
                
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + (gender?"公":"母") +
                '}';
    }
}