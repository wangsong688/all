package com.wss.all.lock.synchronized01;

public class Test{
    public static void main(String[] args) {
        lockTest();

    }

    static L l = new L();

    public static void lockTest(){
        System.out.println("oo");
        synchronized (l){
            System.out.println("xxx");
        }
    }
}
