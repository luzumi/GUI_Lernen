import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 23.08.2020
 * Time: 13:23
 */
public class TemperatureCalculator extends JFrame implements ActionListener {
    int celsius, fahrenheit;
    JButton bSwitch, bDelete;
    JLabel lCelsius, lFahrenheit, jHeadline;
    JTextField tfFahrenheit, tfCelsius;

    public TemperatureCalculator(String title) {
        super(title);
        tfFahrenheit = new JTextField(6);
        tfCelsius = new JTextField(6);
        lCelsius = new JLabel("Celsius");
        lFahrenheit = new JLabel("Fahrenheit");
        jHeadline = new JLabel("Convert Fahrenheit to Celsius");
        bSwitch = new JButton("to Celsius");
        bDelete = new JButton("Delete Entry");

        setLayout(new FlowLayout());
        add(bSwitch);
        add(jHeadline);
        add(lFahrenheit);
        add(tfFahrenheit);
        add(lCelsius);
        add(tfCelsius);
        add(bDelete);
        tfCelsius.setEditable(false);

        bSwitch.addActionListener(this);
        bSwitch.setActionCommand("switch");
        tfFahrenheit.addActionListener(this);
        tfFahrenheit.setActionCommand("fh");
        tfCelsius.addActionListener(this);
        tfCelsius.setActionCommand("cel");
        bDelete.addActionListener(this);
        bDelete.setActionCommand("del");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public int convert(int f) {
        return ((f - 32) * 5) / 9;
    }

    public int reconvert(int c) {
        return c * 9 / 5 + 32;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "fh" -> {
                try {
                    celsius = Integer.parseInt(tfFahrenheit.getText());
                    tfCelsius.setText(convert(fahrenheit) + "");
                } catch (Exception exception) {
                    tfCelsius.setText("Again");
                }
                repaint();
            }
            case "cel" -> {
                try {
                    fahrenheit = Integer.parseInt(tfCelsius.getText());
                    tfFahrenheit.setText(reconvert(celsius) + "");
                } catch (Exception exception) {
                    tfFahrenheit.setText("Again");
                }
                repaint();
            }
            case "switch" -> {
                if (!tfCelsius.isEditable()) {
                    jHeadline.setText("Convert Celsius to Fahrenheit");
                    bSwitch.setText("Celsius to Fahrenheit");
                    tfFahrenheit.setEditable(false);
                    tfCelsius.setEditable(true);
                } else {
                    jHeadline.setText("Convert Fahrenheit to Celsius");
                    bSwitch.setText("Fahrenheit to Celsius");
                    tfFahrenheit.setEditable(true);
                    tfCelsius.setEditable(false);
                }
                repaint();
            }
            case "del" -> {
                tfFahrenheit.setText("");
                tfCelsius.setText("");
                repaint();
            }
        }
    }
}
