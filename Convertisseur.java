import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Convertisseur extends JFrame implements ActionListener {
	
	
	private Panel amine;
	private PanelCenter yassine;
	private ThirdLine salah;
	private String a;
	private int b;
	public Convertisseur() {
		super("Convertisseur");
		setLayout(new BorderLayout());
		
		setSize(300,240);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		amine = new Panel();
		yassine = new PanelCenter();
		salah=new ThirdLine();
		
		salah.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				if (text=="Convertir") {
					if(amine.liste1.getSelectedValue()=="DH") {
					a=yassine.first.td.getText();
					b=Integer.valueOf(a);
					yassine.second.e.setText(""+b+"DH          :");
					b=b*11;
					yassine.second.s.setText(""+b+"euros");
					}
				}
			}
		});
		
		this.add(amine,BorderLayout.NORTH);
		this.add(yassine,BorderLayout.CENTER);
		this.add(salah,BorderLayout.SOUTH);
	
		setVisible(true);
			
	}
	public void actionPerformed(ActionEvent z) {
			//if (z.getSource()==b) {
			//a=td.getText();
			//i=Integer.valueOf(a);
			//e.setText(""+i+"dh");
			//i=i*11;
			//s.setText(""+i+"euro");
			
			
			
		}
	
		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Convertisseur();
	}

}
