import java.awt.*;
import javax.swing.*;

public class GameView extends JPanel {
    JImageButton chip5;
    JImageButton chip100;
    JImageButton chip10;
    JImageButton chip250;
    JImageButton chip25;
    JImageButton chip500;
    JImageButton chip50;
    JImageButton chip1000;
    JButton hitBtn;
    JButton standBtn;
    JButton doubleBtn;
    JImageButton settingsBtn;
    JImageButton musicBtn;
    JImageButton statsBtn;
    private JLabel croupierHandValue;
    private JLabel playersHandValue;
    private JLabel balance;
    private JLabel currentBet;
    private JLabel table;

    private JLabel card1;
    private JLabel card2;

    private JLabel card;

    public void setCurrentBet(int chipAmount) {
        currentBet.setText("Aktualny zakład: " + chipAmount);
    }

    public void setBalance(int chipAmount) {
        balance.setText("Dostępne żetony: " + chipAmount);
    }

    public GameView() {
        //construct components
        chip5 = new JImageButton ("img/chip5.png", 100,100);
        chip10 = new JImageButton ("img/chip10.png", 100,100);
        chip25 = new JImageButton ("img/chip25.png", 100,100);
        chip50 = new JImageButton ("img/chip50.png", 100,100);
        chip100 = new JImageButton ("img/chip100.png", 100,100);
        chip250 = new JImageButton ("img/chip250.png", 100,100);
        chip500 = new JImageButton ("img/chip500.png", 100,100);
        chip1000 = new JImageButton ("img/chip1000.png", 100,100);

        settingsBtn = new JImageButton ("img/settings.png", 60, 60);
        musicBtn = new JImageButton ("img/music.png", 60, 60);
        statsBtn = new JImageButton ("img/stats.png", 60, 60);

        hitBtn = new JButton ("HIT");
        standBtn = new JButton ("STAND");
        doubleBtn = new JButton ("DOUBLE");

        croupierHandValue = new JLabel ("croupier hand");
        playersHandValue = new JLabel ("players hand");

        table = new JLabel(new ImageIcon("img/table.png"));

        card1 = new JLabel();
        card2 = new JLabel();
        card1.setIcon(new ImageIcon(new ImageIcon("img/cards/karo7.png").getImage().getScaledInstance(140, 200, Image.SCALE_SMOOTH)));
        card2.setIcon(new ImageIcon(new ImageIcon("img/cards/karo8.png").getImage().getScaledInstance(140, 200, Image.SCALE_SMOOTH)));

        balance = new JLabel ("Dostępne żetony", SwingConstants.CENTER);
        balance.setFont(new Font("Arial", Font.BOLD, 20));

        currentBet = new JLabel ("Aktualny zakład: 0", SwingConstants.CENTER);
        currentBet.setFont(new Font("Arial", Font.BOLD, 20));

        hitBtn.setFont(new Font("Arial", Font.BOLD, 30));
        hitBtn.setForeground(Color.BLACK);
        hitBtn.setBackground(Color.GREEN);
        hitBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        hitBtn.setFocusPainted(false);

        standBtn.setFont(new Font("Arial", Font.BOLD, 30));
        standBtn.setForeground(Color.BLACK);
        standBtn.setBackground(Color.RED);
        standBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        standBtn.setFocusPainted(false);

        doubleBtn.setFont(new Font("Arial", Font.BOLD, 30));
        doubleBtn.setForeground(Color.BLACK);
        doubleBtn.setBackground(Color.BLUE);
        doubleBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        doubleBtn.setFocusPainted(false);

        //adjust size and set layout
        setPreferredSize (new Dimension (1344, 756));
        setLayout (null);

        //add components
        add (chip5);
        add (chip100);
        add (chip10);
        add (chip250);
        add (chip25);
        add (chip500);
        add (chip50);
        add (chip1000);
        add (hitBtn);
        add (standBtn);
        add (doubleBtn);
        add (settingsBtn);
        add (musicBtn);
        add (statsBtn);
        add (croupierHandValue);
        add (playersHandValue);
        add (balance);
        add (currentBet);
        add (card1);
        add (card2);

        add (table);

        //set component bounds (only needed by Absolute Positioning)
        chip5.setBounds (0, 506, 168, 126);
        chip10.setBounds (166, 506, 168, 126);
        chip25.setBounds (332, 506, 168, 126);
        chip50.setBounds (498, 506, 168, 126);

        chip100.setBounds (0, 630, 168, 126);
        chip250.setBounds (166, 630, 168, 126);
        chip500.setBounds (332, 630, 168, 126);
        chip1000.setBounds (498, 630, 168, 126);

        hitBtn.setBounds (664, 506, 252, 250);
        standBtn.setBounds (915, 506, 252, 250);
        doubleBtn.setBounds (1165, 506, 179, 250);

        settingsBtn.setBounds (1090, 0, 86, 126);
        musicBtn.setBounds (1174, 0, 86, 126);
        statsBtn.setBounds (1258, 0, 86, 126);

        balance.setBounds (1090, 126, 252, 80);
        currentBet.setBounds (1090, 206, 252, 80);
        croupierHandValue.setBounds (1090, 378, 126, 126);
        playersHandValue.setBounds (1216, 378, 126, 126);

        card1.setBounds (40, 35, 150, 200);
        card2.setBounds (40, 270, 150, 200);
        table.setBounds (0, 0, 1090, 506);
    }


    public static void main (String[] args) {
//        JFrame frame = new JFrame ("Blackjack");
//        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
//        frame.setIconImage(new ImageIcon("img/blackjack.png").getImage());
//        frame.getContentPane().add(new GameView());
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//        frame.setVisible (true);
    }
}