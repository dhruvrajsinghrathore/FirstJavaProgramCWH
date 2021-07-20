package com.company;
import javax.print.attribute.standard.PagesPerMinute;
import java.io.FileNotFoundException;
import java.util.*;
//Java Program to find all subsets of a string
//public class Stringpractise {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String: ");
//        String str = sc.nextLine();
//        String []arr = new String[str.length()*(str.length()+1)/2];
//        int temp=0;
//        for(int i=0;i<str.length();i++){
//            for(int j=i;j<str.length();j++){
//                arr[temp] = str.substring(i,j+1);
//                temp++;
//            }
//        }
//        for(String st:arr){
//            System.out.println(st);
//        }
//    }
//}
//palindrome Check
//class Stringpractise{
//    public static void main(String[] args) {
//                String string = "Dhruvraj";
//                char palin ;
//
//                //Converts the given string into lowercase
//                string = string.toLowerCase();
//                int l  = string.length();
//
//                //Iterate the string forward and backward, compare one character at a time
//                //till middle of the string is reached
//                for(int i = 0; i < Math.floor(l/2); i++){
//                            palin = string.charAt(i);
//                            string.replace(string.charAt(i),string.charAt(l-i-1));
//                            string.replace(string.charAt(l-i-1),palin);
//                        }
//
//                     System.out.println("Reversed String: "+string);
//
//    }
//
//
//}


// Checking if given string is a rotation or not
//class Stringpractise{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String: ");
//        String str = sc.nextLine();
//        System.out.println("Enter Rotation String: ");
//        String strRot = sc.nextLine();
//
//        if(str.length()==strRot.length() && str.concat(str).indexOf(strRot)!=-1){
//            System.out.println(strRot+" is the rotation string of "+str);
//        }
//        else{
//            System.out.println("Sorry but "+strRot+" is not a rotation String of "+str);
//        }
//
//
//    }
//}
////Longest subsequence
//public class Stringpractise {
//    //Checks for the largest common prefix
//    public static String lcp(String s, String t){
//        int n = Math.min(s.length(),t.length());
//        for(int i = 0; i < n; i++){
//            if(s.charAt(i) != t.charAt(i)){
//                return s.substring(0,i);
//            }
//        }
//        return s.substring(0,n);
//    }
//
//    public static void main(String[] args) {
//        String str = "";
//        String lrs="";
//        int n = str.length();
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                //Checks for the largest common factors in every substring
//                String x = lcp(str.substring(i,n),str.substring(j,n));
//                //If the current prefix is greater than previous one
//                //then it takes the current one as longest repeating sequence
//                if(x.length() > lrs.length()) lrs=x;
//            }
//        }
//        System.out.println("Longest repeating sequence: "+lrs);
//    }
//}


//Permutation String
// Java program to print all the permutations
// of the given string
//class Strignpractise {
//            // Function to print all the permutations of str
//             static public void printPermutn(String str, String ans) {
//
//                // If string is empty
//                if (str.length() == 0) {
//                    System.out.print(ans + " ");
//                    return;
//                }
//
//                for (int i = 0; i < str.length(); i++) {
//
//                    // ith character of str
//                    char ch = str.charAt(i);
//
//                    // Rest of the string after excluding
//                    // the ith character
//                    String ros = str.substring(0, i) +
//                            str.substring(i + 1);
//
//                    // Recurvise call
//                    printPermutn(ros, ans + ch);
//                }
//            }
//
//            // Driver code
//            public static void main(String[] args) {
//                String s = "abcd";
//                printPermutn(s, "");
//            }
//        }


//class StringPractises{
//    public static void main(String[] args) {
//            String string = "Sunshine is sun shine without space between sun Shine Sunshine";
//            int count;
//
//            //Converts the string into lowercase
//            string = string.toLowerCase();
//
//            //Split the string into words using built-in function
//            String words[] = string.split(" ");
//
//            System.out.println("Duplicate words in a given string : ");
//            for (int i = 0; i < words.length; i++) {
//                count = 1;
//                for (int j = i + 1; j < words.length; j++) {
//                    if (words[i].equals(words[j])) {
//                        count++;
//                        //Set words[j] to 0 to avoid printing visited word
//                        words[j] = "0";
//                    }
//                }
//
//                //Displays the duplicate word if count is greater than 1
//                if (count > 1 && words[i] != "0")
//                    System.out.println(words[i]);
//            }
//        }
//
//    }
//

