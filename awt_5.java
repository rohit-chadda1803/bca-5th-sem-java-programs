import java.awt.*;
import javax.swing.*;

// this is a awt application that displays a textfield with custom layout.

public class awt_5 extends JFrame {
    public awt_5() {
        setTitle(" awt_5 Custom Layout with text field");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        JTextField textField = new JTextField(20);
        add(textField);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new awt_5();
    }
}
