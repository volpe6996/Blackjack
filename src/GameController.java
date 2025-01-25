import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameController {
    private GameView gameView;
    private GameModel gameModel;

    public GameController(GameView gameView, GameModel gameModel) {
        this.gameView = gameView;
        this.gameModel = gameModel;

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
                pickCard(gameModel.player, 0, gameModel.deck.randomCard());
                gameView.doubleBtn.setEnabled(false);
                if(determineWinners()){
                    disableHitStandDoubleButtons();
                    enableChipsStartResetButtons();
                }
            }
            else if (source == gameView.standBtn){
                disableHitStandDoubleButtons();

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

            }
        }
    };

    private boolean determineWinners() {
        var isEndGame = false;

        if (gameModel.player.playerHandValue == 21 ||
                (gameModel.croupier.playerHandValue >= 17 && gameModel.croupier.playerHandValue < gameModel.player.playerHandValue) ||
                (gameModel.croupier.playerHandValue >= 17 && gameModel.croupier.playerHandValue > gameModel.player.playerHandValue && gameModel.croupier.playerHandValue > 21)) {

            gameView.setGameInfo(gameModel.player.playerHandValue == 21
                    ? "BLACKJACK! WYGRAŁEŚ: " + (int)(1.5 * gameModel.currentBet)
                    : (gameModel.croupier.playerHandValue > 21
                    ? "KRUPIER PRZESADZIŁ! WYGRAŁEŚ: " + gameModel.currentBet
                    : "KRUPIER NIE DAŁ RADY! WYGRAŁEŚ: " + gameModel.currentBet));

            gameModel.availableChips += gameModel.player.playerHandValue == 21
                    ? (int)(1.5 * gameModel.currentBet)
                    : gameModel.currentBet;

            gameView.setBalance(gameModel.availableChips);
            isEndGame = true;
        }

        if (gameModel.croupier.playerHandValue == 21 ||
                gameModel.player.playerHandValue > 21 ||
                (gameModel.croupier.playerHandValue >= 17 && gameModel.croupier.playerHandValue > gameModel.player.playerHandValue && gameModel.croupier.playerHandValue <= 21)) {

            gameView.setGameInfo(gameModel.croupier.playerHandValue == 21
                    ? "BLACKJACK KRUPIERA! PRZEGRAŁEŚ: " + gameModel.currentBet
                    : (gameModel.player.playerHandValue > 21
                    ? "PRZESADZIŁEŚ! PRZEGRAŁEŚ: " + gameModel.currentBet
                    : "KRUPIER WYGRYWA! PRZEGRAŁEŚ: " + gameModel.currentBet));

            if (gameModel.availableChips - gameModel.currentBet < 0) {
                gameModel.availableChips = 0;
            } else {
                gameModel.availableChips -= gameModel.currentBet;
            }

            gameView.setBalance(gameModel.availableChips);
            isEndGame = true;
        }

        if (gameModel.croupier.playerHandValue >= 17 &&
                gameModel.croupier.playerHandValue == gameModel.player.playerHandValue) {

            gameView.setGameInfo("LEPSZY REMIS NIŻ W .....");
            isEndGame = true;
        }

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