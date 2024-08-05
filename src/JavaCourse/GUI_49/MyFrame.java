package JavaCourse.GUI_49;

import javax.swing.*;
import java.awt.*;

// child class of JFrame
public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("JFrame tile goes here"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent frame from being resized
        this.setSize(420,420); // sets the x-dimensions and y-dimensions
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("src/JavaCourse/GUI_49/snake.png"); // creates image icon
        this.setIconImage(image.getImage()); // change icon of JFrame
        this.getContentPane().setBackground(new Color(52, 0, 186)); // change color of background
    }

}
