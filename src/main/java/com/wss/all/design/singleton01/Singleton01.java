package com.wss.all.design.singleton01;

public class Singleton01{
    private static Singleton01 instance;
    private Singleton01(){

    }

    public static Singleton01 getInstance(){
        if (null != instance){
            return instance;
        }
        instance = new Singleton01();
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("Singleton01.getInstance() = " + Singleton01.getInstance());
        System.out.println("Singleton01.getInstance() = " + Singleton01.getInstance());
        System.out.println( Singleton01.getInstance() == Singleton01.getInstance());

    }
}
