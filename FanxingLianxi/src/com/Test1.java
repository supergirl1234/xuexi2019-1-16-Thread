package com;

/**
 * Author:Fanleilei
 * Created:2019/1/15 0015
 */
public class Test1 {


    /*//以前的方法，用数组
    public static int add(int[] data){
        if(data==null){

            return 0;
        }
        int sum=0;
        for(int i=0;i<data.length;i++){
            sum+=data[i];

        }
        return sum;

    }
    public static void main(String[] args) {

        System.out.println(add(new int[]{}));
        System.out.println(add(new int[]{1}));
        System.out.println(add(new int[]{1,2,3,4}));

    }*/


    /*//可变参数
    public static int add1(int... data){

        if(data==null){
            return 0;

        }
        int sum=0;
        for(int i=0;i<data.length;i++){
            sum+=data[i];

        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(add1());
        System.out.println(add1(null));
        System.out.println(add1(1));
        System.out.println(add1(1,2,3,4,5));

    }*/



    /*//如果要传递多类参数，可变参数一定放在最后，并且只能设置一个可变参数
    public static void print(String message,String... args){

        StringBuilder  stringBuilder=new StringBuilder();
        stringBuilder.append(message);
        for(int i=0;i<args.length;i++){
            stringBuilder.append(args[i]);

        }
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {

        print("hello");
        print("hello","world");
        print("hello","world","ni");


    }*/


    public static void main(String[] args) {

        int[] Array=new int[]{1,2,3,4,5};
        for(int i=0;i<Array.length;i++){

            System.out.print(Array[i]+" ");

        }
        System.out.println();

        //Foreach循环
        for(int p:Array){
            System.out.print(p+" ");

        }
    }

}
