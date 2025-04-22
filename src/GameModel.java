import java.io.*;
import java.util.ArrayList;

public class GameModel {
    public int availableChips;
    public int currentBet;
    public int betBeforeDouble;
    private int startChips;
    public boolean chipAddEnabled = true;

    public Player player;
    public Player croupier;

    public Deck deck;

    public int getStartChips() {
        return startChips;
    }

    public GameModel(int chipBase, Deck cards) {
        startChips = chipBase;
        availableChips = chipBase;
        currentBet = 0;
        deck = cards;

        player = new Player();
        croupier = new Player();
    }
}
