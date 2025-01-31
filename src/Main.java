import javax.swing.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        JFrame frame = new JFrame ("Blackjack");
        JFrame statsFrame = new JFrame ("Statystyki");

        var deckOfCards = new Deck();
        var stats = new Stats();

        var gameView = new GameView();
        var statsView = new StatsView();
        var model = new GameModel(500, deckOfCards);
        var gameController = new GameController(gameView, statsView, model, frame, statsFrame, stats);
        var statsController = new StatsController(statsView, frame, statsFrame);

        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("img/blackjack.png").getImage());
        frame.getContentPane().add(gameView);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible (true);

        statsFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        statsFrame.setIconImage(new ImageIcon("img/blackjack.png").getImage());
        statsFrame.getContentPane().add(statsView);
        statsFrame.pack();
        statsFrame.setLocationRelativeTo(null);
        statsFrame.setResizable(false);
        statsFrame.setVisible (false);
    }
}