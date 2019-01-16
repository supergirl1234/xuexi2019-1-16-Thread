package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */

// 实际上，synchronized(this)以及非static的synchronized方法，只能防止多个线程同时执行同一个对象的同步代码段。
public class ThreadSyn3 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            Thread t=new MyThread2();
            t.setName("Thread-"+i);
            t.start();
        }
    }
}
class Sync{
    public synchronized void test()  {
        System.out.println("Sync对象的的Test方法执行开始："+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sync对象的的Test方法执行结束："+Thread.currentThread().getName());
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
       // 实际上，synchronized(this)以及非static的synchronized方法，只能防止多个线程同时执行同一个对象的同步代码段。
        //在该段程序中，每创建一个线程，就创建一个对象，这几个对象不是同一个对象，所以synchronized没作用
        Sync sync=new Sync();//每一个线程各自的，相互不干扰
        sync.test();
    }
}
