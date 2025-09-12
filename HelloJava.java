import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame frame = new Frame("AWT Example");

        // Create a button and add an event listener to it
        Button button = new Button("Click Me!");
        button.setBounds(50, 100, 100, 50);  // Set position and size

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set frame size and layout, then make it visible
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        
        // Close operation for the window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}






