import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "DialogApplet" width = 400 height = 400></applet>
*/
public class DialogApplet extends Applet implements ActionListener
{
	Button bt ;
	Dialog d ;
	@Override
	public void init()
	{
		bt = new Button("Open Dialog");
		bt.addActionListener(this);
		add(bt);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Frame parentF = (Frame)this.getParent().getParent();
		d = new Dialog(parentF,"Applet Dialog",true);
		d.setLayout(new FlowLayout());
		d.setSize(200,100);
		Label lable = new Label("Hello From Dialog!");
		Button bc = new Button("Close Dialog");
		bc.addActionListener(event -> d.setVisible(false));
		d.add(lable);
		d.add(bc);
		d.setVisible(true);
		
	}
}