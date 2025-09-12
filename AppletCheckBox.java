import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "AppletCheckBox" width = 600 height = 600></applet>
*/
public class AppletCheckBox extends Applet implements ItemListener
{
	Checkbox java,python,cpp;
	String msg = "";
	@Override
	public void init()
	{
		java = new Checkbox("Java");
		python = new Checkbox("Python");
		cpp = new Checkbox("C++");
		
		add(java);
		add(python);
		add(cpp);
		
		java.addItemListener(this);
		python.addItemListener(this);
		cpp.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		msg = "Selected : ";
		if(java.getState()) msg+="Java ";
		if(python.getState()) msg+="Python ";
		if(cpp.getState()) msg+="cpp ";
		repaint();
	}
	@Override
	public void paint(Graphics g)
	{
		g.drawString(msg,50,500);
	}
}