import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scene extends JPanel implements ActionListener {

    Info Info1;
    Eingabe Eingabe1;
    GoButton GoButton1;
    Ausgabe Ausgabe1;

    public Scene(){
        setPreferredSize(new Dimension(400,700));
        setBackground(new Color(0x000000));

        Info1 = new Info("Zahl eingeben und den Turm klicken");
        add(Info1);

        Eingabe1 = new Eingabe("1234");
        add(Eingabe1);

        GoButton1 = new GoButton();
        add(GoButton1);
        GoButton1.addActionListener(this);

        Ausgabe1 = new Ausgabe("");
        add(Ausgabe1);

    }

    public void actionPerformed(ActionEvent e){
        String s = Eingabe1.getText();
        int zahl = Integer.parseInt(s);
        int faktor = 2;

        for(int i = 0; i < 8; i++){
            zahl = zahl * faktor;
            faktor += 1;
            s += System.lineSeparator() + zahl;
        }

        faktor = 2;

        for(int i = 0; i < 8; i++){
            zahl = zahl / faktor;
            faktor += 1;
            s += System.lineSeparator() + zahl;
        }

        Ausgabe1.setText(s);
        Eingabe1.setText("");
    }
}