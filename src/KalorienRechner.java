import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 23.08.2020
 * Time: 13:53
 */
public class KalorienRechner extends JFrame implements ActionListener, FocusListener {
    JLabel lKopfzeile, lEingabeFett, lEingabeKalorien, lAusgabe, lOk;
    JTextField tfEingabeFett, tfEingabeKalorien, tfAusgabe;
    JButton btBerechne;
    double fett, kalo;

    public KalorienRechner(String title){
        super(title);
        lKopfzeile = new JLabel("Prozent der Kalorein aus Fett");
        lEingabeFett = new JLabel("Enter grams of fat: ");
        lEingabeKalorien = new JLabel("Enter total calories: ");
        lAusgabe = new JLabel("Percent calories fro fat: ");
        btBerechne = new JButton("Do it!");
        tfEingabeFett = new JTextField(10);
        tfEingabeKalorien = new JTextField(10);
        tfAusgabe = new JTextField(10);
        lOk = new JLabel("");

        setLayout(new FlowLayout());
        add(lKopfzeile);
        add(lEingabeFett);
        add(tfEingabeFett);
        add(lEingabeKalorien);
        add(tfEingabeKalorien);
        add(lAusgabe);
        add(tfAusgabe);
        add(btBerechne);
        add(lOk);

        tfAusgabe.setEditable(false);
        tfEingabeFett.addActionListener(this);
        tfEingabeFett.addFocusListener(this);
        tfEingabeFett.setActionCommand("1");
        tfEingabeFett.setActionCommand("fett");
        tfEingabeKalorien.addActionListener(this);
        tfEingabeKalorien.addFocusListener(this);
        tfEingabeKalorien.setActionCommand("kal");
        btBerechne.addActionListener(this);
        btBerechne.setActionCommand("doIt");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "doIt" -> {
                try {
                    fett = Integer.parseInt(tfEingabeFett.getText());
                }
                catch (Exception exception){
                    tfEingabeFett.setText("Nochmal");
                }
                try {
                    kalo = Integer.parseInt(tfEingabeKalorien.getText());
                }
                catch(Exception exception){
                    tfEingabeKalorien.setText("Nochmal");
                }
                tfAusgabe.setText(Math.round(berechnePercent(fett, kalo)) + "");
                if((Math.round(berechnePercent(fett, kalo)) >= 30)){
                    lOk.setText("Zu viele Fettkalorien!");
                }
                else lOk.setText("Fettanteil OK");
                repaint();
            }
        }
        repaint();
    }

    public double berechnePercent(double fett, double kalo){
        return ((fett*9)/kalo)*100;
    }

    @Override
    public void focusGained(FocusEvent e) {
        tfEingabeFett.selectAll();
        tfEingabeKalorien.selectAll();
        repaint();
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
