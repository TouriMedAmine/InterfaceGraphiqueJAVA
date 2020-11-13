import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener{
	
	private String k[]= {"DH","Dollars","Euros","Livres"};
	public JList liste1 = new JList(k);
	public JList liste2 = new JList(k);
	public Panel() {
		setLayout(new FlowLayout());
		add(liste1);
		add(liste2);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
