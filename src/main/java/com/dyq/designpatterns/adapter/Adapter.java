package com.dyq.designpatterns.adapter;

interface Ps {
    void isPs();
}

interface Usb {
    void isUsb();
}

class Usber implements Usb {

    @Override
    public void isUsb() {
        System.out.println("USB接口");
    }
}

class Pser implements  Ps{

    @Override
    public void isPs() {
        System.out.println("Ps2接口");
    }
}

public class Adapter implements Ps {

    private Usb usb;

    public Adapter(Usb usb){
        this.usb = usb;
    }

    @Override
    public void isPs() {
        usb.isUsb();
    }

}

class Adapter1 implements Usb{

    private Ps ps;

    public Adapter1(Ps ps){
        this.ps = ps;
    }

    @Override
    public void isUsb() {
        ps.isPs();
    }
}

class Client {

    public static void main(String[] args) {
        Ps p = new Adapter(new Usber());
        p.isPs();

        Usb usb = new Adapter1(new Pser());
        usb.isUsb();

    }

}