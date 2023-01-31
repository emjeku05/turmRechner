import javax.swing.*;
import java.awt.*;

public class Info extends JLabel {

    public Info(String st1){
        setText(st1);
        setHorizontalAlignment(JLabel.CENTER);
        setPreferredSize(new Dimension(400,60));
        setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        setForeground(new Color(0x00FF00));
    }
}