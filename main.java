//import java.util.Vector;
//import java.util.ArrayList;
//import java.util.Enumeration;
//import java.util.Iterator;


import javax.swing.*;
import java.awt.*;
public class  main {
	public static void main(String[] args)
	{
	JFrame monFrame = new JFrame ("Mon Frame");
	monFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	try {
	JEditorPane monEditeur = new JEditorPane("http://www.google.fr");
	Container panneauContenu = monFrame.getContentPane();
	panneauContenu.setLayout(new FlowLayout());
	panneauContenu.add(monEditeur);
	monFrame.pack();
	monFrame.show();}
	catch (Exception e) {System.out.println(e.getMessage());};
	} 
}

