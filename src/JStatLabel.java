import javax.swing.*;
import java.awt.*;

public class JStatLabel extends JLabel {
    public JStatLabel(String text){
        super(text);
        this.setFont(new Font("Arial", Font.BOLD, 18));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setForeground(Color.BLACK);
        this.setBorder(BorderFactory.createLineBorder(new Color(255, 201 ,14), 4));
    }
}
