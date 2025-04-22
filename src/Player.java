public class Player {
    public int playerHandValue;
    public int playerHandValueWithoutAces;
    public int numberOfPlayersCards;
    public int playerAceCards;

    public Player() {
        playerHandValue = 0;
        playerHandValueWithoutAces = 0;
        numberOfPlayersCards = 0;
        playerAceCards = 0;
    }

    public void resetPlayer(){
        playerHandValue = 0;
        playerHandValueWithoutAces = 0;
        numberOfPlayersCards = 0;
        playerAceCards = 0;
    }
}
