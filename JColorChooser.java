package smJv;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JColorChooser1 extends JFrame implements ActionListener{
	JFrame fr;
	JButton btn0;
	JTextArea txt0;
	public JColorChooser1()
	{
		fr=new JFrame("<----------------------------  JAVA JCOLORCHOOSER PROGRAMMING WITH ACTIONLISTENER AND TEXTAREA ! -------------------------------------------------------------------------------------------------------------->");
		btn0=new JButton("Bg Color");
		txt0=new JTextArea("\n   Welcome to Java JColorChooser programming with javaTpoint !");
		txt0.setBounds(50,80,430,300);
		btn0.setBounds(200,400,100,30);
		fr.add(btn0);
		fr.add(txt0);
		fr.setSize(500,500);
		fr.setLayout(null);
		fr.setVisible(true);
		btn0.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ev)
	{
		Color color0=JColorChooser.showDialog(this,"Choose",Color.YELLOW); 
		txt0.setBackground(color0);
	}
	public static void main(String[] args) {
		JColorChooser1 Obj=new JColorChooser1();
	}
}