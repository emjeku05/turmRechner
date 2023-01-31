import javax.swing.*;
import java.awt.*;

public class Stage extends JFrame {
    public Stage(){
        Scene scene1 = new Scene();
        setSize(400,700);
        setTitle("Turm Rechner");
        setDefaultCloseOperation(3);
        add(scene1);
        setVisible(true);
    }
}