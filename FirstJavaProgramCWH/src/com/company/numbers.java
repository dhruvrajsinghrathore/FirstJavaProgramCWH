package com.company;
import java.util.Scanner;

//    //peterson Number
////    static int fact(int fc){
////        int s=1;
////        for(int i=1;i<=fc;i++){
////            s=s*i;
////        }
////        return s;
////    }
////
////    static void peterson(int num){
////       int cnum=num,sum=0,r;
////       while(cnum>0){
////           r=cnum%10;
////           sum=sum+fact(r);
////           cnum=cnum/10;
////       }
////       if(sum==num){
////           System.out.println("Peterson number!");
////       }
////       else
////           System.out.println("Not a peterson Number!");
////
////
////    }
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n=sc.nextInt();
////        peterson(n);
////    }
////}
//
////public class numbers {
//
//// Sunny Number
//
////    static void sunny(int num){
////        double sq= Math.sqrt(num);
////        if(sq-Math.floor(sq)==0){
////            System.out.println("Sunny Number!");
////            System.out.println(sq);
////            System.out.println(Math.floor(sq));
////        }
////        else{
////            System.out.println("Not a Sunny Number");
////            System.out.println(sq);
////            System.out.println(Math.floor(sq));
////        }
////    }
////    public static void main(String[] args) {
////
////        Scanner sc = new Scanner(System.in);
////        int n=sc.nextInt();
////          sunny(n+1);
////
////    }
// Alternate Prime Number:
//class numbers{
//    static int checkPrime(int chprime){
//        int flag=0;
//        for(int i=2;i<=chprime/2;i++)
//        {
//            if(chprime%i==0)
//            {
//                flag=1;
//                break;
//            }
//        }
//
//        if(flag==0){
//            return 1;
//        }
//        else
//            return 0;
//    }
//    static void AlternatePrime(int num){
//
//        int temp=2;
//        for(int n=2;n<=num-1;n++)
//        {
//            if(checkPrime(n)==1)
//            {
//                if(temp%2==0){
//                    System.out.print(n+" ");
//                }
//                temp++;
//            }
//        }
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number: ");
//        int num = sc.nextInt();
//        AlternatePrime(num);
//    }
//
// Finding sqrt without math function
//class numbers
//        {
//            public static void main(String[] args)
//            {
//                System.out.print("Enter a number: ");
//                //creating object of the Scanner class
//                Scanner sc = new Scanner(System.in);
//                //reading a number form the user
//                int n = sc.nextInt();
//                    //calling the method and prints the result
//                System.out.println("The square root of "+ n+ " is: "+squareRoot(n));
//            }
//            //user-defined method that contains the logic to find the square root
//            public static double squareRoot(int num)
//            {
//                //temporary variable
//                double t;
//                double sqrtroot=num/2.0;
//                do
//                {
//                    t=sqrtroot;
//                    sqrtroot=(t+(num/t))/2;
//                    System.out.println(t+"   "+sqrtroot);
//                }
//                while((t-sqrtroot)!= 0);
//                return sqrtroot;
//            }
//        }

// Swapping numbers using Bitwise Operator
//class numbers{
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter First Number: ");
//        int n1=sc.nextInt();
//        System.out.println("Enter Second Number: ");
//        int n2=sc.nextInt();
//        System.out.println("Before Swapping: "+n1+" "+n2);
////        n1=n1^n2;
////        n2=n1^n2;
////        n1=n1^n2;
//        n1=n1*n2;
//        n2=n1/n2;
//        n1=n1/n2;
//        System.out.println("After Swapping: "+n1+" "+n2);
//
//    }
//}

//class numbers{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        int first = sc.nextInt();
//        System.out.println("Enter second Number");
//        int second = sc.nextInt();
//        int gcd=1;
//        int min = Math.min(first,second);
//        for(int i=1;i<=min;i++)
//        {
//            if(first%i==0 && second%i==0)
//            {
//             gcd=i;
//            }
//        }
//
//        System.out.println("GCD of "+first+" and "+second+" is: "+gcd);
//
//    }
//}
//Perfect Square
//class numbers{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number");
//        double num = sc.nextDouble();
//         int flag=0;
//        for(int i=1;i<num/2;i++){
//
//            if(i*i==num) {
//                System.out.println("Perfect Square of: " + i);
//                flag=1;
//                break;
//            }
//        }
//        if(flag==0){
//            System.out.println("Not a Perfect square!");
//        }
//        double sqrt = Math.sqrt(num);
//        if(sqrt-Math.floor(sqrt)==0){
//            System.out.println("Perfect Square of: "+sqrt);
//        }
//        else
//            System.out.println("Not a Perfect Square!");
//
//    }
//}