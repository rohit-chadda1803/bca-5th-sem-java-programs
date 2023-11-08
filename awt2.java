import java.awt.*;
import javax.swing.*;

// this is to create simple Awt application that displays a button with custom layout.

public class awt2 extends JFrame {
    public awt2() {
        // Set the layout manager
        setLayout(new FlowLayout());

        // Create a button
        JButton button = new JButton("Click Me!");

        // Add the button to the frame
        add(button);

        // Set frame properties
        setTitle("Custom Layout Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the custom layout example
        new awt2();
    }
}
