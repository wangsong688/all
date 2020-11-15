package com.wss.all.lock.volatile01;

public class VolatileDemo01{
    public static void main(String[] args) {
        System.out.println('0');
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Runnable(){
                @Override
                public void run() {
                    inset();
                }
            });
        }
        while (Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println(race);
    }
    public static volatile int race =  0;
    public static void inset(){
        race++;
    }
}
