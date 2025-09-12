import javax.swing.*;
import java.awt.*;

public class CarDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set background color
        setBackground(Color.WHITE);

        // Draw the body of the car
        g.setColor(Color.RED);
        g.fillRect(100, 150, 200, 50); // Main body
        g.fillRect(150, 100, 100, 60); // Roof

        // Draw the windows
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(160, 110, 30, 30); // Left window
        g.fillRect(210, 110, 30, 30); // Right window

        // Draw wheels
        g.setColor(Color.BLACK);
        g.fillOval(120, 200, 40, 40); // Left wheel
        g.fillOval(240, 200, 40, 40); // Right wheel

        // Draw wheel rims
        g.setColor(Color.WHITE);
        g.fillOval(130, 210, 20, 20); // Left rim
        g.fillOval(250, 210, 20, 20); // Right rim
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Drawing");
        CarDrawing carDrawing = new CarDrawing();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(carDrawing);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
