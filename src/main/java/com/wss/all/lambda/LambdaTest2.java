package com.wss.all.lambda;

/**
 * 1,参数类型的精简：
 * 由于在接口中已经定义了参数，所以在Lambda表达式中参数的类型可以省略；
 * 备注：如果需要进行省略类型,那么所有参数的类型都必须都得省略，省略部分会报错；
 * 匿名内部类中省略参数类型是不可取的，这是Lambda表达式的优势；
 * 2,小括号的精简：
 * 如果参数列表中，参数的个数有且只有一个（多了少了都不行），那么小括号可以省略，且仍然可以省略参数的类型
 * 3,方法大括号的精简：
 * 类似于if,while语句，如果语句块只有一条语句，那么此时大括号可以省略
 * 4,return的省略：
 * 如果出现接口只有唯一方法且方法中只有唯一语句，且是返回语句，那么如果要省略，只能一起省略掉大括号以及return,不能省略其中之一，否则会报错。
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        /**
         * 参数精简
         * 1.参数的精简
         * 由于在接口中已经定义了参数，所以在Lambda表达式中参数的类型可以省略
         * 备注：如果需要进行省略类型,但是所有参数的类型必须都得省略，省略部分会报错
         * 匿名内部类中省略参数类型是不可取的
         */
        LambdaNoneReturnMultipleParameter lambda1 = (a, b) -> {
            System.out.println(a + b);

        };
        /**
         * 2.精简参数小括号
         * 如果参数列表中，参数的个数有且只有一个（多了少了都不行），那么小括号可以省略
         * 且仍然可以省略参数的类型
         */
        LambdaNoneReturnSingleParameter lambda2 = a -> {
            System.out.println(a);
        };

        /**
         * 3.方法大括号的省略
         * 类似于if,while语句，如果语句块只有一条语句，那么此时大括号可以省略、
         * 前面的省略方式仍然成立
         */
        LambdaNoneReturnSingleParameter lambda3 = a ->
                System.out.println(a);
        /**
         * 4.如果接口的唯一方法只有唯一返回语句，那么可以省略大括号，但是在省略大号的同时必须省略return
         */
        LambdaSingleReturnNoneParameter lambda4 = () -> 10;
    }
}
