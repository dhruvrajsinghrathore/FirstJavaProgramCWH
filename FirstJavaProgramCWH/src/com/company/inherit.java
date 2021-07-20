package com.company;

class Animal{
    String language;
    String species;
        public Animal(int x){
            System.out.println("this is Animal:"+x);

    }
    public void speak(String an){
        if(an.equals("dog"))
        System.out.println("Bhau Bhauuu");
        if (an.equals("cat")){
            System.out.println("Meow Meow");
        }

    }
    public void met(){
        System.out.println("Animal");
    }
}

class Dog extends Animal{
    String s ="dog";

    public Dog(int x,int y) {
        super(x);
        super.speak("dog");
        System.out.println("this is Dog"+x+" "+y);
    }

    @Override
    public void met(){
        super.met();
        System.out.println("Dog");
    }


    public void sp(){
        System.out.println("Bhau bhau");
    }
}
class Cat extends Dog{
    public Cat(int x,int y){
        super(x,y);
        super.speak("cat");
        System.out.println("this is cat Contructor");
    }
    String s ="cat";
    @Override
    public void sp(){
        super.sp();
        System.out.println("Meow Meow");
    }
    @Override
    public void met(){
        super.met();
        System.out.println("Cat");
    }
}
public class inherit {
    public static void main(String[] args) {

        Cat ct = new Cat(4,5);
        ct.met();
        ct.sp();



    }
}
