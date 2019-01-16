package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */
public class Test4<T,S> {

    private T x;
    private S y;

    public Test4(T x, S y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public S getY() {
        return y;
    }

    public static void main(String[] args) {
        Test4<String,Integer> p1=new Test4<>("北纬20度",20);
        System.out.println("X="+p1.getX()+" Y="+p1.getY());
        Test4<Integer,Integer> p2=new Test4<>(10,20);
        System.out.println("X="+p2.getX()+" Y="+p2.getY());

    }
}
