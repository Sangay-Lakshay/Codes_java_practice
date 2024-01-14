import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Cal implements ActionListener{
	JFrame f = new JFrame("Calculator");
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	JComboBox c;
	JPanel p1, p2, p3, p4;
	Cal(){
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();

		l1 = new JLabel("Enter First Number:");
		t1 = new JTextField(5);

		l2 = new JLabel("Enter Second Number:");
		t2 = new JTextField(5);

		l3 = new JLabel("Select Operation:");
		String[] op = {"", "Add", "Subtract", "Multiply", "Divide", "Modulus"};
		c = new JComboBox(op);

		l4 = new JLabel();

		p1.add(l1); p1.add(t1);
		p2.add(l2); p2.add(t2);

		p3.add(l3); p3.add(c);

		p4.add(l4);

		c.addActionListener(this);
		
		f.add(p1); f.add(p2); f.add(p3); f.add(p4);
		f.setLayout(new GridLayout(4,1));
		f.setSize(300, 200);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		try{ 
			String a = t1.getText();
			int i = Integer.parseInt(a);
			String b = t2.getText();
			int j = Integer.parseInt(b);

			if(c.getSelectedItem() == "Add"){
				l4.setText("Addition:"+ i + "+" + j + "=" + (i + j));
			}else if(c.getSelectedItem() == "Subtract"){
				l4.setText("Subtraction:"+ i + "-" + j + "=" + (i - j));
			}else if(c.getSelectedItem() == "Multiply"){
				l4.setText("Multiplication:"+ i + "x" + j + "=" + (i * j));
			}else if(c.getSelectedItem() == "Divide"){
				l4.setText("Division:"+ i + "/" + j + "="+ (i / j));
			}else if(c.getSelectedItem() == "Modulus"){
				l4.setText("Modulus:"+ i + "%" + j + "="+ (i % j));
			}else{
				l4.setText("");
			}
		}catch(NumberFormatException ex){
				l4.setText("Error! enter number");
		}
	}
	public static void main(String[] args){
		new Cal();
	}
}