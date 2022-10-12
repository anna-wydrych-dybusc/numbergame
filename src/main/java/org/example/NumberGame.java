package org.example;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        // randomly choose the number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("I have randomly chosen number between 1 and 100");
        System.out.println("Try to guess it.");
        //initialize Scanner
        Scanner scanner = new Scanner(System.in);
        //counting number of try
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose again:");
            //read users guess and stirred it into the variable
            int guess = scanner.nextInt();
            //compare random number with guess variable
            if (randomNumber < guess){
                System.out.println("It's smaller then " + guess + " guess.");

            } else if (randomNumber > guess) {
                System.out.println("It's greater then " + guess + " guess.");
            }
            else {
                hasWon = true;
                break;
            }
        }
        if (hasWon){
            System.out.println("You win!");
        }else {
            System.out.println("You loose!");
            System.out.println("Correct answer was: " + randomNumber);
        }


    }
}