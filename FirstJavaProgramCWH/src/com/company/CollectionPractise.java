package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionPractise {
    public static void main(String [] args){
        ArrayList<String> list1 = new ArrayList<>(10);
        list1.add("Red");
        list1.add("Blue");
        list1.add("Orange");
        list1.add("Green");
        list1.add("Yellow");
        list1.add("Black");
        list1.add("White");
        list1.add(1,"Sea Green");//Setting value to specific index
        list1.set(1,"Purple");//overwriting the index 1 value with purple
   //     System.out.println(li.get(2));\
        list1.remove(1);//Deleting an element from arraylist
//        for(String s:li){//iterating through ArrayList
//            System.out.println(s);
//        }
        ArrayList<String> list2 = new ArrayList<>(10);
       Collections.sort(list1);//Sorting alphabatically

        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.add("7");

        //Collections.copy(list2,list1);
//        System.out.println(list1);
//        System.out.println(list2);
//
//        Collections.copy(list2,list1);Copying one list to other list
 //       System.out.println(list1);
//        System.out.println(list2);
        //Collections.shuffle(list1); shuffle
        //Collections.reverse(list1); Reverse
//        System.out.println(list1);
       // System.out.println(list1.subList(0,4));//Used to print a portion of the arraylist
        //Storing the comparison output in ArrayList<String>
       //ArrayList<String> list3 = (ArrayList<String>)list1.clone();
//        for (String st : list1)
//            list3.add(list2.contains(st) ? "Yes" : "No");//Contains Fucntion
//        System.out.println(list3);
//        System.out.println(list1);
//        Collections.swap(list1,0,3);//Swapping two element
//        System.out.println(list1);

//        System.out.println(list1.addAll(list2));
//        System.out.println(list1);
//        ArrayList<String> list3 = new ArrayList();
//        list3 = (ArrayList)list1.clone();
//        System.out.println(list3);

//        System.out.println(list1.isEmpty());//for checking Emptiness
//        list1.clear();
//        System.out.println(list1.isEmpty());//for checking Emptiness
        list2.trimToSize();
        System.out.println(list2.size());
    }
}
