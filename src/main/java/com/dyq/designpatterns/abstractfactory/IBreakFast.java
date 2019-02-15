package com.dyq.designpatterns.abstractfactory;

public interface IBreakFast {
    /**
     * 吃早餐
     */
    void eat();
}
/**
 * @author lilin
 *
 */
class Milk implements IBreakFast {

    @Override
    public void eat() {
        System.out.println("牛奶！");
    }

}
/**
 * @author lilin
 *
 */
class Orange implements IBreakFast {

    @Override
    public void eat() {
        System.out.println("橘子!");
    }

}