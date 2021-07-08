package StudentInfo;

import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
    Frame frame;
    Panel pnl;
    Label aLbl, bLbl;
    Button a, b;

    Main() {
        frame = new Frame("Select an Option");
        pnl = new Panel();
        pnl.setLayout(null);

        a = new Button("A");
        b = new Button("B");
        aLbl = new Label("Your Personal Info: ");
        bLbl = new Label("Your CGPA: ");

        aLbl.setBounds(30, 100, 200, 20);
        a.setBounds(250,100, 50, 20);

        bLbl.setBounds(30, 150, 200, 20);
        b.setBounds(250,150, 50, 20);

        a.addActionListener(this);
        b.addActionListener(this);

        pnl.add(b);
        pnl.add(bLbl);
        pnl.add(a);
        pnl.add(aLbl);

        frame.add(pnl);
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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a)
            new StudentInfo("Amartya Sinha", "B.Sc. (Hons) C.S", "AC-1207", "Acharya Narendra Dev College");
        else
            new CGPA("9");
    }

    public static void main(String[] args) {
        new Main();
    }
}
