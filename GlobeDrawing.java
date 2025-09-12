import javax.swing.*;
import java.awt.*;

public class GlobeDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set background color
        setBackground(Color.BLACK);

        // Draw globe (circle)
        int diameter = 200;
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;
        g.setColor(Color.BLUE);
        g.fillOval(x, y, diameter, diameter);
        
        // Draw latitude and longitude lines
        g.setColor(Color.WHITE);
        int centerX = x + diameter / 2;
        int centerY = y + diameter / 2;

        // Draw latitude lines
        for (int i = -90; i <= 90; i += 30) {
            int yLine = centerY + (int)(diameter / 2 * Math.sin(Math.toRadians(i)));
            g.drawLine(x, yLine, x + diameter, yLine);
        }

        // Draw longitude lines
        for (int i = -180; i < 180; i += 30) {
            int xLine = centerX + (int)(diameter / 2 * Math.cos(Math.toRadians(i)));
            g.drawLine(xLine, y, xLine, y + diameter);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Globe Drawing");
        GlobeDrawing globeDrawing = new GlobeDrawing();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(globeDrawing);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
