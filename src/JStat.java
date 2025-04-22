import javax.swing.*;
import java.awt.*;

public class JStat extends JLabel {
    public JStat(String text){
        super(text);
        this.setFont(new Font("Arial", Font.BOLD, 32));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setForeground(Color.BLACK);
    }
}
