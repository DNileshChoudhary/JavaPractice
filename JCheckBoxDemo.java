import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JCheckBoxDemo
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("JCheckBox Demo");
		JCheckBox j1 = new JCheckBox("Java");
		JCheckBox j2 = new JCheckBox("Python");
		JCheckBox j3 = new JCheckBox("C++");
		
		j1.setBounds(100,50,100,30);
		j2.setBounds(100,80,100,30);
		j3.setBounds(100,110,100,30);
		
		JButton button = new JButton("Submit");
		button.setBounds(100,160,100,30);
		
		JLabel label = new JLabel();
		label.setBounds(100,200,100,30);
		
		button.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			String msg = "";
			if(j1.isSelected()) msg +="Java ";
			if(j2.isSelected()) msg +="Python ";
			if(j3.isSelected()) msg+="C++ ";
			label.setText("Selected : "+msg);
		}});
		frame.add(j1);
		frame.add(j2);
		frame.add(j3);
		frame.add(button);
		frame.add(label);
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}