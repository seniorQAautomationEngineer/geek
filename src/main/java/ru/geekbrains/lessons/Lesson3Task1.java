package ru.geekbrains.lessons;

import java.util.Random;
import java.util.Scanner;

public class Lesson3Task1 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int randomNumber, answer, restart;
    static int tries = 0;
    static  int maximumAttempt =3;
    static boolean completeGame = false;


    public static void main(String[] args) {
       fullGame();
    }

     public static void fullGame(){
        randomNumber = generateNewNumber();
         //System.out.println("Random number: " + randomNumber);
         do {
             System.out.println("Enter and guess your number from 0 to 9");
             printMaximumAttempts(maximumAttempt);
             answer = scanner.nextInt();
             if(answer < 0 || answer > 9){
                 System.out.println("Your number is out of range: " + answer);
             }
             tries++;
             maximumAttempt--;
             verifyMaximumTries(tries);
             verifyIfLuckyIsCorrect(randomNumber, answer);
             if(completeGame){
                 return;
             }
             printHowCloseYourGuess(randomNumber, answer);

         }while (answer > 0 || answer < 9);

     }

     public static  int generateNewNumber(){
        return random.nextInt(10);
     }


     public static void printMaximumAttempts(int maximumAttempt){
        System.out.println("You have only " + maximumAttempt +" attempts");
    }


     public static void printHowCloseYourGuess(int randomNumber, int answer){
         if(answer < randomNumber){
             System.out.println("Number should be greater");
         }else{
             System.out.println("Number should be smaller");
         }
     }

     public static  void verifyMaximumTries(int tries){
         if(tries >= 3){
             System.out.println("Game over!");
             gameIsCompletedAndRequestRestart();
         }
    }

     public  static void verifyIfLuckyIsCorrect(int randomNumber, int answer){
        if(answer == randomNumber){
             System.out.println("You are winner! Your number is " + randomNumber);
             gameIsCompletedAndRequestRestart();
         }
     }

     public static void gameIsCompletedAndRequestRestart(){
          System.out.println("Do want to try again?");
         System.out.println("Type 1, if you select Yes, and type 0 , if you select No");
         restart = scanner.nextInt();
         if(restart==1){
             maximumAttempt =3;
             tries =0;
             fullGame();
         }else {
            completeGame = true;
         }
     }

}


