package com.company;
import org.w3c.dom.Node;
import java.util.*;

/**
 * This is all possible methods of linkedlist
 * @author Dhruv
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/LinkedList.html"><h3>Original Java Doc 14 Oracle</h3></a>
 * @version 2.0
 * @since 2020
 */

public class LinkedListPractise {
    Node head;
    public class Node {
        int data;
        Node next;
    }

    public void insert(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void insertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=head;
        head=node;
    }
    public void insertAtIndex(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        Node n=head;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        node.next=n.next;
        n.next=node;
    }


    public void show(){
        Node node=head;
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }

    public void deleteFromIndex(int index){
        Node node=new Node();
        Node currentNode=head;
        int counter=0;
        while(counter<index-1){
            currentNode = currentNode.next;
            counter++;
        }
        currentNode.next = currentNode.next.next;

    }
    public void deleteAtFirst(){
        Node node=new Node();
        node=head;
        Node start = node.next;
        head=start;
    }
    public void deleteAtLast(){
        Node node=head;
        Node prev=null;
        while(node.next!=null){
            prev=node;
            node=node.next;
        }
        prev.next=null;


    }
    public void isPalindrome(){

        Stack <Integer> st = new Stack<>();

        Node node=head;
        Boolean isPalin=true;
        while(node!=null){
            st.push(node.data);
            node=node.next;
            }

        node=head;
        while(node!=null){
            int top=st.pop();
            if(top!= node.data){
                isPalin=false;
            }
            node=node.next;
        }
        if(isPalin==true){
            System.out.println("It is Palindrome Linked List");
        }
        else{
            System.out.println("It is not a Palindrome Linked List");
        }
    }

    public void MinMax(){
        int min=head.data;
        int max=head.data;
        Node current =head;
        while(current!=null){
            if(max<current.data){
                max= current.data;
            }
            if(min> current.data){
                min= current.data;
            }
            current=current.next;
        }

        System.out.println("Max element is: "+max);
        System.out.println("Min element is: "+min);

    }

    public void findDuplicates(){//Duplicates
        Node current=head;
        //int count=0;
        //Node temp = current.next;
        while(current!=null) {
           Node temp = current.next;
            while(temp!=null){
                if(temp.data == current.data)
                {
                    System.out.println(temp.data);
//                    System.out.println(current.data);
                    temp=temp.next;
                    //count=count+1;
                }
            }
            current=current.next;
        }
//        if(count!=0){
//            System.out.println("Duplicates in this LinkedList");
//        }
    }

    public void search(int dt)//This is Search
    {
        Node current=head;
        int count=0;
        while(current!=null){
            if(current.data==dt){
                System.out.println("Present in LinkedList");
                count++;
            }
            current=current.next;
    }
        if(count==0){
            System.out.println("Not Found!");
        }
    }


 public static void main(String [] args){
//Suprise
LinkedListPractise list=new LinkedListPractise();
        list.insert(100);
        list.insert(200);
        list.insert(300);
        list.insert(400);
        list.insert(500);
        list.insert(200);
        list.insertAtStart(99);
        list.insertAtIndex(2,150);
        list.deleteFromIndex(1);
        list.deleteFromIndex(2);
        list.deleteFromIndex(3);
        list.deleteAtFirst();
        list.deleteAtLast();
        list.isPalindrome();
     list.MinMax();
     list.findDuplicates();
     list.search(100);
     list.search(900);


        list.show();


//     LinkedList<String> list = new LinkedList<>();
//     list.add("A");
//     list.add("B");
//     list.add("C");
//     list.add("D");
//     list.add("E");
//     list.add("F");
//     System.out.println(list);
//     list.add(3,"Z");
//     System.out.println(list.pop());
//         Iterator it=list.iterator();
//     while(it.hasNext()){
//         System.out.print(it.next()+" ");
//     }





    }
}
