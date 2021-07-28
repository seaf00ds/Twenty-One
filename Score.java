import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Score {
    static Random rand = new Random();

    static public int playerCalculation(ArrayList<Card> playerHand) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int j = 0; j < playerHand.size(); j++) {
            if (playerHand.get(j).rank == 1) {
                System.out.println("You have an ace! Do you want its score to be 1 or 10?\n(Type in '1' or '10')");
                String aceChoice = scan.nextLine();
                if (aceChoice.equals("1")) {
                    playerHand.get(j).rank = 1;
                } else {
                    playerHand.get(j).rank = 10;
                }
                total += playerHand.get(j).rank;
            } else if (10 < playerHand.get(j).rank) {
                total += 10;
            } else {
                total += playerHand.get(j).rank;
            }
        }
        System.out.println("Your current hand: " + playerHand);
        System.out.println(total);
        return total;
    }

    static public int opponentCalculation(ArrayList<Card> deckOfCards, ArrayList<Card> playerHand) {
        int total = 0;
        int index = 0;

        while (total < 17) {
            int rando = rand.nextInt(deckOfCards.size());
            Card drawACard = deckOfCards.get(rando);
            deckOfCards.remove(rando);

            playerHand.add(drawACard);
            total += playerHand.get(index).rank;
            index++;
        }
        return total;
    }
}
