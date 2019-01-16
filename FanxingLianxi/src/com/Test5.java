package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */
//泛型类
public class Test5<T> {

    private  T message;

    public Test5(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }

    //泛型类中的普通方法
    public void testMethod1(T t) {
        System.out.println(t);
    }


    //泛型方法 和泛型类 相互独立的
    //泛型方法

    public static <T> void print(T data){

        System.out.println(data);
    }
    public static <T,S> void print(T data,S value){

        System.out.println(data);
        System.out.println(value);
    }
    public static <T> T convert(T data){

        return data;
    }

    public <E> void messagePrint(E value){

        System.out.println(value);
    }


    public static void main(String[] args) {

        Test5<String> p1=new Test5<>("今天好伤心");
        p1.print("我");
        p1.print(20);

        p1.testMethod1("我");
        //p1.testMethod1(20);//这个是错误的，
        //泛型类中的普通方法中的参数类型必须与泛型类的参数类型相同
        //泛型方法中的参数类型与泛型类的参数类型无关
    }
}
