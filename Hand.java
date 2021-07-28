import java.util.ArrayList;

public class Hand {
    //Card combo function, prints when the cards are in a certain format
    static public boolean sameSuit(ArrayList<Card> playerHand) {
        Character initialChar = playerHand.get(0).suit;
        boolean sameSuitCards = false;

        for (int h = 0; h < playerHand.size(); h++) {
            if (!initialChar.equals(playerHand.get(h).suit)) {
                sameSuitCards = false;
            } else {
                sameSuitCards = true;
            }
        }
        return sameSuitCards;
    }

    static public boolean fourOfAKind(ArrayList<Card> playerHand) {
        for (int s = 0; s < playerHand.size(); s++) {
            int fourOfAKindCount = 0;
            for (int t = 0; t < playerHand.size(); t++) {
                if (playerHand.get(s).rank == playerHand.get(t).rank) {
                    fourOfAKindCount++;
                }
            }
            if (fourOfAKindCount >= 4) {
                return true;
            }
        }
        return false;
    }

    static public boolean threeOfAKind(ArrayList<Card> playerHand) {
        for (int s = 0; s < playerHand.size(); s++) {
            int threeOfAKindCount = 0;
            for (int t = 0; t < playerHand.size(); t++) {
                if (playerHand.get(s).rank == playerHand.get(t).rank) {
                    threeOfAKindCount++;
                }
            }
            if (threeOfAKindCount >= 3) {
                return true;
            }
        }
        return false;
    }

     static public boolean twoOfAKind(ArrayList<Card> playerHand) {
        for (int s = 0; s < playerHand.size(); s++) {
            int twoOfAKindCount = 0;
            for (int t = 0; t < playerHand.size(); t++) {
                if (playerHand.get(s).rank == playerHand.get(t).rank) {
                    twoOfAKindCount++;
                }
            }
            if (twoOfAKindCount >= 2) {
                return true;
            }
        }
        return false;
    }
}
