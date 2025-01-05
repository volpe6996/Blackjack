public class GameModel {
    public int availableChips;
    public int currentBet;
    public int croupierHandValue;
    public int playerHandValue;

    public GameModel(int startChips) {
        // żetony na start
        availableChips = startChips;
        currentBet = 0;
        croupierHandValue = 0;
        playerHandValue = 0;
    }
}
