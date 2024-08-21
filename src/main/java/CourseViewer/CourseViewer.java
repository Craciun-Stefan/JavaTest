package CourseViewer;

import Inheritance.Module1;
import Inheritance.Module2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CourseViewer {

    public static void main(String[] args) {
        // 1. Create the GUI Frame
        // ===============
        //Using Classes & Objects
        // And Methods

        JFrame frame = new JFrame( "Couse Information");// window-ul principal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        //Create the main desktop pane to hold internal frames
        JDesktopPane desktop = new JDesktopPane();

        //2. Implement buttons
        JButton showCourseButton = new JButton("Show Course Info");
        JButton showStudentsButton = new JButton( "Display Students");

        // Inheritance
        Module1 module1 = new Module1();
        Module2 module2 = new Module2();
        //polymorphism
        showCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame courseFrame = createInternalFrame1("Modules Info: ", module1, module2);
                desktop.add(courseFrame);

            }

        });
        //Collections

        showStudentsButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                StringBuilder entriesText = new StringBuilder("Students: \n");

                ArrayList<String> studentList = new ArrayList<>();
                studentList.add("Alexx");
                studentList.add("Mje e");
                studentList.add("Pablito S");

                for (String entry : studentList) {
                    entriesText.append(entry).append("\n");
                }
                JOptionPane.showMessageDialog(null, entriesText.toString(), "Entries", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(showCourseButton); //add the first button to the panel
        buttonsPanel.add(showStudentsButton);//add the 2nd button to the panel

        frame.add(buttonsPanel, BorderLayout.SOUTH);
        frame.add(desktop, BorderLayout.CENTER); //1.
        frame.setVisible(true); //1.


    }
//metoda custom
    private static JInternalFrame createInternalFrame1(String title, Module1 content1, Module2 content2){

        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(200, 150);
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(255,255,255)); //rgb generator online
        JLabel nameLabel1 = new JLabel("Module Name: " + content1.subject);
        JLabel durationLabel1 = new JLabel("Module Duration: " + content1.duration);
        JLabel locationLabel1 = new JLabel("Module Duration: " + content1.location);

        panel1.add(nameLabel1);
        panel1.add(durationLabel1);
        panel1.add(locationLabel1);

        JLabel nameLabel2 = new JLabel("Module Name: " + content2.subject);
        JLabel durationLabel2 = new JLabel("Module Duration: " + content2.duration);
        JLabel locationLabel2 = new JLabel("Module Duration: " + content2.location);

        panel1.add(nameLabel2);
        panel1.add(durationLabel2);
        panel1.add(locationLabel2);

        internalFrame.add(panel1);
        internalFrame.setVisible(true);

        return internalFrame;

        //de implementat informatiile pentru modulul 2 pe acelasi sistem
    }
}
