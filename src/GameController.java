import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {
    private GameView gameView;
    private GameModel gameModel;

    public GameController(GameView gameView, GameModel gameModel) {
        this.gameView = gameView;
        this.gameModel = gameModel;

        gameView.setBalance(gameModel.availableChips);

        gameView.chip5.addActionListener(chipListener);
        gameView.chip10.addActionListener(chipListener);
        gameView.chip25.addActionListener(chipListener);
        gameView.chip50.addActionListener(chipListener);
        gameView.chip100.addActionListener(chipListener);
        gameView.chip250.addActionListener(chipListener);
        gameView.chip500.addActionListener(chipListener);
        gameView.chip1000.addActionListener(chipListener);
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
            }
        }
    };

    private void editBet(int chipValue)
    {
        if (gameModel.currentBet + chipValue >= gameModel.availableChips || gameModel.currentBet == gameModel.availableChips){
            gameModel.currentBet = gameModel.availableChips;
            gameView.setCurrentBet(gameModel.currentBet);
        }
        else{
            gameModel.currentBet += chipValue;
            gameView.setCurrentBet(gameModel.currentBet);
        }
    }
}
