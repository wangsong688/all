package com.wss.all.lock.volatile01;


/**
 * 继承Thread类，重写run()方法
 */
public class VolatileDemo02 extends Thread{

	public static int race = 0 ;
	//重写的是父类Thread的run()
	public void run() {
		synchronized (this){
			for (int i = 0; i < 100; i++) {
				race++;
			}
		}

	}


	public static void main(String[] args) {
		Thread[] threadList = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadList[i] = new VolatileDemo02();
			/* 这里将分别传入每组的初始数据。
			 * */
			threadList[i].start();
		}
		for (int i = 0; i < 10; i++) {
			try {
				threadList[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(race);
	}

}