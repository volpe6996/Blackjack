import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StatsView extends JPanel {
    JButton goToGameView;

    private JStatLabel numberOfWinsLabel;
    private JStatLabel numberOfLossesLabel;
    private JStatLabel numberOfDrawsLabel;
    private JStatLabel winLossRatioLabel;
    private JStatLabel totalWiningsLabel;
    private JStatLabel totalLossesLabel;
    private JStatLabel biggestWinLabel;
    private JStatLabel biggestLossLabel;
    private JStatLabel totalBetsLabel;
    private JStatLabel averageBetLabel;
    private JStatLabel numberOfCroupierBlackjacksLabel;
    private JStatLabel numberOfPlayerBlackjacksLabel;
    private JStatLabel biggestWinStreakLabel;
    private JStatLabel biggestLossStreakLabel;
    private JStatLabel numberOfHitsLabel;
    private JStatLabel numberOfStandsLabel;

    private JStat numberOfWins;
    private JStat numberOfLosses;
    private JStat numberOfDraws;
    private JStat winLossRatio;
    private JStat totalWinings;
    private JStat totalLosses;
    private JStat biggestWin;
    private JStat biggestLoss;
    private JStat totalBets;
    private JStat averageBet;
    private JStat numberOfCroupierBlackjacks;
    private JStat numberOfPlayerBlackjacks;
    private JStat biggestWinStreak;
    private JStat biggestLossStreak;
    private JStat numberOfHits;
    private JStat numberOfStands;

    public void displayStats(Stats stats) {
        numberOfWins.setText(String.valueOf(stats.getWins()));
        numberOfLosses.setText(String.valueOf(stats.getLosses()));
        numberOfDraws.setText(String.valueOf(stats.getDraws()));
        winLossRatio.setText(String.valueOf(String.format("%.2f", stats.getWinLossRatio())));
        totalWinings.setText(String.valueOf(stats.getTotalMoneyWinings()));
        totalLosses.setText(String.valueOf(stats.getTotalMoneyLoss()));
        biggestWin.setText(String.valueOf(stats.getBiggestWin()));
        biggestLoss.setText(String.valueOf(stats.getBiggestLoss()));
        totalBets.setText(String.valueOf(stats.getTotalBets()));
        averageBet.setText(String.valueOf(String.format("%.2f", stats.getAverageBet())));
        numberOfPlayerBlackjacks.setText(String.valueOf(stats.getNumberOfPlayerBlackjacks()));
        numberOfCroupierBlackjacks.setText(String.valueOf(stats.getNumberOfCroupierBlackjacks()));
        biggestWinStreak.setText(String.valueOf(stats.getLongestWinStreak()));
        biggestLossStreak.setText(String.valueOf(stats.getLongestLossStreak()));
        numberOfHits.setText(String.valueOf(stats.getHits()));
        numberOfStands.setText(String.valueOf(stats.getStands()));
    }

    public StatsView() {
        this.setBackground(new Color(0 ,128, 0));

        goToGameView = new JButton ("WRÓĆ DO GRY");

        goToGameView.setFont(new Font("Arial", Font.BOLD, 32));
        goToGameView.setForeground(Color.BLACK);
        goToGameView.setBackground(Color.GRAY);
        goToGameView.setBorder(BorderFactory.createLineBorder(new Color(255, 10 ,20), 3));
        goToGameView.setFocusPainted(false);

        numberOfWinsLabel = new JStatLabel ("Liczba wygranych");
        numberOfLossesLabel = new JStatLabel ("Liczba przegranych");
        numberOfDrawsLabel = new JStatLabel ("Liczba remisów");
        winLossRatioLabel = new JStatLabel ("Win / Loss ratio");
        totalWiningsLabel = new JStatLabel ("Łączna wygrana");
        totalLossesLabel = new JStatLabel("Łączna przegrana");
        biggestWinLabel = new JStatLabel ("Największa wygrana");
        biggestLossLabel = new JStatLabel("Największa przegrana");
        totalBetsLabel = new JStatLabel("Zakłady łączenie");
        averageBetLabel = new JStatLabel("Średni zakład");
        numberOfPlayerBlackjacksLabel = new JStatLabel("Blackjacki gracza");
        numberOfCroupierBlackjacksLabel = new JStatLabel("Blackjacki krupiera");
        biggestWinStreakLabel = new JStatLabel("Najdłuższa passa wygranych");
        biggestLossStreakLabel = new JStatLabel("Najdłuższa passa przegranych");
        numberOfHitsLabel = new JStatLabel("Hity");
        numberOfStandsLabel = new JStatLabel("Standy");

        numberOfWins = new JStat ("wins");
        numberOfLosses = new JStat ("losses");
        numberOfDraws = new JStat ("draws");
        winLossRatio = new JStat ("winRatio");
        totalWinings = new JStat ("totalWinings");
        totalLosses = new JStat ("totalLosses");
        biggestWin = new JStat ("biggestWin");
        biggestLoss = new JStat ("biggestLoss");
        totalBets = new JStat ("totalBets");
        averageBet = new JStat ("averageBet");
        numberOfCroupierBlackjacks = new JStat ("numberOfCroupierBlackjacks");
        numberOfPlayerBlackjacks = new JStat ("numberOfPlayerBlackjacks");
        biggestWinStreak = new JStat ("biggestWinStreak");
        biggestLossStreak = new JStat ("biggestLossStreak");
        numberOfHits = new JStat ("numberOfHits");
        numberOfStands = new JStat ("numberOfStands");

        //adjust size and set layout
        setPreferredSize (new Dimension (1344, 756));
        setLayout (null);

        //add components
        add (goToGameView);

        add(numberOfWinsLabel);
        add(numberOfLossesLabel);
        add(numberOfDrawsLabel);
        add(winLossRatioLabel);
        add(totalWiningsLabel);
        add(totalLossesLabel);
        add(biggestWinLabel);
        add(biggestLossLabel);
        add(totalBetsLabel);
        add(averageBetLabel);
        add(numberOfCroupierBlackjacksLabel);
        add(numberOfPlayerBlackjacksLabel);
        add(biggestWinStreakLabel);
        add(biggestLossStreakLabel);
        add(numberOfHitsLabel);
        add(numberOfStandsLabel);

        add(numberOfWins);
        add(numberOfLosses);
        add(numberOfDraws);
        add(winLossRatio);
        add(totalWinings);
        add(totalLosses);
        add(biggestWin);
        add(biggestLoss);
        add(totalBets);
        add(averageBet);
        add(numberOfCroupierBlackjacks);
        add(numberOfPlayerBlackjacks);
        add(biggestWinStreak);
        add(biggestLossStreak);
        add(numberOfHits);
        add(numberOfStands);

        var height = 100;
        var width = 316;

        //set component bounds (only needed by Absolute Positioning)
        goToGameView.setBounds(541, 661, 270, 60);

        numberOfWinsLabel.setBounds(20,20,width,50);
        numberOfLossesLabel.setBounds(351,20,width,50);
        numberOfDrawsLabel.setBounds(682,20,width,50);
        winLossRatioLabel.setBounds(1013,20,width,50);

        totalWiningsLabel.setBounds(20,190,width,50);
        totalLossesLabel.setBounds(351,190,width,50);
        biggestWinLabel.setBounds(682,190,width,50);
        biggestLossLabel.setBounds(1013,190,width,50);

        totalBetsLabel.setBounds(20,350,width,50);
        averageBetLabel.setBounds(351,350,width,50);
        numberOfCroupierBlackjacksLabel.setBounds(682,350,width,50);
        numberOfPlayerBlackjacksLabel.setBounds(1013,350,width,50);

        biggestWinStreakLabel.setBounds(20,510,width,50);
        biggestLossStreakLabel.setBounds(351,510,width,50);
        numberOfHitsLabel.setBounds(682,510,width,50);
        numberOfStandsLabel.setBounds(1013,510,width,50);

        //---------

        numberOfWins.setBounds(20,75,width,height);
        numberOfLosses.setBounds(351,75,width,height);
        numberOfDraws.setBounds(682,75,width,height);
        winLossRatio.setBounds(1013,75,width,height);

        totalWinings.setBounds(20,240,width,height);
        totalLosses.setBounds(351,240,width,height);
        biggestWin.setBounds(682,240,width,height);
        biggestLoss.setBounds(1013,240,width,height);

        totalBets.setBounds(20,400,width,height);
        averageBet.setBounds(351,400,width,height);
        numberOfCroupierBlackjacks.setBounds(682,400,width,height);
        numberOfPlayerBlackjacks.setBounds(1013,400,width,height);

        biggestWinStreak.setBounds(20,560,width,height);
        biggestLossStreak.setBounds(351,560,width,height);
        numberOfHits.setBounds(682,560,width,height);
        numberOfStands.setBounds(1013,560,width,height);
    }
}