/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * Modifier: Jasmeet Singh
 * Student #: sin17476
 * Date Modified: May 21, 2025
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13 + 1)); // value from 1 to 13
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // random suit
            magicHand[i] = c;
        }

        
        System.out.print("Enter a card value (1 to 13): ");
        int userValue = input.nextInt();
        input.nextLine(); // clear newline

        System.out.print("Enter a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.nextLine();

        
        boolean userCardFound = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userValue &&
                magicHand[i].getSuit().equalsIgnoreCase(userSuit)) {
                userCardFound = true;
                break;
            }
        }

        if (userCardFound) {
            System.out.println("🎉 Your card is in the magic hand!");
        } else {
            System.out.println("❌ Your card is NOT in the magic hand.");
        }

        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        boolean luckyCardFound = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == luckyCard.getValue() &&
                magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                luckyCardFound = true;
                break;
            }
        }

        if (luckyCardFound) {
            System.out.println( "Lucky card (2 of Clubs) is in the magic hand!");
        } else {
            System.out.println("Lucky card (2 of Clubs) is NOT in the magic hand.");
        }

        
        System.out.println("\nCards in magic hand:");
        for (int i = 0; i < magicHand.length; i++) {
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
    }
}