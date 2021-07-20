package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] RPS = {"rock","paper","scissor"};
        int pick = random.nextInt(RPS.length);
        System.out.println("Choose rock,paper or scissor");
        String playerPick = sc.nextLine().toLowerCase();
        System.out.println("Computer chose: "+RPS[pick]);

       if(RPS[pick].equals("rock") && playerPick.equals("scissor") ||
               RPS[pick].equals("paper") && playerPick.equals("rock") ||
               RPS[pick].equals("scissor") && playerPick.equals("paper"))
        {
            System.out.println("Computer Wins!");
        }
        else if(RPS[pick].equals("rock") && playerPick.equals("paper") ||
               RPS[pick].equals("paper") && playerPick.equals("scissor")||
               RPS[pick].equals("scissor") && playerPick.equals("rock"))
        {
            System.out.println("Player Wins!");
        }
        else {
           System.out.println("Draw!");
       }
    }
}
