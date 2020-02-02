package com.wss.all.lambda;

/**
 * 普通方法在lambda表达式种的调用
 */
public class LambdaTest3 {
    public static void main(String[] args) {

        /**
         * 方法引用：可以快速将一个lambda表达式的实现指向一个已经写好的方法
         * 语法：方法的隶属者，静态方法的隶属者为类，非静态方法的隶属者是对象
         * 即：方法的隶属者：方法名
         * 注意事项：
         * 1。被引用的方法的参数数量已经类型一定要和接口中的方法参数数目一致。
         * 2。被引用的方法的返回值一定要和接口中的方法的返回值一致。
         */


        /**
         * 假如我们在程序中对于某个接口方法需要调用许多次，那么用以下的方法创建对象，来调用方法就是不太好的
         * 缺点：如果将来要对方法进行改变，那么所有用Lambda表达式定义的对象都要更改，这在设计模式上就是有问题的；
         */
        LambdaSingleReturnSingleParameter lambda1 = a -> a * 2;
        LambdaSingleReturnSingleParameter lambda2 = a -> a * 2;

        LambdaSingleReturnSingleParameter lambda3 = a -> chenge(a); //在Lambda表达式中使用一般方法的调用方式

        LambdaSingleReturnSingleParameter lambda4 = LambdaTest3::chenge;//在lambda表达式中，使用方法的引用（方法隶属类）
        System.out.println("lambda4.test(2) = " + lambda4.test(2));

        LambdaTest3 lambdaTest3 = new LambdaTest3();//非静态方法徐亚对象才能被调用
        LambdaSingleReturnSingleParameter lambda5 = lambdaTest3::chenge2;//在lambda表达式中使用方法引用（方法隶属于对象）
        LambdaSingleReturnMultipleParameter lambda6 = lambdaTest3::chenge3;//多参数的引用方法使用

    }

    private static int chenge(int a){
        return a * 2;
    }

    private int chenge2(int a){
        return a * 2;
    }

    private int chenge3(int a,int b){
        return a * 2 + b * 3;
    }
}
