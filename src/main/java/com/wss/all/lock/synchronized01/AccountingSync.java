package com.wss.all.lock.synchronized01;

public class AccountingSync implements Runnable{

    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            increase();
        }
    }

    static int i = 0 ;

    public synchronized void increase(){
        i++;
    }

    public static void main(String[] args) {
        AccountingSync instanse = new AccountingSync();
        Thread t1 = new Thread(instanse);
        t1.start();
        System.out.println("i = " + i);
    }
}
