import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        var view = new GameView();
        var model = new GameModel(500);
        var controller = new GameController(view, model);

        JFrame frame = new JFrame ("Blackjack");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("img/blackjack.png").getImage());
        frame.getContentPane().add(view);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible (true);
    }
}