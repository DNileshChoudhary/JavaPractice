import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "MyApplet2" width = 200 height = 200></applet>
*/
public class MyApplet2 extends Applet implements ItemListener
{
	Checkbox cb1,cb2;
	String msg = "";
	
	@Override 
	public void init()
	{
		cb1 = new Checkbox("Java");
		cb2 = new Checkbox("Python");
		
		add(cb1);
		add(cb2);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		msg = "Selected : ";
		if(cb1.getState())  msg+="Java ";
		if(cb2.getState())  msg+=" Python";
		repaint();
	}
	@Override
	public void paint(Graphics g)
	{
		g.drawString(msg,20,150);	
	}
}