import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                editBet(0);
            } else if (source == gameView.addChipsBtn && gameModel.availableChips == 0) {
                addChips();
            }
        }
    };
    ActionListener controlsListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source == gameView.startGameBtn){
                if(gameModel.currentBet == 0){
                    gameView.setGameInfo("Postaw zakład aby rozpocząć!");
                }
                else{
                    var card = gameModel.deck.randomCard();
                    gameModel.croupierHandValue += card.getFirstValue();
                    gameView.setCroupierHandValue(gameModel.croupierHandValue);

                    gameView.addCroupierCard(gameModel.numberOfCroupiersCards++, card.getImgUrl());
                }
            } else if(source == gameView.hitBtn){

            } else if (source == gameView.standBtn) {

            } else if (source == gameView.doubleBtn) {

            } else if (source == gameView.settingsBtn) {

            } else if (source == gameView.musicBtn) {

            } else if (source == gameView.statsBtn) {

            }
        }
    };

    private void editBet(int chipValue)
    {
        if (chipValue == 0){
            gameModel.currentBet = 0;
            gameView.setCurrentBet(gameModel.currentBet);
        }
        else if (gameModel.currentBet + chipValue >= gameModel.availableChips || gameModel.currentBet == gameModel.availableChips){
            gameModel.currentBet = gameModel.availableChips;
            gameView.setCurrentBet(gameModel.currentBet);
        }
        else{
            gameModel.currentBet += chipValue;
            gameView.setCurrentBet(gameModel.currentBet);
        }
    }

    private void addChips(){
        gameModel.availableChips = gameModel.getStartChips();
        gameView.setBalance(gameModel.getStartChips());
    }
}
