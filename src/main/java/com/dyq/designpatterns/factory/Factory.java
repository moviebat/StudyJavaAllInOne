package com.dyq.designpatterns.factory;


public interface  Factory{
    public  Product createProduct();
}

class FactoryA implements Factory{

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}

class FactoryC implements Factory {
    @Override
    public Product createProduct() {
        return new ProductC();
    }
}