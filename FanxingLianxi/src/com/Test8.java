package com;

/**
 * Author:Fanleilei
 * Created:2019/1/16 0016
 */

//泛型擦除
    //泛型信息存在于编译阶段，运行时会类型擦除
public class Test8 {

    public static void main(String[] args) {
        Message2<String> message1=new Message2<>();
        message1.setMessage("今天很好");

        Message2<Integer> message2=new Message2<>();
        message2.setMessage(200);
        try {
            System.out.println(message1.getClass().getDeclaredField("message").getType().getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        //instanceof
        System.out.println(message1 instanceof Message2);
        System.out.println(message2 instanceof Message2);

         //getclass
        System.out.println(message1.getClass().getName());
        System.out.println(message2.getClass().getName());
    }
}
