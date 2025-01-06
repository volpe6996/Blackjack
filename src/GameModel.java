public class GameModel {
    public int availableChips;
    public int currentBet;
    public int croupierHandValue;
    public int playerHandValue;
    private int startChips;
    public Deck deck;
    public int numberOfCroupiersCards = 0;
    public int numberOfPlayersCards = 0;

    public int getStartChips() {
        return startChips;
    }

    public GameModel(int chipBase, Deck cards) {
        startChips = chipBase;
        availableChips = chipBase;
        currentBet = 0;
        croupierHandValue = 0;
        playerHandValue = 0;
        deck = cards;
    }
}
