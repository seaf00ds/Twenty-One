import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//The goal is to get as close to 21
public class TwentyOne {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            TwentyOne();
            System.out.println("Do you want to play again?\n[y/n]");
            if (scan.nextLine().equals("n")) playAgain = false;

        }
    }

    static public void TwentyOne() {
        //I'm using arraylist to store the deck and the players cards
        ArrayList<Card> p1 = new ArrayList<>();
        ArrayList<Card> p2 = new ArrayList<>();
        ArrayList<Card> deckOfCards = new ArrayList<>();

        //this for loop initiates the deck
        for (int i = 1; i < 14; i++) {
            Card spades = new Card(i, 'S');
            deckOfCards.add(spades);
            Card hearts = new Card(i, 'H');
            deckOfCards.add(hearts);
            Card clovers = new Card(i, 'C');
            deckOfCards.add(clovers);
            Card diamonds = new Card(i, 'D');
            deckOfCards.add(diamonds);
        }

        //shows the deck and the associated points
        System.out.println("Here's the deck we'll be using!");
        Deck.showCards(deckOfCards);
        Collections.shuffle(deckOfCards); //shuffles the arraylist
        System.out.println("The Deck is now shuffled!");

        //draw the card(s) from the deck
        boolean stayInLoop = true;
        while (stayInLoop) {
            p1.add(Deck.drawACard(deckOfCards));
            System.out.println("========================================================================================================");
            System.out.println("Your current hand: " + p1);
            System.out.println("Draw another card?\n[y/n]");
            if (scan.nextLine().equals("n")) {
                stayInLoop = false;
            }
        }
        System.out.println("========================================================================================================");

        //Determines the card combo
        if (Hand.sameSuit(p1) && p1.size() > 1) {
            System.out.println("Your cards have the same Suit!");
        }
        if (Hand.fourOfAKind(p1)) {
            System.out.println("Your hand has four of a kind!");
        } else if (Hand.threeOfAKind(p1)) {
            System.out.println("Your hand has three of a kind!");
        } else if (Hand.twoOfAKind(p1)) {
            System.out.println("Your hand has two of a kind!");
        }

        //calculates the score for each player
        int player1Score = Score.playerCalculation(p1);
        int player2Score = Score.opponentCalculation(deckOfCards, p2);
        System.out.println("Your opponent's hand: " + p2);
        System.out.println("Your opponent scored: " + player2Score);
        System.out.println("You scored: " + player1Score);

        if (player1Score > player2Score && player1Score < 22 && player2Score < 22) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose");
        }
        System.out.println("Game Over");
    }
}
