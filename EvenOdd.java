import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class EvenOdd implements ActionListener{
	JFrame f = new JFrame("Even Odd Finder");
	JLabel l1, l2;
	JTextField t;
	JButton b;
	JPanel p1, p2, p3;
	EvenOdd(){
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

		l1 = new JLabel("Enter Number:");
		t = new JTextField(5);
		b = new JButton("CHECK");
		l2 = new JLabel();
		f.add(l1); f.add(t); f.add(b); f.add(l2);
		b.addActionListener(this);

		p1.add(l1); p1.add(t); p2.add(b); p3.add(l2);
		f.add(p1); f.add(p2); f.add(p3);
		f.setLayout(new GridLayout(3,1));
		f.setSize(300, 200);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b);
			try{
				String a = t.getText();
				int i = Integer.parseInt(a);
				if( i % 2 == 0){
					l2.setText("Even");
				}else{
					l2.setText("Odd");
				}
			}catch(NumberFormatException ex){
				l2.setText("Error! enter number");
			}
	}
	public static void main(String[] args){
		new EvenOdd();
	}
}