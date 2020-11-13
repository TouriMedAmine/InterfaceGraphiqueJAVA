import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstLine extends JPanel {
	public JLabel aff = new JLabel("Entrez la valeur    : ");
	public JTextField td = new JTextField(8);
	
	public FirstLine() {
		setLayout(new FlowLayout());
		add(aff);
		add(td);
	}
}
