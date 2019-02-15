package com.dyq.special.lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * reduce与map一样，也是函数式编程里最重要的几个方法之一。。。
 * map的作用是将一个对象变为另外一个，而reduce实现的则是将所有值合并为一个
 */
public class LambdaExercise3 {

    //用Lambda来做mapreduce
    @Test
    public void mapReduceTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        double allCost = cost.stream().map(x -> x+x*0.05).reduce((sum,x) -> sum + x).get();
        System.out.println(allCost);
    }

    //用for循环来做
    @Test
    public void sumTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        double sum = 0;
        for(double each:cost) {
            each += each * 0.05;
            sum += each;
        }
        System.out.println(sum);
    }

}

