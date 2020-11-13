import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ThirdLine extends JPanel implements ActionListener{
	private JButton b =new JButton("Convertir");
	private JButton q =new JButton("Quitter");
	private StringListener textListener;
	
	public ThirdLine() {
		
		setLayout(new FlowLayout());
		add(b);
		add(q);
		b.addActionListener(this);
		q.addActionListener(this);
	}
	public void setStringListener(StringListener listener) {
		this.textListener=listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton c =(JButton)e.getSource();
		if(c==b) {
			if(textListener!=null) {
				textListener.textEmitted("Convertir");
			}
		}
		else if (c==q) {
			if(textListener!=null) {
				textListener.textEmitted("Quitter");
			}
		}
	}
}
