import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GameController {
    private GameView gameView;
    private StatsView statsView;
    private GameModel gameModel;
    private JFrame gameFrame;
    private JFrame statsFrame;

    private Stats stats;

    public GameController(GameView gameView, StatsView statsView, GameModel gameModel, JFrame gameFrame, JFrame statsFrame, Stats stats) throws FileNotFoundException {
        this.gameView = gameView;
        this.statsView = statsView;
        this.gameModel = gameModel;
        this.gameFrame = gameFrame;
        this.statsFrame = statsFrame;
        this.stats = stats;

        System.out.println("nowy obiekt: " + this.stats.getWins());

        try{
            this.stats = Serializator.deserialize("stats.ser");
        } catch (Exception e){
            return;
        }

        System.out.println("obiekt po deserializacji: " + this.stats.getWins());


        gameView.setBalance(gameModel.availableChips);
        gameView.setPlayersHandValue(0);
        gameView.setCroupierHandValue(0);

        // CHIPS LISTENERS
        {
            gameView.chip5.addActionListener(chipListener);
            gameView.chip10.addActionListener(chipListener);
            gameView.chip25.addActionListener(chipListener);
            gameView.chip50.addActionListener(chipListener);
            gameView.chip100.addActionListener(chipListener);
            gameView.chip250.addActionListener(chipListener);
            gameView.chip500.addActionListener(chipListener);
            gameView.chip1000.addActionListener(chipListener);
            gameView.resetBetBtn.addActionListener(chipListener);
            gameView.addChipsBtn.addActionListener(chipListener);
        }

        // CONTROLS LISTENERS
        {
            gameView.startGameBtn.addActionListener(controlsListener);
            gameView.hitBtn.addActionListener(controlsListener);
            gameView.standBtn.addActionListener(controlsListener);
            gameView.doubleBtn.addActionListener(controlsListener);
            gameView.settingsBtn.addActionListener(controlsListener);
            gameView.musicBtn.addActionListener(controlsListener);
            gameView.statsBtn.addActionListener(controlsListener);
        }
    }

    ActionListener chipListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if(gameModel.chipAddEnabled){
                if(source == gameView.chip5){
                    editBet(5);
                } else if (source == gameView.chip10) {
                    editBet(10);
                } else if (source == gameView.chip25) {
                    editBet(25);
                } else if (source == gameView.chip50) {
                    editBet(50);
                } else if (source == gameView.chip100) {
                    editBet(100);
                } else if (source == gameView.chip250) {
                    editBet(250);
                } else if (source == gameView.chip500) {
                    editBet(500);
                } else if (source == gameView.chip1000) {
                    editBet(1000);
                } else if (source == gameView.resetBetBtn) {
                    gameModel.currentBet = 0;
                    gameView.setCurrentBet(gameModel.currentBet);
                } else if (source == gameView.addChipsBtn && gameModel.availableChips == 0) {
                    addChips();
                }
            }
        }
    };
    ActionListener controlsListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source == gameView.startGameBtn){
                if(gameModel.availableChips == 0){
                    gameView.setGameInfo("PRZEWALIŁEŚ MAJĄTEK! DODAJ ŻETONY!");
                }
                else if(gameModel.currentBet == 0){
                    gameView.setGameInfo("Postaw zakład aby rozpocząć!");
                }
                else{
                    resetGame();
                    enableHitStandDoubleButtons();
                    disableChipsStartResetButtons();

                    stats.setTotalBets(gameModel.currentBet);

                    pickCard(gameModel.player, 0, gameModel.deck.randomCard());
                    pickCard(gameModel.croupier, 1, gameModel.deck.randomCard());
                    pickCard(gameModel.player, 0, gameModel.deck.randomCard());

                    var card = gameModel.deck.randomCard();
                    if(gameModel.croupier.playerHandValue + card.getFirstValue() == 21 || gameModel.croupier.playerHandValue + card.getSecondValue() == 21)
                        pickCard(gameModel.croupier, 1, card);
                    else
                        gameView.addCroupierCard(gameModel.croupier.numberOfPlayersCards, "img/cards/rewers.png");

                    if(determineWinners()){
                        disableHitStandDoubleButtons();
                        enableChipsStartResetButtons();
                    }
                }
            }
            else if(source == gameView.hitBtn){
                stats.incrementHits();

                pickCard(gameModel.player, 0, gameModel.deck.randomCard());
                gameView.doubleBtn.setEnabled(false);
                if(determineWinners()){
                    disableHitStandDoubleButtons();
                    enableChipsStartResetButtons();
                }
            }
            else if (source == gameView.standBtn){
                disableHitStandDoubleButtons();

                stats.incrementStands();

                onStandDoubleButton();

                determineWinners();
            }
            else if (source == gameView.doubleBtn) {
                disableHitStandDoubleButtons();

                gameModel.betBeforeDouble = gameModel.currentBet;

                if(gameModel.currentBet*2 >= gameModel.availableChips)
                    gameModel.currentBet = gameModel.availableChips;
                else
                    gameModel.currentBet *= 2;

                gameView.setCurrentBet(gameModel.currentBet);

                pickCard(gameModel.player, 0, gameModel.deck.randomCard());

                if(!determineWinners())
                    onStandDoubleButton();

                determineWinners();

                gameModel.currentBet = gameModel.betBeforeDouble;
            }
            else if (source == gameView.settingsBtn) {

            }
            else if (source == gameView.musicBtn) {

            }
            else if (source == gameView.statsBtn) {
                Serializator.serialize(stats,"stats.ser");

                statsView.displayStats(stats);

                gameFrame.setVisible(false);
                statsFrame.setVisible(true);
            }
        }
    };

    // sprawdz warunki zakonczenia gry
    private boolean determineWinners() {
        var isEndGame = false;

        if (gameModel.player.playerHandValue == 21) {
            gameView.setGameInfo("BLACKJACK! WYGRAŁEŚ: " + (int)(1.5 * gameModel.currentBet));
            gameModel.availableChips += (int)(1.5 * gameModel.currentBet);

            stats.incrementWins();
            stats.incrementNumberOfPlayerBlackjacks();
            stats.addToTotalWinings((int)(1.5 * gameModel.currentBet));
            stats.setBiggestWin((int)(1.5 * gameModel.currentBet));
            stats.incrementCurrentWinStreak();
            stats.resetCurrentLossStreak();

            isEndGame = true;
        } else if (gameModel.croupier.playerHandValue >= 17 && gameModel.croupier.playerHandValue < gameModel.player.playerHandValue) {
            gameView.setGameInfo("KRUPIER NIE DAŁ RADY! WYGRAŁEŚ: " + gameModel.currentBet);
            gameModel.availableChips += gameModel.currentBet;

            stats.incrementWins();
            stats.addToTotalWinings(gameModel.currentBet);
            stats.setBiggestWin(gameModel.currentBet);
            stats.incrementCurrentWinStreak();
            stats.resetCurrentLossStreak();

            isEndGame = true;
        } else if (gameModel.croupier.playerHandValue >= 17 && gameModel.croupier.playerHandValue > gameModel.player.playerHandValue && gameModel.croupier.playerHandValue > 21) {
            gameView.setGameInfo("KRUPIER PRZESADZIŁ! WYGRAŁEŚ: " + gameModel.currentBet);
            gameModel.availableChips += gameModel.currentBet;

            stats.incrementWins();
            stats.addToTotalWinings(gameModel.currentBet);
            stats.setBiggestWin(gameModel.currentBet);
            stats.incrementCurrentWinStreak();
            stats.resetCurrentLossStreak();

            isEndGame = true;
        } else if (gameModel.croupier.playerHandValue == 21) {
            gameView.setGameInfo("BLACKJACK KRUPIERA! PRZEGRAŁEŚ: " + gameModel.currentBet);
            gameModel.availableChips -= gameModel.currentBet;

            stats.incrementLosses();
            stats.incrementNumberOfCroupierBlackjacks();
            stats.addToTotalLoss(gameModel.currentBet);
            stats.setBiggestLoss(gameModel.currentBet);
            stats.incrementCurrentLossStreak();
            stats.resetCurrentWinStreak();

            isEndGame = true;
        } else if (gameModel.player.playerHandValue > 21) {
            gameView.setGameInfo("PRZESADZIŁEŚ! PRZEGRAŁEŚ: " + gameModel.currentBet);
            gameModel.availableChips -= gameModel.currentBet;

            stats.incrementLosses();
            stats.addToTotalLoss(gameModel.currentBet);
            stats.setBiggestLoss(gameModel.currentBet);
            stats.incrementCurrentLossStreak();
            stats.resetCurrentWinStreak();

            isEndGame = true;
        } else if (gameModel.croupier.playerHandValue >= 17 && gameModel.croupier.playerHandValue > gameModel.player.playerHandValue && gameModel.croupier.playerHandValue <= 21) {
            gameView.setGameInfo("KRUPIER WYGRYWA! PRZEGRAŁEŚ: " + gameModel.currentBet);
            gameModel.availableChips -= gameModel.currentBet;

            stats.incrementLosses();
            stats.addToTotalLoss(gameModel.currentBet);
            stats.setBiggestLoss(gameModel.currentBet);
            stats.incrementCurrentLossStreak();
            stats.resetCurrentWinStreak();

            isEndGame = true;
        }

        if (gameModel.croupier.playerHandValue >= 17 &&
                gameModel.croupier.playerHandValue == gameModel.player.playerHandValue) {

            gameView.setGameInfo("LEPSZY REMIS NIŻ W .....");

            stats.incrementDraws();

            isEndGame = true;
        }

        if (gameModel.availableChips <= 0) {
            gameModel.availableChips = 0;
            gameModel.currentBet = 0;
            gameView.setCurrentBet(gameModel.currentBet);
        }

        gameView.setBalance(gameModel.availableChips);

        Serializator.serialize(stats,"stats.ser");

        if (isEndGame){
            enableChipsStartResetButtons();
            disableHitStandDoubleButtons();
        }

        return isEndGame;
    }

    // who == 0 -> player, who == 1 -> croupier
    private void pickCard(Player player, int who, Card card) {
        if(card.getSecondValue() != 0){
            player.playerAceCards++;
        }
        else{
            player.playerHandValue += card.getFirstValue();
            player.playerHandValueWithoutAces += card.getFirstValue();
        }

        if(who == 0){
            if(player.playerAceCards != 0){
                player.playerHandValue = calculateGreedyHandValue(player);
                gameView.setPlayersHandValue(player.playerHandValue);
            }
            else
                gameView.setPlayersHandValue(player.playerHandValue);

            gameView.addPlayerCard(player.numberOfPlayersCards++, card.getImgUrl());
        }
        else if(who == 1){
            if(player.playerAceCards != 0){
                player.playerHandValue = calculateGreedyHandValue(player);
                gameView.setCroupierHandValue(player.playerHandValue);
            }
            else
                gameView.setCroupierHandValue(player.playerHandValue);

            gameView.addCroupierCard(player.numberOfPlayersCards++, card.getImgUrl());
        }
    }

    private int calculateGreedyHandValue(Player player){
        if(player.playerHandValueWithoutAces + 11 <= 21 - (player.playerAceCards - 1))
            return 11 + (player.playerAceCards - 1) + player.playerHandValueWithoutAces;
        else
            return player.playerAceCards + player.playerHandValueWithoutAces;
    }

    private void onStandDoubleButton(){
        while (gameModel.croupier.playerHandValue < 17){
            var card = gameModel.deck.randomCard();

            if(gameModel.croupier.numberOfPlayersCards >= 2)
                pickCard(gameModel.croupier, 1, gameModel.deck.randomCard());

            // tylko jeśli krupier ma nadal jedną kartę, jeśli w rozdaniu nie zdobył blackjacka to jego druga karta nie może mu go dać
            if((gameModel.croupier.playerHandValue + card.getFirstValue() != 21 && gameModel.croupier.playerHandValue + card.getSecondValue() != 21) && gameModel.croupier.numberOfPlayersCards < 2)
                pickCard(gameModel.croupier, 1, card);
        }
    }

    private void resetGame(){
        gameModel.player.resetPlayer();
        gameModel.croupier.resetPlayer();

        gameView.setGameInfo("");
        gameView.setCurrentBet(gameModel.currentBet);
        gameView.setPlayersHandValue(gameModel.player.playerHandValue);
        gameView.setCroupierHandValue(gameModel.croupier.playerHandValue);
        gameView.clearTable();
    }

    private void editBet(int chipAmmount) {
        if (chipAmmount == 0){
            gameModel.currentBet = 0;
            gameView.setCurrentBet(gameModel.currentBet);
        }

        if(gameModel.availableChips != 0){
            if (gameModel.currentBet + chipAmmount >= gameModel.availableChips || gameModel.currentBet == gameModel.availableChips){
                gameModel.currentBet = gameModel.availableChips;
                gameView.setCurrentBet(gameModel.currentBet);
            }
            else{
                gameModel.currentBet += chipAmmount;
                gameView.setCurrentBet(gameModel.currentBet);
            }
        }
        else
            gameView.setGameInfo("PRZEWALIŁEŚ MAJĄTEK! DODAJ ŻETONY!");
    }

    private void addChips(){
        gameModel.availableChips = gameModel.getStartChips();
        gameView.setBalance(gameModel.getStartChips());
    }

    private void enableChipsStartResetButtons(){
        gameModel.chipAddEnabled = true;
        gameView.startGameBtn.setEnabled(true);
        gameView.resetBetBtn.setEnabled(true);
    }

    private void disableChipsStartResetButtons(){
        gameModel.chipAddEnabled = false;
        gameView.startGameBtn.setEnabled(false);
        gameView.resetBetBtn.setEnabled(false);
    }
    
    private void enableHitStandDoubleButtons(){
        gameView.hitBtn.setEnabled(true);
        gameView.standBtn.setEnabled(true);
        gameView.doubleBtn.setEnabled(true);
    }

    private void disableHitStandDoubleButtons(){
        gameView.hitBtn.setEnabled(false);
        gameView.standBtn.setEnabled(false);
        gameView.doubleBtn.setEnabled(false);
    }
}