import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 22.08.2020
 * Time: 14:16
 */
public class Zahlenschloss extends JFrame implements ActionListener {
    JButton vergroessern, verkleinern;
    Integer breite = 600;
    Integer hoehe = 100;
    Random zufallszahl = new Random();
    String code = "";
    JButton[] buttons = new JButton[10];
    int counter = 0;

    Zahlenschloss(String title) {
        super(title);
        //3stelligen code erzeugen
        for (int i = 0; i < 3; i++) {
            code += String.valueOf(zufallszahl.nextInt(10));
        }

        setLayout(new FlowLayout());
        //erstelle Buttons 0-9
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            add(buttons[i]);
            buttons[i].addActionListener(this);
            buttons[i].setActionCommand(String.valueOf(i));
        }

        vergroessern = new JButton("Vergößern");
        verkleinern = new JButton("Verkleinern");
        add(vergroessern);
        add(verkleinern);
        vergroessern.addActionListener(this);
        verkleinern.addActionListener(this);
        vergroessern.setActionCommand("plus");
        verkleinern.setActionCommand("minus");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
    }

    @Override
    public void actionPerformed(ActionEvent e ) {
        switch (e.getActionCommand()) {
            case "plus" -> {
                breite = (int) (breite * 1.1);
                hoehe = (int) (hoehe * 1.1);
                setSize((int) (breite), (int) (hoehe));
                this.repaint();
                break;
            }
            case "minus" -> {
                breite = (int) (breite * 0.9);
                hoehe = (int) (hoehe * 0.9);
                setSize((int) (breite), (int) (hoehe));
                this.repaint();
                break;
            }
            case "0" -> {
                vergleichen(e);
                break;
            }
            case "1" -> {
                vergleichen(e);
                break;
            }
            case "2" -> {
                vergleichen(e);
                break;
            }
            case "3" -> {
                vergleichen(e);
                break;
            }
            case "4" -> {
                vergleichen(e);
                break;
            }
            case "5" -> {
                vergleichen(e);
                break;
            }
            case "6" -> {
                vergleichen(e);
                break;
            }
            case "7" -> {
                vergleichen(e);
                break;
            }
            case "8" -> {
                vergleichen(e);
                break;
            }
            case "9" -> {
                vergleichen(e);
                break;
            }
        }
    }

    public void vergleichen(ActionEvent e) {
        //code an der position counter wird mit ausgelösten Button verglichen
        if (code.charAt(counter) == e.getActionCommand().charAt(0)) {
            buttons[Integer.parseInt(e.getActionCommand())].setBackground(Color.green);
            counter++;
            if (counter == 3) {
                System.exit(0);
            }
        } else {
            counter = 0;
            for (JButton button : buttons) {
                button.setBackground(Color.red);
            }
        }
    }
}

