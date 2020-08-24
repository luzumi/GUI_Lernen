import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 22.08.2020
 * Time: 13:33
 */
public class DreiAusEinButton extends JFrame  implements ActionListener {
    JButton trueButton;
    JButton trueButton1;
    JButton trueButton2;

    DreiAusEinButton(String title){
        super(title);

        trueButton = new JButton("try me");
        trueButton1 = new JButton("try me");
        trueButton2 = new JButton("try me");
        setLayout(new FlowLayout());
        add(trueButton);
        add(trueButton1);
        add(trueButton2);

        trueButton.addActionListener(this);
        trueButton1.addActionListener(this);
        trueButton2.addActionListener(this);

        trueButton.setActionCommand("1");
        trueButton1.setActionCommand("2");
        trueButton2.setActionCommand("3");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(Math.round(Math.random()) == 1){
            if(e.getActionCommand().equals("1")){
                trueButton.setText("Treffer");
                trueButton1.setText("gewonnen");
                trueButton2.setText("gewonnen");
                trueButton.setBackground(Color.green);
                trueButton1.setBackground(Color.gray);
                trueButton2.setBackground(Color.gray);
            }
            else if(e.getActionCommand().equals("2")){
                trueButton.setText("gewonnen");
                trueButton1.setText("Treffer");
                trueButton2.setText("gewonnen");
                trueButton.setBackground(Color.gray);
                trueButton1.setBackground(Color.green);
                trueButton2.setBackground(Color.gray);
            }
            else if(e.getActionCommand().equals("3")){
                trueButton.setText("gewonnen");
                trueButton1.setText("gewonnen");
                trueButton2.setText("Treffer");
                trueButton.setBackground(Color.green);
                trueButton1.setBackground(Color.green);
                trueButton2.setBackground(Color.green);
            }
        }
        else if(Math.round(Math.random()) == 1) {
            switch (e.getActionCommand()) {
                case "1" -> {
                    trueButton.setText("verloren");
                    trueButton1.setText("verloren");
                    trueButton2.setText("verloren");
                    trueButton.setBackground(Color.red);
                    trueButton1.setBackground(Color.gray);
                    trueButton2.setBackground(Color.gray);
                }
                case "2" -> {
                    trueButton.setBackground(Color.gray);
                    trueButton1.setBackground(Color.red);
                    trueButton2.setBackground(Color.gray);
                    trueButton.setText("verloren");
                    trueButton1.setText("verloren");
                    trueButton2.setText("verloren");
                }
                case "3" -> {
                    trueButton.setBackground(Color.gray);
                    trueButton1.setBackground(Color.gray);
                    trueButton2.setBackground(Color.red);
                    trueButton.setText("verloren");
                    trueButton1.setText("verloren");
                    trueButton2.setText("verloren");
                }
            }
        }
        else System.exit(0);
    }
}
