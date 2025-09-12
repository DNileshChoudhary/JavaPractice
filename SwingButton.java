import javax.swing.*;
import java.awt.event.*;
public class SwingButton
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("JButton Demo");
		JButton button = new JButton("Click Me");
		JLabel label = new JLabel("Waiting for Click...");
		button.setBounds(100,100,100,40);
		label.setBounds(100,150,200,30);
		button.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){label.setText("Button Clicked!");}});
		frame.add(button);
		frame.add(label);
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}