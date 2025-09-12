import javax.swing.*;
public class SwingJava
{
	public static void main(String args[])
	{
		JFrame jf = new JFrame("MyFirst Swing App!");	
		JLabel jl = new JLabel("Hello Swing",SwingConstants.CENTER);
		jf.setSize(300,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(jl);
		jf.setVisible(true);
	}
}