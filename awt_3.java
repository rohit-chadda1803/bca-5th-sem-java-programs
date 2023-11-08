import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

// awt application that displays multiple buttons with border Layout manager (north,south ,east,west).
class awt_3 extends Frame {
    public awt_3() {
        // Set the layout manager to BorderLayout
        setLayout(new BorderLayout());

        // Create buttons
        Button northButton = new Button("North");
        Button southButton = new Button("South");
        Button eastButton = new Button("East");
        Button westButton = new Button("West");
        Button centerButton = new Button("Center");

        // Add buttons to the frame
        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(centerButton, BorderLayout.CENTER);

        // Set frame properties
        setTitle("awt_3 display multiple buttons");
        setSize(400, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new awt_3();
    }
}
