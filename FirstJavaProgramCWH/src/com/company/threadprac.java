package com.company;

class MyThread1 extends Thread{
    public MyThread1(String name)
    {
        super(name);
    }

    @Override
    public void run(){
        int i =0;
        while(i<5000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

public class threadprac {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1("Dhruv");
        t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.getId());


    }
}
