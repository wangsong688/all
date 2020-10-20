package com.wss.all.design.singleton01;

//使用类的内部类
public class Singleton04{

    private static class SingletonHolder{
        private static Singleton04 instance = new Singleton04();
    }

    private Singleton04(){}

    public static Singleton04 getInstance(){
        return SingletonHolder.instance;
    }




}
