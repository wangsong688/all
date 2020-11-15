package com.wss.all.thred01;

/**
 * 第二种创建启动线程的方式
 * 实现Runnale接口
 * @author fatah
 */
public class Demo2 implements Runnable{

	//重写的是Runnable接口的run()
	public void run() {
		System.out.println("implements Runnable is running");
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Demo2());
		Thread thread2 = new Thread(new Demo2());
		thread1.start();
		thread2.start();
	}
}
