import java.awt.*;
import java.awt.event.*;

public class PinkBackground extends Frame {
    Label lbl;
    PinkBackground() {
        lbl = new Label("Pink");

        lbl.setBounds(100, 150, 200, 25);
        lbl.setAlignment(Label.CENTER);

        add(lbl);
        setBackground(Color.PINK);
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

    public static void main(String[] args) {
        new PinkBackground();
    }
}
