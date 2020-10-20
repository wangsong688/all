package com.wss.all.design.singleton01;

/**
 * 此种方式虽然是安全的，但是由于将锁加到方法上后， 所有的方法有需要锁的占用，导致资源浪费。
 * 如果不是特殊情况， 不建议使用这种方式实现单例
 *
 * synchronized 的知识点：
 *
 Synchronized锁的3种使用形式（使用场景）：

 Synchronized修饰普通同步方法：锁对象当前实例对象；
 Synchronized修饰静态同步方法：锁对象是当前的类Class对象；
 Synchronized修饰同步代码块：锁对象是Synchronized后面括号里配置的对象，这个对象可以是某个对象（xlock），也可以是某个类（Xlock.class）；
 注意：

 使用synchronized修饰非静态方法或者使用synchronized修饰代码块时制定的为实例对象时，同一个类的不同对象拥有自己的锁，因此不会相互阻塞。
 使用synchronized修饰类和对象时，由于类对象和实例对象分别拥有自己的监视器锁，因此不会相互阻塞。
 使用使用synchronized修饰实例对象时，如果一个线程正在访问实例对象的一个synchronized方法时，其它线程不仅不能访问该synchronized方法，该对象的其它synchronized方法也不能访问，因为一个对象只有一个监视器锁对象，但是其它线程可以访问该对象的非synchronized方法。
 线程A访问实例对象的非static synchronized方法时，线程B也可以同时访问实例对象的static synchronized方法，因为前者获取的是实例对象的监视器锁，而后者获取的是类对象的监视器锁，两者不存在互斥关系。
 */
public class Singleton02{
    private static Singleton02 instance;
    private Singleton02(){

    }

    public static synchronized Singleton02 getInstance(){
        if (null != instance){
            return instance;
        }
        instance = new Singleton02();
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("Singleton01.getInstance() = " + Singleton02.getInstance());
        System.out.println("Singleton01.getInstance() = " + Singleton02.getInstance());
        System.out.println( Singleton01.getInstance() == Singleton01.getInstance());

    }
}
