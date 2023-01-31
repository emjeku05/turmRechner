import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GoButton extends JButton {
    public GoButton(){

        setSize(50,75);
        ImageIcon picture1 = new ImageIcon("pics/turm.png");
        setBorder(new LineBorder(new Color(0x000000), 0));
        setIcon(picture1);
        setPreferredSize(new Dimension(50,75));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setEnabled(true);
    }
}