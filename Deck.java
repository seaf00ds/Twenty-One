import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    static Random rand = new Random();

    static public void showCards(ArrayList<Card> deckOfCards) {
        try {
            for (int x = 0; x < deckOfCards.size(); x++) {
                System.out.println(deckOfCards.get(x).rank + " " + deckOfCards.get(x).suit);
            }
            System.out.println("This deck has " + deckOfCards.size() + " cards");
        } catch (Exception e) {
            System.out.println("Something went wrong when printing the deck of cards\n" + "Error: " + e);
        }
    }

    //returns the Card that was removed from the arraylist
    static public Card drawACard(ArrayList<Card> deckOfCards) {
        int rando = rand.nextInt(deckOfCards.size());
        Card drawACard = deckOfCards.get(rando);
        deckOfCards.remove(rando);
        return drawACard;
    }

}
