import javax.swing.*;
import java.awt.*;

public class JCard extends JLabel {
    public JCard(String url) {
        this.setIcon(new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(140, 200, Image.SCALE_SMOOTH)));
    }

    public void setImage(String url) {
        this.setIcon(new ImageIcon(new ImageIcon(url).getImage().getScaledInstance(140, 200, Image.SCALE_SMOOTH)));
    }
}
