package ru.geekbrains.lessons;

import java.util.Scanner;

public class Lesson3Task2 {

    static Scanner scanner = new Scanner(System.in);
    static String randomComputerChoice;
    static String humanChoice;

    public static void main(String[] args) {
        playGuessWordGame();
    }

    public static void playGuessWordGame(){
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Try to guess and select word from list");
        printAllChoices(words);

        do {
            randomComputerChoice = words[(int) (Math.random() * words.length)];
            System.out.println("I give you hint: "+ "#############" + randomComputerChoice.charAt(randomComputerChoice.length()-2)
                    +randomComputerChoice.charAt(randomComputerChoice.length()-1));
            humanChoice = scanner.nextLine();
            if(randomComputerChoice.contains(humanChoice)){
                System.out.println("You win and guess word: " + randomComputerChoice);
                return;
            }else{
                System.out.println("Computer selected randomly: " + randomComputerChoice);
            }
        }while(!randomComputerChoice.contains(humanChoice));

    }

    public static void printAllChoices(String words[]){
        System.out.println("LIST OF WORDS:");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            System.out.print(" ");
        }
        System.out.println();
    }





}
