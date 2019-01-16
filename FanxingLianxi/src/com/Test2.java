package com;

/**
 * Author:Fanleilei
 * Created:2019/1/15 0015
 */
public class Test2 {

    private Object x;
    private Object y;

    public Test2(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public void setY(Object y) {
        this.y = y;
    }

    public Object getX() {
        return x;
    }

    public Object getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {

        Test2 p=new Test2(10,20.4);
        System.out.println("X="+p.getX()+" Y="+p.getY());
        Test2 p1=new Test2(10,"北纬30度");
        System.out.println("X="+p1.getX()+" Y="+p1.getY());

    }


}
