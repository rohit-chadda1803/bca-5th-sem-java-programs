import java.awt.*;
import java.awt.event.*;

// this is a simple awt code that display button with custom flow layout manager.

public class awt_1 {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT_1 with FlowLAYOUTButton ");

        // Create a Button
        Button button = new Button("Click Me");

        // Set the layout manager
        frame.setLayout(new FlowLayout());

        // Add the button to the frame
        frame.add(button);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });

        // Add a window listener to handle closing the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
