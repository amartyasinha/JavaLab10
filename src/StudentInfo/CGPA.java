package StudentInfo;

import java.awt.*;
import java.awt.event.*;

public class CGPA {
    Frame frameCGPA;
    Panel pnl;
    Label cgpaLbl;
    TextArea cgpaTxt;

    CGPA(String cgpa) {
        frameCGPA = new Frame("CGPA");
        pnl = new Panel();
        pnl.setLayout(null);

        cgpaLbl = new Label("Your CGPA is: ");
        cgpaTxt = new TextArea(cgpa);

        cgpaLbl.setBounds(50, 50, 80, 20);
        cgpaTxt.setBounds(150, 50, 100, 20);
        cgpaTxt.setEditable(false);

        pnl.add(cgpaLbl);
        pnl.add(cgpaTxt);

        frameCGPA.add(pnl);
        frameCGPA.setSize(300, 200);
        frameCGPA.setVisible(true);
        frameCGPA.setLayout(null);

        frameCGPA.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frameCGPA.dispose();
            }
        });
    }
}
