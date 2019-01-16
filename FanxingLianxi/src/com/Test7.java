package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */

interface IMessage<T>{

    void print(T t);


}
public class Test7 {

    public static void main(String[] args) {
        //匿名内部类
        IMessage<Integer> message=new IMessage<Integer>() {
            @Override
            public void print(Integer integer) {
                System.out.println(integer);
            }
        };


        IMessage<Integer> message1=new IMessgae1();//前面必须是向上转型，若写成 IMessage1<Integer> message1=new IMessgae1();就会出错
        message1.print(11);

        IMessage<String> message2=new IMessage2();
        message2.print("明天会更好");
    }


}
//保留泛型参数
class IMessgae1<T> implements IMessage<T>{


    @Override
    public void print(T t) {
        System.out.println(t);
    }
}


//指定泛型参数的类型
class IMessage2 implements IMessage<String>{


    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
