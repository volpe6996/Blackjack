import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;
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
    JButton startGameBtn;
    JButton hitBtn;
    JButton standBtn;
    JButton doubleBtn;
    JButton resetBetBtn;
    JImageButton settingsBtn;
    JImageButton musicBtn;
    JImageButton statsBtn;
    JButton addChipsBtn;
    private JLabel croupierHandValue;
    private JLabel playersHandValue;
    private JLabel balance;
    private JLabel currentBet;
    private JTextArea gameInfo;
    private JLabel table;

    ArrayList<JCard> playerCards;
    ArrayList<JCard> croupierCards;

    private JLabel card1;
    private JLabel card2;

    private JLabel card;

    public void setCurrentBet(int chipAmount) {
        currentBet.setText("Aktualny zakład: " + chipAmount);
    }

    public void setBalance(int chipAmount) {
        balance.setText("Dostępne żetony: " + chipAmount);
    }

    public void setCroupierHandValue(int handValue) {
        croupierHandValue.setText("Krupier: " + handValue);
    }

    public void setPlayersHandValue(int handValue) {
        playersHandValue.setText("Gracz: " + handValue);
    }

    public void setGameInfo(String info) {
        gameInfo.setText(info);
    }

    public void addCroupierCard(int index, String cardImgUrl){
        croupierCards.get(index).setImage(cardImgUrl);
    }

    public void addPlayerCard(int index, String cardImgUrl){
        playerCards.get(index).setImage(cardImgUrl);
    }

    public GameView() {
        //construct components
        chip5 = new JImageButton ("img/chip5.png", 80,80);
        chip10 = new JImageButton ("img/chip10.png", 80,80);
        chip25 = new JImageButton ("img/chip25.png", 80,80);
        chip50 = new JImageButton ("img/chip50.png", 80,80);
        chip100 = new JImageButton ("img/chip100.png", 80,80);
        chip250 = new JImageButton ("img/chip250.png", 80,80);
        chip500 = new JImageButton ("img/chip500.png", 80,80);
        chip1000 = new JImageButton ("img/chip1000.png", 80,80);

        settingsBtn = new JImageButton ("img/settings.png", 60, 60);
        musicBtn = new JImageButton ("img/music.png", 60, 60);
        statsBtn = new JImageButton ("img/stats.png", 60, 60);
        addChipsBtn = new JButton ("Dodaj żetony");

        startGameBtn = new JButton ("START");
        hitBtn = new JButton ("HIT");
        standBtn = new JButton ("STAND");
        doubleBtn = new JButton ("DOUBLE");
        resetBetBtn = new JButton("KASUJ ZAKŁAD");

        croupierHandValue = new JLabel ();
        croupierHandValue.setFont(new Font("Arial", Font.BOLD, 30));
        croupierHandValue.setForeground(Color.YELLOW);

        playersHandValue = new JLabel ();
        playersHandValue.setFont(new Font("Arial", Font.BOLD, 30));
        playersHandValue.setForeground(Color.YELLOW);

        table = new JLabel(new ImageIcon(new ImageIcon("img/table.png").getImage().getScaledInstance(1090, 556, Image.SCALE_SMOOTH)));

        playerCards = new ArrayList<>();
        playerCards.add(new JCard(""));
        playerCards.add(new JCard(""));
        playerCards.add(new JCard(""));
        playerCards.add(new JCard(""));
        playerCards.add(new JCard(""));
        playerCards.add(new JCard(""));

        croupierCards = new ArrayList<>();
        croupierCards.add(new JCard(""));
        croupierCards.add(new JCard(""));
        croupierCards.add(new JCard(""));
        croupierCards.add(new JCard(""));
        croupierCards.add(new JCard(""));
        croupierCards.add(new JCard(""));

//        playerCards = new ArrayList<>();
//        playerCards.add(new JCard("img/cards/karo7.png"));
//        playerCards.add(new JCard("img/cards/karo8.png"));
//        playerCards.add(new JCard("img/cards/karo9.png"));
//        playerCards.add(new JCard("img/cards/karo10.png"));
//        playerCards.add(new JCard("img/cards/asKaro.png"));
//        playerCards.add(new JCard("img/cards/krolKaro.png"));
//
//        croupierCards = new ArrayList<>();
//        croupierCards.add(new JCard("img/cards/pik7.png"));
//        croupierCards.add(new JCard("img/cards/pik8.png"));
//        croupierCards.add(new JCard("img/cards/pik9.png"));
//        croupierCards.add(new JCard("img/cards/pik10.png"));
//        croupierCards.add(new JCard("img/cards/asPik.png"));
//        croupierCards.add(new JCard("img/cards/krolPik.png"));

        var spacing = 35;
        for (int i = 0; i < playerCards.size(); i++) {
            add (playerCards.get(i));
            add (croupierCards.get(i));

            if(i == 0) {
                croupierCards.get(i).setBounds(spacing, 118, 140, 200);
                playerCards.get(i).setBounds(spacing, 334, 140, 200);
            }
            else{
                croupierCards.get(i).setBounds((140*i+spacing*i)+spacing, 118, 140, 200);
                playerCards.get(i).setBounds((140*i+spacing*i)+spacing, 334, 140, 200);
            }
        }

        balance = new JLabel ("Dostępne żetony", SwingConstants.CENTER);
        balance.setFont(new Font("Arial", Font.BOLD, 20));

        currentBet = new JLabel ("Aktualny zakład: 0", SwingConstants.CENTER);
        currentBet.setFont(new Font("Arial", Font.BOLD, 20));

        gameInfo = new JTextArea();
        gameInfo.setFont(new Font("Arial", Font.BOLD, 16));
        gameInfo.setMargin(new Insets(0, 5, 0, 5));
        gameInfo.setForeground(Color.RED);
        gameInfo.setLineWrap(true);
        gameInfo.setWrapStyleWord(true);
        gameInfo.setEditable(false);
        gameInfo.setOpaque(false);
        gameInfo.setFocusable(false);

        startGameBtn.setFont(new Font("Arial", Font.BOLD, 30));
        startGameBtn.setForeground(Color.BLACK);
        startGameBtn.setBackground(Color.MAGENTA);
        startGameBtn.setBorder(BorderFactory.createDashedBorder(Color.BLACK, 4, 4));
        startGameBtn.setFocusPainted(false);

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

        resetBetBtn.setFont(new Font("Arial", Font.BOLD, 20));
        resetBetBtn.setForeground(Color.BLACK);
        resetBetBtn.setBackground(new Color(180, 167, 190));
        resetBetBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        resetBetBtn.setFocusPainted(false);

        addChipsBtn.setFont(new Font("Arial", Font.BOLD, 14));
        addChipsBtn.setForeground(Color.BLACK);
        addChipsBtn.setBackground(new Color(180, 167, 190));
        addChipsBtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        addChipsBtn.setFocusPainted(false);

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
        add (resetBetBtn);

        add (startGameBtn);
        add (hitBtn);
        add (standBtn);
        add (doubleBtn);

        add (settingsBtn);
        add (musicBtn);
        add (statsBtn);
        add (addChipsBtn);

        add (balance);
        add (currentBet);
        add (gameInfo);

        add (croupierHandValue);
        add (playersHandValue);
        add (table);

        //set component bounds (only needed by Absolute Positioning)
        chip5.setBounds (0, 556, 136, 101);
        chip10.setBounds (134, 556, 136, 101);
        chip25.setBounds (268, 556, 136, 101);
        chip50.setBounds (402, 556, 136, 101);

        chip100.setBounds (0, 655, 136, 101);
        chip250.setBounds (134, 655, 136, 101);
        chip500.setBounds (268, 655, 136, 101);
        chip1000.setBounds (402, 655, 136, 101);
        resetBetBtn.setBounds (536, 556, 175, 200);

        startGameBtn.setBounds(711, 556, 204, 200);
        hitBtn.setBounds (915, 556, 252, 101);
        standBtn.setBounds (915, 655, 252, 101);
        doubleBtn.setBounds (1165, 556, 179, 200);

        settingsBtn.setBounds (1090, 0, 86, 126);
        musicBtn.setBounds (1174, 0, 86, 126);
        statsBtn.setBounds (1258, 0, 86, 126);
        addChipsBtn.setBounds(1090, 206, 256, 30);

        balance.setBounds (1090, 126, 252, 80);
        currentBet.setBounds (1090, 236, 252, 80);
        gameInfo.setBounds (1090, 306, 252, 60);

        croupierHandValue.setBounds (210, 12, 200, 80);
        playersHandValue.setBounds (735, 12, 200, 80);

        table.setBounds (0, 0, 1090, 556);
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