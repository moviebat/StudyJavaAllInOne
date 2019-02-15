package com.dyq.designpatterns.nofactory;

class Client{
    public static void main(String[] args){

        ProductA productA = new ProductA();
        productA.operation();

        ProductB productB = new ProductB();
        productB.operation();

    }
}

interface Product {
    abstract void operation();
}
class ProductA implements Product {


    @Override
    public void operation() {
        System.out.println("ProductA operation.");
    }

}

class ProductB implements Product {

    @Override
    public void operation() {
        System.out.println("ProductB operation.");
    }

}