package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */
public class ThreadSyn3Gaijin {
    public static void main(String[] args) {
        Sync2 sync2=new Sync2();
        for(int i=0;i<3;i++){
            Thread t=new MyThread3(sync2);//Thread访问的同一个对象sync2
            t.setName("Thread-"+i);
            t.start();
        }
    }
}
class Sync2{
   /* //synchronized 同步的是Sync2的对象的方法
    public synchronized void test()  {
        System.out.println("Sync对象的的Test方法执行开始："+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sync对象的的Test方法执行结束："+Thread.currentThread().getName());
    }*/

    //还可以这样写

    public void test()  {
        synchronized (this){//同步的对像
            System.out.println("Sync对象的的Test方法执行开始："+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sync对象的的Test方法执行结束："+Thread.currentThread().getName());
        }
    }
}
class MyThread3 extends Thread{
    private final Sync2 sync;
    public MyThread3(Sync2 sync){
        this.sync=sync;

    }
    @Override
    public void run() {

        sync.test();
    }
}
