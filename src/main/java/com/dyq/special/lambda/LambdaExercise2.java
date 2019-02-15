package com.dyq.special.lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 用lambda表达式实现map
 * map函数可以说是函数式编程里最重要的一个方法了。
 * map的作用是将一个对象变换为另外一个。在我们的例子中，就是通过map方法将cost增加了0,05倍的大小然后输出。
 *
 */
public class LambdaExercise2 {
    @Test
    public void mapTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        cost.stream().map(x -> x + x*0.05).forEach(x -> System.out.println(x));
    }


}
