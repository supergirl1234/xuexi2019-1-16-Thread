package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */
public class ThreadSyn2 {

    public static void main(String[] args) {
        Runnable runnable=new Print();
        for(int i=0;i<10;i++){
            Thread thread=new Thread(runnable,"Thread"+i );
            thread.start();//启动顺序控制不了
        }
    }
}

class Print implements Runnable{

    private int i=0;
    @Override
    public void run() {
        System.out.println("@#"+Thread.currentThread().getName()+"-"+i++);
    }
}

