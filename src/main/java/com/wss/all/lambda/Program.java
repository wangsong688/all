package com.wss.all.lambda;


/**
 *   接口实现的3种方式
 *
 *   1。使用接口实现类（接口对象指向已经实现类接口的类对象）
 *   2。使用匿名内部类实现接口
 *   3。使用lambda表达式来实现接口
 */
public class Program {
    public static void main(String[] args) {

        /**
         * 接口实现类
         */
        Comparator comparator = new MyComparator();

        /**
         * 匿名内部类
         */
        Comparator comparator1 = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a -b;
            }
        };

        Comparator comparator2 = (a,b) -> a - b;

        System.out.println("comparator.compare(1,2) = " + comparator.compare(1, 2));
        System.out.println("comparator1.compare(1,2) = " + comparator1.compare(1, 2));
        System.out.println("comparator2.compare(1,2) = " + comparator2.compare(1, 2));

    }
}

class MyComparator implements Comparator{

    @Override
    public int compare(int a, int b) {
        return a -b;
    }
}

@FunctionalInterface
interface Comparator{
    int compare(int a,int b);
}