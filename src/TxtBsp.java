import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 23.08.2020
 * Time: 12:09
 */
public class TxtBsp extends JFrame implements ActionListener {
    JTextField text, text2;
    JLabel label, label2, error;
    JButton tausch;
    int counter = 0;

    public TxtBsp(String title) {
        super(title);
        text = new JTextField(15);
        label = new JLabel("Geheimwort");
        text2 = new JTextField(15);
        label2 = new JLabel("Staus");
        error = new JLabel("");
        tausch = new JButton("switchen");

        setLayout(new FlowLayout());
        //text2.setEditable(false);
        error.setVisible(false);

        add(label);
        add(text);
        add(label2);
        add(text2);
        add(error);
        add(tausch);

        text.addActionListener(this);
        text2.addActionListener(this);
        tausch.addActionListener(this);
        text.setActionCommand("oben");
        text2.setActionCommand("unten");
        tausch.setActionCommand("tausch");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        textCopy(e);
        repaint();
    }

    public void textCopy(ActionEvent e) {
        error.setVisible(false);
        switch (e.getActionCommand()) {
            case "oben":
                if (Math.round(Math.random()) == 1) {
                    text2.setText("Wort ist gültig");
                    counter = 0;
                    text.setEditable(false);
                } else {
                    text2.setText("Wort ist ungültig");
                    counter++;
                    if (counter == 3) {
                        System.exit(0);
                    }
                }
                break;
            case "unten":
                error.setVisible(true);
                error.setText("Geben Sie Text im oberen Feld ein!");
                text.setText(text2.getText());
                repaint();
                break;
            case "tausch":
                String copy;
                copy = text.getText();
                text.setText(text2.getText());
                text2.setText(copy);
                break;
        }
    }
}
