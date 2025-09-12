import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "AppletScrollbar" width = 500 height = 500></applet>
*/
public class AppletScrollbar extends Applet implements AdjustmentListener
{
	Scrollbar sb ;
	int value = 0;
	
	@Override
	public void init()
	{
		sb = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
		sb.addAdjustmentListener(this);
		add(sb);
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		value = sb.getValue();
		repaint();
	}
	@Override
	public void paint(Graphics g)
	{
		g.drawString("Current Value : "+value,30,100);
	}
}