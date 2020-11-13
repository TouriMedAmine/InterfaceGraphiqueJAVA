import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCenter extends JPanel {
	public FirstLine first;
	public SecondLine second;
	
	
	public PanelCenter() {
		setLayout(new BorderLayout());
		first=new FirstLine();
		add(first,BorderLayout.NORTH);
		
		second=new SecondLine();
		add(second,BorderLayout.CENTER);
		
	
		
		
	}
}
