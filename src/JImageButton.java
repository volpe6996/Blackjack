import javax.swing.*;
import java.awt.*;

public class JImageButton extends JButton {
    public JImageButton(String imgUrl, int width, int height) {
        this.setIcon(new ImageIcon(new ImageIcon(imgUrl).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        this.setFocusPainted(false);
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    public void setFont(int size) {
        this.setFont(new Font("Arial", Font.BOLD, size));
    }
}
