package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */
public class ThreadSync33 {

    public static void main(String[] args) {

        for(int i=0;i<3;i++){
            Thread t=new MyThread4();//Thread访问的同一个对象sync2
            t.setName("Thread-"+i);
            t.start();
        }
    }
}
class Sync3{
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
        //全局锁  synchronized (class)
        //对象锁  synchronizedthis|obj）优先使用对象锁，只是控制一个对象的访问
        synchronized (Sync3.class){//同步class， 只有当这个类的对象执行完毕了，才能执行下一个
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
class MyThread4 extends Thread{

    @Override
    public void run() {
     Sync3 sync=new Sync3();
        sync.test();
    }
}
