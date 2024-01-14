import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class panel{
	JPanel pm, p1, p2, p3, p4;
	JFrame f = new JFrame("Rainbow");

	panel(){
		pm = new JPanel();
		p1 = new JPanel();
		p1.setBackground(Color.black);
		p2 = new JPanel();
		p2.setBackground(Color.blue);
		p3 = new JPanel();
		p3.setBackground(Color.cyan);
		p4 = new JPanel();

		pm.setLayout(new GridLayout(4,1));

		pm.add(p1); pm.add(p2);
		pm.add(p3); pm.add(p4);
		
		f.add(pm);
		f.setSize(300, 300);
		f.setVisible(true);

	}
	public static void main(String[] args){
		new panel();
	}
}