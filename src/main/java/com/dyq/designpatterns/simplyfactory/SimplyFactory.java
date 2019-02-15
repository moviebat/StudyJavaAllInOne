package com.dyq.designpatterns.simplyfactory;

public class SimplyFactory {

    public static Product getProduct(String productName){

        if(productName == null){
            return null;
        }else if(productName.equalsIgnoreCase("ProductA")){
            return new ProductA();

        }else if(productName.equalsIgnoreCase("ProductB")){
            return new ProductB();
        }
        return null;
    }

}

class client{
    public static void main(String[] args){
        SimplyFactory.getProduct("productA").operation();
        SimplyFactory.getProduct("productB").operation();
    }
}

interface  Product{
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