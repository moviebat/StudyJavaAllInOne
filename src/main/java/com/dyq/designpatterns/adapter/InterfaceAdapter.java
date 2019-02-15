package com.dyq.designpatterns.adapter;

public class InterfaceAdapter {
    public static void main(String[] args){
        Plugger ps2er = new Ps2er();
        ps2er.isPs2();

        Plugger usber = new Usber2();
        usber.isUsb();
    }
}

interface Plugger{
    void isPs2();
    void isUsb();
}

abstract class Adapter2 implements Plugger{
    public void isPs2(){};
    public void isUsb(){};
}

class Ps2er extends Adapter2{

    @Override
    public void isPs2() {
        System.out.println("Plugger is ps2");
    }
}

class Usber2 extends Adapter2{
    @Override
    public void isUsb(){
        System.out.println("Plugger is usb");
    }

}