package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */
public class Test6 {

    public static void fun(Message2 message){

        System.out.println(message.getMessage());
    }
    public static void fun1(Message2<String> message){

        System.out.println(message.getMessage());
    }
    //通配符，泛型参数？ 解决参数统一的问题
    public static void fun2(Message2<?> message){
        //message.setMessage(111);//error此处不能修改内容
        System.out.println(message.getMessage());
    }

    //泛型的上限
    public static  void fun3(Message2<? extends Number> message){
        //message.setMessage(1111);//泛型的上限中不能修改内容
        System.out.println(message.getMessage());

    }
    //泛型的下限
    public static  void fun4(Message2<? super String> message){
        message.setMessage("hello");//泛型的下限中能修改内容
        System.out.println(message.getMessage());

    }
    public static void main(String[] args) {

        Message2<String> message1=new Message2<>();
        message1.setMessage("shhhss");
        fun1(message1);//fun1方法只能接受String类型的参数
        fun(message1);


        Message2<String> message2=new Message2<>();
        message2.setMessage("shhhss");
        fun2(message2);
        Message2<Integer> message3=new Message2<>();
        message3.setMessage(22);
        fun2(message3);



        Message2<Integer> message4=new Message2<>();
        message4.setMessage(12);
        fun3(message4);


        Message2<String> message5=new Message2<>();
        message5.setMessage("world");
        fun4(message5);

    }
}

class Message2<T>{


    private  T message;

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}


