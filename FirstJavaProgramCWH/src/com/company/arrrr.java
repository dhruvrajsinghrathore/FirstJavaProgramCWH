package com.company;
import java.math.*;


public class arrrr {
    public static void main(String args[]) {
            //Sum of 2d Array
        int[][] first = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] second = {{4, 5, 6},
                          {1, 2, 3}};
        int [][] sum = new int[3][3];
        for (int i = 0; i <2; i++) {
            for (int j=0;j<3;j++)
             {
                System.out.println("this is "+i+" "+j);
                sum[i][j]  = first[i][j]+second[i][j];
                System.out.println(sum[i][j]+" ");
            }
        }


        //Reverse an Array
        int[] arr = {1,2,3,4,5};
        int n = Math.floorDiv(arr.length,2);
        int temp,l= arr.length;
        for(int i=0;i<n;i++)
        {
            temp=arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int i :arr){
            System.out.print(i+" ");
        }

       // Max element
        int []arrr = {1,25,-58,44,5,-10,90};
        int min=arrr[0];
        for(int i : arrr)
        {
            if(i<min)
            {
                min=i;
            }
        }
        System.out.println("The max number in the given array is: "+min);

    }


}
