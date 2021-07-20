package com.company;
import java.util.Scanner;
import java.util.Random;

class Game{
    int number;
    int noOfGuesses=0;
    int userInput;

    public Game(){

                Random rd = new Random();
                this.number = rd.nextInt(100);

    }
    public void takeUserInput()
    {
      Scanner ui = new Scanner(System.in);
        System.out.println("Guess the number:");
      this.userInput = ui.nextInt();


    }
    public void isCorrectNumber(){
        if(userInput==number){
            System.out.println("Correct!");
            noOfGuesses++;
        }
        else if(userInput<number){
            System.out.println("Try Higher Number");
            noOfGuesses++;
        }
        else{
            System.out.println("Try Smaller Number");
            noOfGuesses++;
        }
    }
    public void guesses(){
        System.out.println("You got this Number in "+noOfGuesses+" Guesses");
    }
}

public class guessNumber {
    public static void main(String[] args) {

        Game obj = new Game();
        while(obj.number!=obj.userInput) {
            obj.takeUserInput();
            obj.isCorrectNumber();
            obj.guesses();
        }
    }

}
