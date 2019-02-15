package com.dyq.designpatterns.factory;

public interface Product {
}

class ProductA implements Product{

    public ProductA(){
        System.out.println("ProductA");
    }
}

class ProductB implements Product{
    public ProductB(){
        System.out.println("ProductB");
    }

}
class ProductC implements Product{
    public ProductC(){
        System.out.println("ProductC");
    }

}