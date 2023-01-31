import javax.swing.*;
        import javax.swing.border.LineBorder;
        import java.awt.*;

public class Eingabe extends JTextField {

    public Eingabe(String st2){
        setText(st2);
        setHorizontalAlignment(JLabel.CENTER);
        setPreferredSize(new Dimension(150,75));
        setBorder(new LineBorder(new Color(0x00FF00),4));
        setFont(new Font(Font.SANS_SERIF,Font.BOLD,40));
    }
}