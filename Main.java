package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner( System.in);
        Random randCard = new Random();
        boolean startGame = true;
        int numberOfGames = 0;


    while (startGame)
    {
        int playerChoice = 0;
        int currentCard = randCard.nextInt(13);

        numberOfGames += 1;
        System.out.println("Start Game #" + numberOfGames);

        if (currentCard == 1 ) {
            System.out.println("Your card is an Ace!");
            currentCard = 1;
        }
        else if (currentCard == 11) {
            System.out.println("Your card is a Jack!");
            currentCard = 10;
        }
        else if (currentCard == 12) {
            System.out.println("Your card is a Queen!");
            currentCard = 10;
        }
        else if (currentCard == 13) {
            System.out.println("Your card is a King");
            currentCard = 10;
        }
        else {
            System.out.println("Your card is a " + currentCard);
        }
        System.out.println("Your hand is a: " + currentCard );

        String gameMenu = "1. Get another card \n2. Hold hand \n3. Show game statistics \n4. Exit game";
        System.out.println(gameMenu);

        System.out.println("Choose option: ");
        playerChoice = scnr.nextInt();

        int newCard = randCard.nextInt(13);

        switch (playerChoice) {
            case 1:
                System.out.println("Your card is a: " + newCard);
                System.out.println("Your hand is: " + (currentCard + newCard));
                break;

            case 2:
                System.out.println("Your hand is: " + currentCard);
                System.out.println("Dealer's hand is: " + randCard.nextInt(24));
                break;

            case 3:
                System.out.println("I have no idea how to do this yet");
                break;

            case 4:
                return;

            default:
                System.out.println("Error choose a number 1-4");
        }

        System.out.println(gameMenu);


    }
}}
