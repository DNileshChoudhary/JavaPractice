import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="MyApplet.class" width="300" height="200"></applet>
*/

public class MyApplet extends Applet implements ActionListener,MouseListener
{
	Button button1,button2,button3;
	String msg = "";
	@Override
	public void init()
	{
		setBackground(Color.cyan);
		button1 = new Button("1st Click Me");
		button2 = new Button("Then Click Me");
		button3 = new Button("Click Here To EXIT");
		add(button1);
		add(button2);
		add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		addMouseListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			msg="Button1 Clicked!";
		}
		else if(e.getSource()==button2)
		{
			msg = "Button2 Clicked!";
		}
		else if(e.getSource()==button3)
		{
			msg = "Exiting...";
			stop();
		}
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		msg = "Mouse Clicked At "+e.getX()+','+e.getY();
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent e){
		msg = "Mouse Pressed";
		repaint();
	}
	@Override 
	public void mouseReleased(MouseEvent e){
		msg = "Mouse Released";
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e)
	{
		msg = "Mouse Entered Applet";
		repaint();
	}
	@Override
	public void mouseExited(MouseEvent e)
	{
		msg = "Mouse Exited Applet";
		repaint();
	}
	@Override
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
}