import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondLine extends JPanel{
	public JLabel e = new JLabel("");
	public JLabel s = new JLabel("");
	
	public SecondLine() {
		setLayout(new FlowLayout());
		add(e);
		add(s);
	}
}
