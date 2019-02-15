package com.dyq.designpatterns.abstractfactory;

public interface Car {
    /**
     * 上班函数
     */
    void gotowork();
}

/**
 * 具体产品角色，自行车
 *
 * @author lilin
 *
 */
class Bike implements Car {
    @Override
    public void gotowork() {
        System.out.println("自行车！");
    }

}

/**
 * @author lilin
 *
 */
class Bus implements Car {

    @Override
    public void gotowork() {
        System.out.println("公交车！");
    }

}