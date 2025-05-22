/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then searches for a hardcoded lucky card.
 *
 * Modifier: Jasmeet Singh
 * Student #: sin17476
 * Date Modified: May 21, 2025
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }

        // Hardcoded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        // Check if luckyCard is in magic hand
        boolean luckyCardFound = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == luckyCard.getValue() &&
                magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                luckyCardFound = true;
                break;
            }
        }

        if (luckyCardFound) {
            System.out.println(" Lucky card (2 of Clubs) is in the magic hand!");
        } else {
            System.out.println(" Lucky card (2 of Clubs) is NOT in the magic hand.");
        }

        // Optional: print all cards
        System.out.println("\nCards in magic hand:");
        for (Card c : magicHand) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }
    }
}
