package com.company;
import java.util.*;
//Frequency of an element in an array
//class numbers{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Array Length: ");
//        int n= sc.nextInt();
//        int []arr = new int[n];
//        int []fr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int visited=-1;
//        for(int i=0;i<n;i++){
//            int count=1;
//            for(int j=i+1;j<n;j++){
//
//                if(arr[i]==arr[j]){
//                    count++;
//                    arr[j]=visited;
//                }
//            }
//            if(arr[i]!=visited)
//                fr[i]=count;
//
//        }
//        for(int i=0;i<fr.length;i++)
//        {
//            if(arr[i]!=visited){
//                System.out.println(arr[i]+" -> "+fr[i]);
//            }
//
//        }
//    }
//}

// Left Rotation Array

//class numbers{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Array Length: ");
//        int n= sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter left Rotaion Round: ");
//        int lrot = sc.nextInt();
//        System.out.println("Enter Array Element: ");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//       }
//        for(int i=0;i<lrot;i++){
//            int j,first=0;
//            first = arr[0];
//            for(j=0;j<n-1;j++){
//                arr[j]  = arr[j+1];
//            }
//            arr[j]=first;
//        }
//        System.out.println("Array After "+lrot+" Rotation ");
//
//        for(int i=0; i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//
//    }
//}
//Find Duplicates in an array
//public class numbers {
//    public static void main(String[] args) {
//        //Initialize array
//        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
//        System.out.println("Duplicate elements in given array: ");
//        //Searches for duplicate element
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j])
//                    System.out.println(arr[j]);
//            }
//        }
//    }
//}

//Largest and smallest Number in an array
//public class arraypractise {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Length of an array");
//        int n=sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter Array element");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        int max=arr[0];
//        for(int i=1;i<n;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        int min=arr[0];
//        for(int i=1;i<n;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("The greatest element in the array is: "+max);
//        System.out.println("The smallest element in the array is: "+min);
//    }
//}


//Right Rotate of an Array
//class arraypractise{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Length of an array");
//        int n=sc.nextInt();
//        System.out.println("Enter rotation: ");
//        int rot=sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter Array element");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//
//       int last;
//        for(int i=0;i<rot;i++){
//            int j;
//            last=arr[n-1];
//            for (j=n-1;j>0;j--){
//                arr[j] = arr[j-1];
//            }
//            arr[j] = last;
//        }
//
//        for(int i=0; i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//
//    }
//}

//class arraypractise{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Length of an array");
//        int n=sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter Array element");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        Arrays.sort(arr);
//        System.out.println("The third Largest element of an array is: "+arr[n-3]);
//
//
//    }
//}
// third largest using collection
//public class arraypractise{
//    public static int getThirdLargest(Integer[] a, int total){
//        List<Integer> list=Arrays.asList(a);
//        Collections.sort(list);
//        int element=list.get(total-3);
//        return element;
//    }
//    public static void main(String args[]){
//        Integer a[]={1,2,5,6,3,2};
//        Integer b[]={44,66,99,77,33,22,55};
//        System.out.println("Third Largest: "+getThirdLargest(a,6));
//        System.out.println("Third Largest: "+getThirdLargest(b,7));
//    }}


//Remove Duplicates
//class arraypractise{
//    public static void removeDuplicateElements(int arr[], int n){
//        int[] temp = new int[n];
//        int j = 0;
//        for (int i=0; i<n-1; i++){
//            for(int s=i+1;s<n;s++) {
//                if (arr[i] == arr[s]) {
//                        arr[s] = 0;
//                }
//            }
//        }
//
//        // Changing original array
//        for (int i=0; i<n; i++){
//            if(arr[i]!=0){
//                System.out.print(arr[i]+" ");
//            }
//        }
//
//    }
//
//    public static void main (String[] args) {
//        int arr[] = {10, 20, 30, 20, 30, 20, 10, 50};
//        int length = arr.length;
//        removeDuplicateElements(arr, length);
//        //printing array elements
//    }
//}
//
//


// Java Program to Remove Duplicate Elements
// From the Array using Set

import java.util.*;

//class arraypractise {
//
//    // Function to remove duplicate from array
//    public static void removeDuplicates(int[] a)
//    {
//        LinkedHashSet<Integer> set
//                = new LinkedHashSet<Integer>();
//
//        // adding elements to LinkedHashSet
//        for (int i = 0; i < a.length; i++)
//            set.add(a[i]);
//
//        // Print the elements of LinkedHashSet
//        System.out.print(set);
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
//        int a[] = {5,2,6,8,6,7,5,2,8};
//
//        // Function call
//        removeDuplicates(a);
//    }
//}

//Separate 0s,1s and 2s in an array
import java.io.*;

//class arraypractise {

