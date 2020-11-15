package com.wss.all.thred01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 降低了创建线程和销毁线程时间开销和资源浪费
 */
public class Demo7{
	public static void main(String[] args) {
		//创建带有5个线程的线程池
		//返回的实际上是ExecutorService,而ExecutorService是Executor的子接口
		Executor threadPool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			threadPool.execute(new Runnable(){
				public void run() {
					System.out.println(Thread.currentThread().getName() + " is running");
				}
			});
		}

	}
}