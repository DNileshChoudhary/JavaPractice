import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="AppletList" width = 700 height =700></applet>
*/
public class AppletList extends Applet implements ActionListener
{
	List langList;
	Button showbtn ; 
	String msg;
	@Override
	public void init()
	{
		langList = new List(5,true);
		langList.add("Java");
		langList.add("Python");
		langList.add("C++");
		langList.add("C");
		langList.add("JavaScript");
		showbtn = new Button("Show Selected");
		add(langList);
		add(showbtn);
		showbtn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String[] selected = langList.getSelectedItems();
		msg = "Selected : ";
		for(String item : selected)
		{
			msg+=item+" ";
		}
		repaint();
	}
	@Override
	public void paint(Graphics g)
	{
		g.drawString(msg,50,200);
	}
}