//    // Sort the input array, the array is assumed to
//    // have values in {0, 1, 2}
//    static void sort012(int a[], int arr_size)
//    {
//        int lo = 0;
//        int hi = arr_size - 1;
//        int mid = 0, temp = 0;
//        while (mid <= hi) {
//            switch (a[mid]) {
//                case 0: {
//                    temp = a[lo];
//                    a[lo] = a[mid];
//                    a[mid] = temp;
//                    lo++;
//                    mid++;
//                    break;
//                }
//                case 1:
//                    mid++;
//                    break;
//                case 2: {
//                    temp = a[mid];
//                    a[mid] = a[hi];
//                    a[hi] = temp;
//                    hi--;
//                    break;
//                }
//            }
//        }
//    }

//    /* Utility function to print array arr[] */
//    static void printArray(int arr[], int arr_size)
//    {
//        int i;
//        for (i = 0; i < arr_size; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println("");
//    }

    /*Driver function to check for above functions*/
//    public static void main(String[] args)
//    {
//        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
//        int arr_size = arr.length;
//        //sort012(arr, arr_size);
//        System.out.println("Array after seggregation ");
//        //printArray(arr, arr_size);
//        Arrays.sort(arr);
//        for(int i=0;i<arr_size;i++)
//        System.out.print(arr[i]+" ");
//    }
//}

//class arraypractise{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Length of an array");
//        int n=sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter Array element");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        double range = arr[n-1]-arr[0];
//        double coef = range/(arr[0]+arr[n-1]);
//        System.out.print("Range of an array is: "+range);
//        System.out.format(" and the coefficient is: %.2f",coef);
//
//
//    }
//}


//union of two array
//public class arraypractise {
//
//    public static void main(String[] args) {
//        int firstArr[] = {1, 2, 3, 4, 5, 6};
//        int secondArr[] = {4, 5, 6, 9, 13, 15, 16, 17};
//
//        findUnion(firstArr, secondArr);
//    }
//
//    private static void findUnion(int[] firstArr, int[] secondArr) {
//        int i = 0;
//        int j = 0;
//
//        while (i < firstArr.length && j < secondArr.length) {
//            if (firstArr[i] < secondArr[j]) {
//                System.out.print(firstArr[i] + " ");
//                i++;
//            } else if (secondArr[j] < firstArr[i]) {
//                System.out.print(secondArr[j] + " ");
//                j++;
//            } else {
//                System.out.print(firstArr[i] + " ");
//                i++;
//                j++;
//            }
//        }
//
//        while (i < firstArr.length) {
//            System.out.print(firstArr[i] + " ");
//            i++;
//        }
//
//        while (j < secondArr.length) {
//            System.out.print(secondArr[j] + " ");
//            j++;
//        }
//    }
//
//}

//intersection of two arrays
//public class arraypractise {
//
//    public static void main(String[] args) {
//        int firstArr[] = {1, 2, 3, 4, 5, 6};
//        int secondArr[] = {4, 5, 6, 9, 13, 15, 16, 17};
//
//        findUnion(firstArr, secondArr);
//    }
//
//    private static void findUnion(int[] firstArr, int[] secondArr) {
//        int i = 0;
//        int j = 0;
//
//        while (i < firstArr.length && j < secondArr.length) {
//            if (firstArr[i] < secondArr[j]) {
//
//                i++;
//            } else if (secondArr[j] < firstArr[i]) {
//
//                j++;
//            } else {
//                System.out.print(firstArr[i] + " ");
//                i++;
//                j++;
//            }
//        }
//
//
//    }
//
//}

//class arraypractise{
//    static int getMissingNo(int a[], int n)
//    {
//        int n_elements_sum = n * (n + 1) / 2;
//        System.out.println(n_elements_sum);
//        int sum = 0;
//
//        for(int i = 0; i < n - 1; i++)
//            sum += a[i];
//        System.out.println(sum);
//
//        return n_elements_sum - sum;
//    }
//    public static void main(String[] args) {
//
//
//
//        int a[] = { 1, 3, 4, 5, 6 };
//        int n = a.length + 1;
//        int miss = getMissingNo(a, n);
//
//        System.out.print(miss);
// }
//    }

//class arraypractises {
//    public static void main(String args[])
//    {
//        int[] arr = { 1, 5, 7, -1, 5 };
//        int sum = 6;
//        getPairsCount(arr, sum);
//    }
//
//    // Prints number of pairs in arr[0..n-1] with sum equal
//    // to 'sum'
//    public static void getPairsCount(int[] arr, int sum)
//    {
//
//        int count = 0; // Initialize result
//
//        // Consider all possible pairs and check their sums
//        for (int i = 0; i < arr.length; i++)
//            for (int j = i + 1; j < arr.length; j++)
//                if ((arr[i] + arr[j]) == sum){
//                    count++;
//                    if(arr[i]!=0&&arr[j]!=0) {
//                        System.out.println(arr[i] + " " + arr[j]);
//                        arr[i] = 0;
//                        arr[j] = 0;
//                    }
//
//                }
//        System.out.printf("Count of pairs is %d", count);
//    }
//}

