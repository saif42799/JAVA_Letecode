package JavaCourse.labels_50;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Jlabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("src/JavaCourse/labels_50/snake.png");
        Border border = BorderFactory.createLineBorder(new Color(64, 0, 114), 3);

        JLabel label = new JLabel(); // create label
        label.setText("Bro, do you even code?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // sets text top, center, bottom of imageIcon
        label.setForeground(new Color(164, 0, 0)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); // set font of text
        label.setIconTextGap(10); // set gap of text to image
        label.setBackground(new Color(114, 114, 114)); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
//        label.setBounds(0,0,250,250); // this will set x and y position as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
