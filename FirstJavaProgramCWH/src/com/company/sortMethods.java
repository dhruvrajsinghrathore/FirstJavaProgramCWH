package com.company;
import java.util.*;
import java.io.*;

//Selection Sort
//public class sortMethods {
//    static void SelectionSort(int arr[],int n){
//        for(int i=0;i<n;i++){
//            int index = i;
//            for(int j=i+1;j<n;j++){
//                if(arr[j]<arr[index]){
//                    index = j;
//                }
//            }
//            int smallest = arr[index];
//            arr[index] = arr[i];
//            arr[i] = smallest;
//        }
//
//        System.out.println("Sorted Array is: ");
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        SelectionSort(arr,n);
//    }
//}


//Insertion Sort
//class sortMethods{
//    static void InsertionSort(int arr[],int n){
//
//        for(int i=1;i<n;i++){
//            int key=arr[i];
//            int j=i-1;
//            while(j>=0 && key<arr[j])
//            {
//                    arr[j+1] = arr[j];
//                    j--;
//
//            }
//            arr[j+1] = key;
//        }
//        System.out.println("printing sorted elements ...");
//        for(int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        InsertionSort(arr,n);
//
//    }
//}


//QuickSort
class sortMethods{
    static void QuickSort(int arr[],int n){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        QuickSort(arr,n);

    }

}
