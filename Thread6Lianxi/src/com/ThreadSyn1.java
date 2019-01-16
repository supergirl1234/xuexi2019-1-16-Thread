package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */
public class ThreadSyn1 {

    public static void main(String[] args) {
        MyThread mt = new MyThread() ;
        new Thread(mt,"黄牛A").start();
        new Thread(mt,"黄牛B").start();
        new Thread(mt,"黄牛C").start();
    }
}
class MyThread implements Runnable {
    private int ticket = 10 ; // 一共十张票



   //第一种方法
/*
    @Override
    public void run() {
    //大的同步块
        synchronized (this) {//Runnable对象
            while (this.ticket > 0) { // 还有票
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // 模拟网络延迟
                System.out.println(Thread.currentThread().getName() + ",还有" + this.ticket--
                        + " 张票");
            }
            System.out.println(Thread.currentThread().getName() + "票卖光了");
        }
    }*/

   //第二种方法
   /* @Override
    public void run() {
        //局部同步块
        for(int i=0;i<10;i++){
            synchronized (this) {
                if (this.ticket > 0) { // 还有票
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // 模拟网络延迟
                    System.out.println(Thread.currentThread().getName() + ",还有" + this.ticket--
                            + " 张票");
                }

            }
        }
        System.out.println(Thread.currentThread().getName() + "票卖光了");

    }*/
/*
    //第三种方法，与第一种相同
   //同步方法，同一时间只能有一个线程进入这个方法
    @Override
    public synchronized void run() {
        for(int i=0;i<10;i++){
                if (this.ticket > 0) { // 还有票
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // 模拟网络延迟
                    System.out.println(Thread.currentThread().getName() + ",还有" + this.ticket--
                            + " 张票");
                }

        }
        System.out.println(Thread.currentThread().getName() + "票卖光了");

    }*/

    //第四种方法，与第二种方法相同
    @Override
    public void run() {
        for(int i=0;i<10;i++){

            sale();
        }
        System.out.println(Thread.currentThread().getName() + "票卖光了");
    }

    public synchronized void sale(){
        if (this.ticket > 0) { // 还有票
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // 模拟网络延迟
            System.out.println(Thread.currentThread().getName() + ",还有" + this.ticket--
                    + " 张票");
        }


    }




}