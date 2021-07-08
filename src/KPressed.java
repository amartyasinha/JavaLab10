import java.awt.*;
import java.awt.event.*;

public class KPressed {
    Frame frame;
    Label lbl;

    KPressed() {
        frame = new Frame("Check which key is pressed");
        lbl = new Label("Press any Key");

        lbl.setBounds(120, 150, 200, 30);
        lbl.setAlignment(Label.CENTER);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                lbl.setText("You have typed " + e.getKeyChar());
            }
            public void keyPressed(KeyEvent e) {
                lbl.setText("You have pressed " + e.getKeyChar());
            }
            public void keyReleased(KeyEvent e) {
                lbl.setText("You have released " + e.getKeyChar());
            }
        });
        frame.add(lbl);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new KPressed();
    }
}
