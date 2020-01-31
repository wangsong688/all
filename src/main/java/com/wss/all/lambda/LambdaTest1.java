package com.wss.all.lambda;

/**
 * 接口实现的不同方式
 */
public class LambdaTest1 {
    public static void main(String[] args) {

        /**
         * 1.无参无返回的Lambda表达式使用样例
         */
        LambdaNoneReturnNoneParameter lambda1 = () -> {
            System.out.println("lambda1:" + "Hello World!");
        };
        lambda1.test();

        /**
         * 2.无返回值的单参数的Lambda表达式使用样例
         */

        LambdaNoneReturnSingleParameter lambda2 = (int i) -> {
            System.out.println("lambda2:" + i);
        };
        lambda2.test(1024);


        /**
         * 3.无返回值的多参数的Lambda表达式使用样例
         */
        LambdaNoneReturnMultipleParameter lambda3 = (int a, int b) ->
        {
            System.out.println("lambda3:" + (a + b));
        };
        lambda3.test(1000, 24);

        /**
         * 4.有返回值的无参数的Lambda表达式使用样例
         */

        LambdaSingleReturnNoneParameter lambda4 = () -> {
            return 1024;
        };
        int res = lambda4.test();
        System.out.println("lambda4:" + res);

        /**
         * 5.有返回值，单个参数的Lambdad的表达式使用
         */
        LambdaSingleReturnSingleParameter lambda5 = (int a) -> {
            return a;
        };
        int res2 = lambda5.test(1024);
        System.out.println("lambda5:" + res2);

        /**
         * 6.有返回值，多个参数的Lambdad的表达式使用
         */
        LambdaSingleReturnMultipleParameter lambda6 = (int a, int b) -> {
            int sum = a + b;
            return sum;
        };
        int res3 = lambda6.test(1000, 24);
        System.out.println("lambda6:" + res3);

    }
}
