import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 21.08.2020
 * Time: 14:06
 */
public class ButtonFrame extends JFrame  implements ActionListener {
    JButton bChange, bChange2, bChange3, bChange4;

    ButtonFrame(String title){
        super(title);

        bChange = new JButton("Rot");
        bChange2 = new JButton("Grün");
        bChange3 = new JButton("Blau");
        bChange4 = new JButton("Grau");

        setLayout(new FlowLayout());
        add(bChange);
        add(bChange2);
        add(bChange3);
        add(bChange4);

        bChange.addActionListener(this);
        bChange2.addActionListener(this);
        bChange3.addActionListener(this);
        bChange4.addActionListener(this);

        bChange.setActionCommand("rot");
        bChange2.setActionCommand("gruen");
        bChange3.setActionCommand("blau");
        bChange4.setActionCommand("grau");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getActionCommand().equals("rot")) {
            bChange.setText("geklickt");
            bChange2.setText("Grün");
            bChange3.setText("Blau");
            bChange4.setText("Grau");
            getContentPane().setBackground( Color.red );
        }
        else if( e.getActionCommand().equals("gruen")) {
            bChange.setText("Rot");
            bChange2.setText("geklickt");
            bChange3.setText("Blau");
            bChange4.setText("Grau");
            getContentPane().setBackground( Color.green );
        }
        else if( e.getActionCommand().equals("blau")) {
            bChange.setText("Rot");
            bChange2.setText("Grün");
            bChange3.setText("geklickt");
            bChange4.setText("Grau");
            getContentPane().setBackground( Color.blue );
        }
        else if( e.getActionCommand().equals("grau")) {
            bChange.setText("Rot");
            bChange2.setText("Grün");
            bChange3.setText("Blau");
            bChange4.setText("geklickt");
            getContentPane().setBackground( Color.gray );
        }

        repaint();
    }
}
