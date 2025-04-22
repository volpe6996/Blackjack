import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatsController {
    private StatsView statsView;
    private JFrame gameFrame;
    private JFrame statsFrame;


    public StatsController(StatsView statsView, JFrame gameFrame, JFrame statsFrame) {

        this.statsView = statsView;
        this.gameFrame = gameFrame;
        this.statsFrame = statsFrame;

        statsView.goToGameView.addActionListener(goToMenuButtonListener);
    }

    ActionListener goToMenuButtonListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if(source == statsView.goToGameView) {
                gameFrame.setVisible(true);
                statsFrame.setVisible(false);
            }
        }
    };
}
