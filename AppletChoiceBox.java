import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "AppletChoiceBox" width = 1000 height = 1000></applet>
*/
public class AppletChoiceBox extends Applet implements ItemListener
{
	Choice languages ;
	String msg = "";
	@Override 
	public void init()
	{	
		languages = new Choice();
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		languages.add("C");
		languages.add("JavaScript");
		add(languages);
		languages.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e )
	{
		msg = "Selected : "+languages.getSelectedItem();
		repaint();
	}
	@Override
	public void paint(Graphics g)
	{
		g.drawString(msg,50,150);
	}
}