import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "AppletText" width = 500 height = 500></applet>
*/
public class AppletText extends Applet implements ActionListener
{
	TextArea ta ; 
	Button bt;
	String msg = "";
	
	@Override
	public void init()
	{
		ta = new TextArea("Enter your Feedback here...",5,30);
		bt = new Button("See Your Feedback");
		bt.addActionListener(this);
		add(ta);
		add(bt);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		msg = ta.getText();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,10,150);
	}
}