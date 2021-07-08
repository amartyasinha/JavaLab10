package StudentInfo;

import java.awt.*;
import java.awt.event.*;

public class StudentInfo {
    Frame frameInfo;
    Panel pnl;
    Label nameLbl, courseLbl, rollLbl, collegeLbl;
    TextArea nameTxt, courseTxt, rollTxt, collegeTxt;

    StudentInfo(String name, String course, String roll, String college) {
        frameInfo = new Frame("Student Info");
        pnl = new Panel();

        pnl.setLayout(null);

        nameLbl = new Label("Name: ");
        courseLbl = new Label("Course: ");
        rollLbl = new Label("Roll No.: ");
        collegeLbl = new Label("College: ");

        nameTxt = new TextArea(name);
        courseTxt = new TextArea(course);
        rollTxt = new TextArea(roll);
        collegeTxt = new TextArea(college);

        nameLbl.setBounds(50, 50, 80, 20);
        nameTxt.setBounds(200, 50, 200, 20);
        nameTxt.setEditable(false);

        courseLbl.setBounds(50, 100, 80, 20);
        courseTxt.setBounds(200, 100, 200, 20);
        courseTxt.setEditable(false);

        rollLbl.setBounds(50, 150, 80, 20);
        rollTxt.setBounds(200, 150, 200, 20);
        rollTxt.setEditable(false);

        collegeLbl.setBounds(50, 200, 80, 20);
        collegeTxt.setBounds(200, 200, 200, 20);
        collegeTxt.setEditable(false);

        pnl.add(nameLbl);
        pnl.add(nameTxt);
        pnl.add(courseLbl);
        pnl.add(courseTxt);
        pnl.add(rollLbl);
        pnl.add(rollTxt);
        pnl.add(collegeLbl);
        pnl.add(collegeTxt);

        frameInfo.add(pnl);
        frameInfo.setSize(500, 300);
        frameInfo.setVisible(true);
        frameInfo.setLayout(null);

        frameInfo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frameInfo.dispose();
            }
        });

    }
}