// print Duplicate Values
//class arraypractise{
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,5,2,3};
//        int l=arr.length;
//        for(int i=0;i<l;i++){
//            for(int j=i+1;j<l;j++){
//                if(arr[i]==arr[j]){
//                    System.out.print(arr[i]+" ");
//                }
//            }
//
//        }
//
//    }
//}
// Dupliacte Value
//class arraypractise {
    // Function to print duplicates
//    static void printRepeating(int arr[], int size)
//    {
//        int i;
//        System.out.println("The repeating elements are : ");
//
//        for (i = 0; i < size; i++) {
//            int j = Math.abs(arr[i]);
//            if (arr[j] >= 0)
//                arr[j] = -arr[j];
//            else
//                System.out.print(j + " ");
//        }
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
//        int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
//        int arr_size = arr.length;
//
//        printRepeating(arr, arr_size);
//    }
//}

//Common Element in three sorted array
// Java program to find common elements in three arrays

//import java.util.Scanner;
//class arraypractises
//{
//    public static void main(String[] args)
//    {
//        Scanner sr = new Scanner(System.in);
//        int n = sr.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++)
//        {
//            arr[i] = sr.nextInt();
//        }
//        int temp=0;
//        for(int i=0;i<n;i++) // select an element
//            for(int j=i+1;j<n;j++) //traverse ahead and check for duplicate
//                if(arr[i]==arr[j])
//                {
//                    System.out.println(arr[i]);
//                    temp=1;
//                    i=n;j=n;
//                }
//        if(temp==0)
//            System.out.println("No repeating integer found");
//    }
//}

//class arraypractises{
//    static void DistinctLarge3(int arr[],int n){
//        int i,first,second,third;
//        first=second=third=Integer.MIN_VALUE;
//        for(i=0;i<n;i++){
//            if(arr[i]>first){
//                third=second;
//                second=first;
//                first=arr[i];
//            }
//            else if(arr[i]>second){
//                third = second;
//                second = arr[i];
//            }
//            else if(arr[i]>third){
//                third=arr[i];
//            }
//        }
//        System.out.println("First: "+first+" Second: "+second+" Third: "+third);
//    }
//    public static void main(String[] args) {
//        int [] arr = {1,3,4,5,6,8,10,45,6,2,10};
//        DistinctLarge3(arr,arr.length);
//    }
//
//}

import java.io.*;
// Java program to print largest contiguous array sum
import java.util.*;
//// Greatest Contiguous Sum in an array
//class arraypractise
//{
//    public static void main (String[] args)
//    {
//        int [] a = {-2, -3, 4, 1, -2, -1, 5, -3};
//        System.out.println("Maximum contiguous sum is " +
//                maxSubArraySum(a));
//    }
//
//    static int maxSubArraySum(int a[])
//    {
//        int size = a.length;
//        int max_so_far = Integer.MIN_VALUE,sum = 0;
//
//        for (int i = 0; i < size; i++)
//        {
//            sum= sum + a[i];
//            if (max_so_far < sum)
//                max_so_far = sum;
//            if (sum < 0)
//                sum = 0;
//        }
//        return max_so_far;
//    }
//}

// Java program to find maximum product subarray
import java.io.*;
//class arraypractise {
//    /* Returns the product of max product subarray.*/
//    static int maxSubarrayProduct(int arr[])
//    {
//        // Initializing result
//        int result = arr[0];
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++)
//        {
//            int mul = arr[i];
//            // traversing in current subarray
//            for (int j = i + 1; j < n; j++)
//            {
//                // updating result every time
//                // to keep an eye over the
//                // maximum product
//                result = Math.max(result, mul);
//                mul *= arr[j];
//            }
//            // updating the result for (n-1)th index.
//            result = Math.max(result, mul);
//        }
//        return result;
//    }
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        int arr[] = { 10, -20, -3, 0, 7, -8, -2 };
//        System.out.println("Maximum Sub array product is "
//                + maxSubarrayProduct(arr));
//    }
//}

//Maximum Product of subarray
//class arrayparctise{
//    static int maxprod(int arr[]){
//        int n=arr.length;
//        int max = arr[0];
//        int min=arr[0];
//        int result = arr[0];
//        for(int i=1;i<n;i++){
//            int tempmax = Math.max(arr[i]*max,Math.max(arr[i]*min,arr[i]));
//            min = Math.min(arr[i]*max,Math.min(arr[i]*min,arr[i]));
//            max = tempmax;
//            result = Math.max(result,max);
//        }
//        return result;
//
//    }
//    public static void main(String[] args) {
//        int []arr= {1,5,-5,-8,0,265};
//        System.out.println(maxprod(arr));
//    }
//}





