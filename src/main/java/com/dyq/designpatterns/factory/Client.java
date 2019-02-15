package com.dyq.designpatterns.factory;

public class Client {
    public static void main(String[] args){
       Factory factory;
       factory = new FactoryA();
       factory.createProduct();

       factory = new FactoryB();
       factory.createProduct();

       factory = new FactoryC();
       factory.createProduct();

    }
}
