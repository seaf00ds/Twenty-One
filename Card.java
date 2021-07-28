class Card {
    int rank;
    char suit;

    public Card(int rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardRank;
        switch (this.rank) {
            case 1:
                cardRank = "A";
                break;
            case 10:
                cardRank = "X";
                break;
            case 11:
                cardRank = "J";
                break;
            case 12:
                cardRank = "Q";
                break;
            case 13:
                cardRank = "K";
                break;
            default:
                cardRank = String.valueOf(this.rank);
        }
        return "\n_______\n" + "|" + cardRank + suit + "   |\n" + "|    " + " |\n" + "|_____|";
    }
}
