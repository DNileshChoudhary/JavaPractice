import java.applet.*;
import java.awt.*;
/*
<applet code = "MyCanvas" width = 500 height = 500></applet>
*/

public class MyCanvas extends Applet 
{
	@Override
	public void init()
	{
		CanvasDemo c = new CanvasDemo();
		c.setSize(300,300);
		c.setBackground(Color.lightGray);
		add(c);
	}
}

class CanvasDemo extends Canvas
{
	public void paint(Graphics g)
	{
		 g.setColor(Color.blue);
        g.drawLine(20, 20, 100, 20);

        g.setColor(Color.red);
        g.drawRect(20, 40, 80, 30);

        g.setColor(Color.green);
        g.fillRect(20, 80, 80, 30);

        g.setColor(Color.orange);
        g.drawOval(20, 130, 80, 40);

        g.setColor(Color.magenta);
        g.fillOval(120, 130, 80, 40);

        g.setColor(Color.black);
        g.drawString("Canvas Drawing", 20, 200);
	}
}