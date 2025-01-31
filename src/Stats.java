import java.io.Serializable;

public class Stats implements Serializable {
    private int wins;
    private int losses;
    private int draws;
    private double winLossRatio;

    private int totalWinings;
    private int totalLoss;
    private int biggestWin;
    private int biggestLoss;
    private int totalBets;
    private double averageBet;

    private int numberOfCroupierBlackjacks;
    private int numberOfPlayerBlackjacks;

    private int longestWinStreak;
    private int longestLossStreak;
    private int currentWinStreak;
    private int currentLossStreak;

    private int hits;
    private int stands;

    public void incrementWins() { wins++; }
    public void incrementLosses() { losses++; }
    public void incrementDraws() { draws++; }
    public void calculateWinLossRatio() { if(totalWinings > 0) winLossRatio = (double)wins / (double)losses; }

    public void addToTotalWinings(int prize) { totalWinings += prize; }
    public void addToTotalLoss(int loss) { totalLoss += loss; }
    public void setBiggestWin(int win) { if(biggestWin < win) biggestWin = win; }
    public void setBiggestLoss(int loss) { if(biggestLoss < loss) biggestLoss = loss; }
    public void setTotalBets(int bet) { totalBets += bet; }
    public void calculateAverageBet() { averageBet = (double)totalBets / (double)(wins+losses+draws); }

    public void incrementNumberOfCroupierBlackjacks() { numberOfCroupierBlackjacks++; }
    public void incrementNumberOfPlayerBlackjacks() { numberOfPlayerBlackjacks++; }

    public void incrementCurrentWinStreak() { currentWinStreak++; if(currentWinStreak > longestWinStreak) longestWinStreak = currentWinStreak; }
    public void incrementCurrentLossStreak() { currentLossStreak++; if(currentLossStreak > longestLossStreak) longestLossStreak = currentLossStreak;}
    public void resetCurrentWinStreak(){ currentWinStreak = 0; }
    public void resetCurrentLossStreak(){ currentLossStreak = 0; }

    public void incrementHits() { hits++; }
    public void incrementStands() { stands++; }

    public int getWins() { return wins; }
    public int getLosses() { return losses; }
    public int getDraws() { return draws; }
    public double getWinLossRatio() { calculateWinLossRatio(); return winLossRatio; }
    public int getTotalMoneyWinings() { return totalWinings; }
    public int getTotalMoneyLoss() { return totalLoss; }
    public int getBiggestWin() { return biggestWin; }
    public int getBiggestLoss() { return biggestLoss; }
    public int getTotalBets() { return totalBets; }
    public double getAverageBet() { calculateAverageBet(); return averageBet; }
    public int getNumberOfPlayerBlackjacks() { return numberOfPlayerBlackjacks; }
    public int getNumberOfCroupierBlackjacks() { return numberOfCroupierBlackjacks; }
    public int getLongestWinStreak() { return longestWinStreak; }
    public int getLongestLossStreak() { return longestLossStreak; }
    public int getCurrentWinStreak() { return currentWinStreak; }
    public int getCurrentLossStreak() { return currentLossStreak; }
    public int getHits() { return hits; }
    public int getStands() { return stands; }

    Stats(){
        wins = 0;
        losses = 0;
        draws = 0;
        winLossRatio = 0.0;
        totalWinings = 0;
        totalLoss = 0;
        biggestWin = 0;
        biggestLoss = 0;
        totalBets = 0;
        averageBet = 0.0;
        numberOfCroupierBlackjacks = 0;
        numberOfPlayerBlackjacks = 0;
        longestWinStreak = 0;
        longestLossStreak = 0;
        currentWinStreak = 0;
        currentLossStreak = 0;
        hits = 0;
        stands = 0;
    }
}