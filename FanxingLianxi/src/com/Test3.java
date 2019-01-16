package com;

/**
 * Author:Fanleilei
 * Created:2019/1/15 0015
 */
public class Test3<T> {
    private T x;
    private T y;

    public Test3(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Test3<String> p1=new Test3<>("东经20度","北纬30度");
        System.out.println("X="+p1.getX()+" Y="+p1.getY());

        Test3<Integer> p2=new Test3<>(10,19);
        System.out.println("X="+p2.getX()+" Y="+p2.getY());

    }
}
