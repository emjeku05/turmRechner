import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Ausgabe extends JTextPane {

    public Ausgabe(String st3){
        setText(st3);
        setEditable(false);
        setPreferredSize(new Dimension(200,450));
        setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        setForeground(new Color(0xFFFFFF));
        setBackground(new Color(0x000000));
        setBorder(new LineBorder(new Color(0x000000),0));
    }
}