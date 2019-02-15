package com.dyq.designpatterns.abstractfactory;

class Client{

    public static void main(String[] args){
        IAbstractFactory factory = new LowPersonFactory();
        Car car = factory.getCar();
        IBreakFast breakFast = factory.getBreakFast();
        System.out.println("吃的早饭是：");
        breakFast.eat();
        System.out.println("上班交通工具是：");
        car.gotowork();

        IAbstractFactory factory2 = new HighPersonFactory();
        car = factory2.getCar();
        breakFast = factory2.getBreakFast();
        System.out.println("吃的早饭是：");
        breakFast.eat();
        System.out.println("上班交通工具是：");
        car.gotowork();

    }
}


interface IAbstractFactory {
    /**
     *
     * @return
     */
    Car getCar();

    /**
     *
     */
    IBreakFast getBreakFast();
}
class HighPersonFactory implements IAbstractFactory {
    @Override
    public Car getCar() {
        return new Bus();
    }

    @Override
    public IBreakFast getBreakFast() {
        return new Orange();
    }
}
class LowPersonFactory implements IAbstractFactory {
    @Override
    public Car getCar() {
        return new Bike();
    }

    @Override
    public IBreakFast getBreakFast() {
        return new Milk();
    }
}
