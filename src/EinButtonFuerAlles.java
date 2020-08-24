import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 22.08.2020
 * Time: 13:13
 */
public class EinButtonFuerAlles extends JFrame implements ActionListener {
    JButton button;

    EinButtonFuerAlles (String title){
        super(title);
        button = new JButton("switch Color");
        setLayout(new FlowLayout());
        add(button);
        button.addActionListener(this);
        button.setActionCommand("switch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (getContentPane().getBackground() == Color.red) {
            getContentPane().setBackground(Color.green);
        } else if (getContentPane().getBackground() == Color.green) {
            getContentPane().setBackground(Color.blue);
        } else if (getContentPane().getBackground() == Color.blue) {
            getContentPane().setBackground(Color.gray);
        } else if (getContentPane().getBackground() == Color.gray) {
            getContentPane().setBackground(Color.red);
        }
        else getContentPane().setBackground(Color.blue);
    }
}