//Shortest ANd the longest String in a String
//class Stringppractises{
//    public static void main(String[] args) {
//
//        String str="This is the Practise Session of Strings";
//        String []st = str.split(" ");
//        String Short = st[0];
//        String longest = "";
//        for(String s:st){
//            if(s.length()<Short.length()){
//                Short = s;
//            }
//            else if(s.length()>longest.length()){
//                longest=s;
//            }
//
//        }
//
//        System.out.println("Longest String is: "+longest+" and the shortest String is: "+Short);
//    }
//}

//// TO Find the Highest Number of occuring string in a text file
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
//
//        public class Stringpractise{
//
//            public static void main(String[] args) throws Exception {
//                String line, word = "";
//                int count = 0, maxCount = 0;
//                ArrayList<String> words = new ArrayList<String>();
//
//                //Opens file in read mode
//                FileReader file = new FileReader("C:\\Users\\dhruv\\Desktop\\Data.txt ");
//                BufferedReader br = new BufferedReader(file);
//
//                //Reads each line
//                while((line = br.readLine()) != null) {
//                    String string[] = line.toLowerCase().split(" ");
//                    //Adding all words generated in previous step into words
//                    for(String s : string){
//                        words.add(s);
//                    }
//                }
//
//                //Determine the most repeated word in a file
//                for(int i = 0; i < words.size(); i++){
//                    count = 1;
//                    //Count each word in the file and store it in variable count
//                    for(int j = i+1; j < words.size(); j++){
//                        if(words.get(i).equals(words.get(j))){
//                            count++;
//                        }
//                    }
//                    //If maxCount is less than count then store value of count in maxCount
//                    //and corresponding word to variable word
//                    if(count > maxCount){
//                        maxCount = count;
//                        word = words.get(i);
//                    }
//                }
//
//                System.out.println("Most repeated word: " + word);
//                br.close();
//
//
//    }
//}

//Java Program to find the number of the words in the given text file
//import java.io.BufferedReader;
//import java.io.FileReader;
//
//class Stringpractises{
//    public static void main(String[] args) throws Exception {
//
//        FileReader file = new FileReader("C:\\Users\\dhruv\\Desktop\\Data.txt");
//        BufferedReader bf = new BufferedReader(file);
//        String line;
//        int count=0;
//        while((line=bf.readLine())!=null){
//            String []words = line.split("");
//            count = count+ words.length;
//        }
//        System.out.println(count);
//        bf.close();;
//    }
//}

//Reverse a string word by word
//class Stringpractises{
//    static String reverseString(String s){
//        String reverStr="";
//        for(int i=s.length()-1;i>=0;i--){
//            reverStr = reverStr + s.charAt(i);
//        }
//        return reverStr;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println("Reverse String is: "+reverseString(str));
//    }
//}

//Alternate way
//class Stringpractises
//{
//    public static void main(String[] args)
//    {
//        String str;
//        System.out.println("Enter a string: ");
//        Scanner scanner = new Scanner(System.in);
//        str = scanner.nextLine();
//        scanner.close();                                //closes the input stream
//        String reversed = reverseString(str);
//        System.out.println("The reversed string is: " + reversed);
//    }
//    public static String reverseString(String s)
//    {
//        if (s.isEmpty())                            //checks the string if empty
//            return s;
//        return reverseString(s.substring(1)) + s.charAt(0);                     //recursively called function
//    }
//}

//
//import java.util.Arrays;
//class Stringpractises{
//    public static void main(String[] args) {
//        int arr[] = {1,5,7,8,4,2,6,9,5,8,1,2,45,78,98,2,45,36};
//        Arrays.sort(arr);
//        for (int i=0;i<arr.length;i++)
//        System.out.print(arr[i]+" ");
//    }
//}

