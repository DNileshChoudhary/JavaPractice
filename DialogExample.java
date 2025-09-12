import java.awt.*;
import java.awt.event.*;

public class DialogExample
{
	public static void main(String args[])
	{
		Frame f = new Frame("Main Window");
		Button bt = new Button("Open Dialog");
		Dialog d = new Dialog(f,"Dialog Example",true);
		d.setLayout(new FlowLayout());
		d.setSize(200,100);
		d.add(new Label("This is a DIALOG"));
		Button close = new Button("Close");	
		d.add(close);
		close.addActionListener(e -> d.setVisible(false));
		bt.addActionListener(e -> d.setVisible(true));
		f.add(bt);
		f.setSize(300,200);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
}