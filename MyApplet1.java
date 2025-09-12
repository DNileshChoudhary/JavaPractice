import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="MyApplet1" width = "400" height = "200"></applet>
*/

public class MyApplet1 extends Applet implements ActionListener
{
	TextField namef,agef,passf ;
	Button bt ;
	String msg = "";
	@Override
	public void init()
	{
		namef = new TextField(20);
		agef = new TextField(5);
		passf = new TextField(6);
		passf.setEchoChar('*');
		bt = new Button("Submit");
		add(new Label("Enter your NAME : "));
		add(namef);
		add(new Label("Enter your AGE : "));
		add(agef);
		add(new Label("Enter PASSWORD : "));
		add(passf);
		add(bt);
		bt.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String name = namef.getText();
		String ageStr = agef.getText();
		String pass = passf.getText();
		try
		{
			int age = Integer.parseInt(ageStr);
			msg = "Name : "+name +", Age : "+age+", Password : "+pass;
		}
		catch(NumberFormatException ex)
		{
			msg = "Invalid Age , please Enter a VALID AGE";
		}
		repaint();
	}
	public void paint(Graphics g )
	{
		
		g.drawString("You Entered : "+msg,20,150);
	}
}