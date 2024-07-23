package JavaCourse.GUI_Intro_6;

import  javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // GUI = Graphical User Interface
        String name = JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
        JOptionPane.showMessageDialog(null, "Your are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your height"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + " cm tall");

    }
}
