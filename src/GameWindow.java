import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GameWindow extends JPanel {
    private JButton chip5;
    private JButton chip100;
    private JButton chip10;
    private JButton chip250;
    private JButton chip25;
    private JButton chip500;
    private JButton chip50;
    private JButton chip1000;
    private JButton hitBtn;
    private JButton standBtn;
    private JButton doubleBtn;
    private JButton settingsBtn;
    private JButton musicBtn;
    private JButton statsBtn;
    private JLabel croupierHand;
    private JLabel playersHand;
    private JLabel balance;
    private JLabel currentBet;

    public GameWindow() {
        //construct components
        chip5 = new JImageButton ("img/chip5.png", 100,100);
        chip10 = new JImageButton ("img/chip10.png", 100,100);
        chip25 = new JImageButton ("img/chip25.png", 100,100);
        chip50 = new JImageButton ("img/chip50.png", 100,100);
        chip100 = new JImageButton ("img/chip100.png", 100,100);
        chip250 = new JImageButton ("img/chip250.png", 100,100);
        chip500 = new JImageButton ("img/chip500.png", 100,100);
        chip1000 = new JImageButton ("img/chip1000.png", 100,100);

        hitBtn = new JButton ("HIT");
        standBtn = new JButton ("STAND");
        doubleBtn = new JButton ("DOUBLE");

        settingsBtn = new JImageButton ("img/settings.png", 60, 60);
        musicBtn = new JImageButton ("img/music.png", 60, 60);
        statsBtn = new JImageButton ("img/stats.png", 60, 60);

        croupierHand = new JLabel ("croupier hand");
        playersHand = new JLabel ("players hand");

        balance = new JLabel ("Dostępne żetony");
        currentBet = new JLabel ("Aktualny zakład");

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
        doubleBtn.setBackground(Color.cyan);
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
        add (croupierHand);
        add (playersHand);
        add (balance);
        add (currentBet);

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

        croupierHand.setBounds (1090, 378, 126, 126);
        playersHand.setBounds (1216, 378, 126, 126);
        balance.setBounds (1090, 126, 252, 126);
        currentBet.setBounds (1090, 252, 252, 126);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Blackjack");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("img/blackjack.png").getImage());
        frame.getContentPane().add (new GameWindow());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible (true);
    }
}