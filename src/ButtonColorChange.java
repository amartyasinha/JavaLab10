import java.awt.*;
import java.awt.event.*;

public class ButtonColorChange extends Frame implements ActionListener {
    Button redButton, blueButton;

    ButtonColorChange() {
        super("Button Color Change");
        redButton = new Button("RED");
        redButton.setBounds(120, 120, 150, 20);
        redButton.setBackground(Color.RED);
        redButton.addActionListener(this);
        add(redButton);

        blueButton = new Button("BLUE");
        blueButton.setBounds(120, 180, 150, 20);
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        add(blueButton);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == redButton)
            this.setBackground(Color.RED);
        if (ae.getSource() == blueButton)
            this.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new ButtonColorChange();
    }
}
