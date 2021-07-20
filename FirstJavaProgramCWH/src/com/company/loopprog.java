package com.company;
import java.util.Scanner;

public class loopprog {
    public static void main (String arg[]){

        Scanner sc = new Scanner(System.in);
//        int fact=1;
        System.out.println("Enter Number:");
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//
//            fact = fact*i;
//        }
//        System.out.println("The Factorial of "+n+" is " +fact);

        int sum=0;
        for (int i=1;i<=4;i++)
        {

            sum = sum+(n*i);

        }
        System.out.println("The Sum of the table is: "+sum);



    }
}
