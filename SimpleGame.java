import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGame extends JPanel implements KeyListener, ActionListener {
    
    // Player attributes
    private int playerX = 50;
    private int playerY = 50;
    private int playerSpeed = 5;
    
    // Timer for game loop
    private Timer gameTimer;

    public SimpleGame() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        addKeyListener(this);
        setFocusable(true);
        
        // Timer for updating game state and repainting
        gameTimer = new Timer(16, this); // ~60 FPS
        gameTimer.start();
    }

    // Game loop (for updating the game state)
    @Override
    public void actionPerformed(ActionEvent e) {
        // You can add game logic here, like player movement, collision detection, etc.
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw the player (as a simple rectangle)
        g.setColor(Color.RED);
        g.fillRect(playerX, playerY, 50, 50);
        
        // Draw other game objects or backgrounds here
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        
        // Handle movement with arrow keys
        if (keyCode == KeyEvent.VK_LEFT) {
            playerX -= playerSpeed;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            playerX += playerSpeed;
        } else if (keyCode == KeyEvent.VK_UP) {
            playerY -= playerSpeed;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            playerY += playerSpeed;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Optional: Handle key release events if needed
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Optional: Handle key typed events if needed
    }

    public static void main(String[] args) {
        // Create the window
        JFrame frame = new JFrame("Simple Free Fire Game");
        SimpleGame game = new SimpleGame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
        frame.pack();
        frame.setVisible(true);
    }
}
