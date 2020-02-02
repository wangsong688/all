package com.wss.all.lambda;

import java.util.function.IntFunction;

/**
 * 构造函数
 */
public class LambdaTest4 {


    public static void main(String[] args) {

        PersonCreater personCreater = () -> new Person();

        /**
         * 构造方法的引用
         * 有参和无参构造器的调用区别在于所定义的接口中构造方法的参数区别
         */

        //无参
        PersonCreater creater1 = Person::new;
        Person person = creater1.getPerson();

        //有参
        PersonCreater2 creater2 = Person::new;
        Person xiaoming = creater2.getPerson("xiaoming", 8);


        IntFunction<int[]>  arrayMaker = int[]::new;
        int[] array = arrayMaker.apply(10);

    }

}


interface PersonCreater{
    Person getPerson();
}

interface PersonCreater2{
    Person getPerson(String name,int age);
}