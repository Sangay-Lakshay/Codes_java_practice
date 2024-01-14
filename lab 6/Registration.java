import javax.swing.*;
import java.awt.*;

class Registration{
	//creating a frame
	JFrame f = new JFrame("Register Here!");

	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
	JButton b1, b2;
	JTextField f1, f2, f3, f4;
	JRadioButton r1, r2, r3;
	JComboBox c1, c2, c3, c4;
	JCheckBox cb;
	//initilizing cunstrudtor
	Registration(){
		//creating labels, textfield, buttons, radiobutton, combobox
		l1 = new JLabel("Fill in the necessary information below.");
		l1.setBounds(50, 100, 500, 30);

		l2 = new JLabel("Name : ");
		l2.setBounds(50, 150, 150, 30);
		f1 = new JTextField(16);
		f1.setBounds(100, 150, 150, 30);

		l3 = new JLabel("CID No. : ");
		l3.setBounds(50, 200, 150, 30);
		f2 = new JTextField(16);
		f2.setBounds(112, 200, 150, 30);

		l4 = new JLabel("Date of Birth : ");
		l4.setBounds(50, 250, 150, 30);
		String d[] = {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		String m[] = {"Select", "January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String y[] = {"Select", "2002", "2001", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990"};
		
		l5 = new JLabel("Date : ");
		l5.setBounds(60, 300, 150, 30);
		c1 = new JComboBox(d);
		c1.setBounds(110, 300, 150, 30);

		l6 = new JLabel("Month : ");
		l6.setBounds(270, 300, 150, 30);
		c2 = new JComboBox(m);
		c2.setBounds(335, 300, 150, 30);

		l7 = new JLabel("Year : ");
		l7.setBounds(495, 300, 150, 30);
		c3 = new JComboBox(y);
		c3.setBounds(550, 300, 150, 30);

		l8 = new JLabel("Gender : ");
		l8.setBounds(50, 350, 150, 30);
		r1 = new JRadioButton("Male");
		r1.setBounds(110, 350, 150, 30);
		r2 = new JRadioButton("Female");
		r2.setBounds(110, 380, 150, 30);
		r3 = new JRadioButton("Other");
		r3.setBounds(110, 410, 150, 30);
		ButtonGroup b = new ButtonGroup();
		b.add(r1);
		b.add(r2);
		b.add(r3);

		l9 = new JLabel("College : ");
		l9.setBounds(50, 450, 150, 30);
		String col[] = {"Select", "GCIT", "Sherubtse College", "CNR", "CST", "GCBS", "PCE", "SCE", "JNEC", "CLCS"};
		c4 = new JComboBox(col);
		c4.setBounds(130, 450, 150, 30);

		l10 = new JLabel("Email : ");
		l10.setBounds(50, 500, 150, 30);
		f3 = new JTextField();
		f3.setBounds(100, 500, 150, 30);

		l11 = new JLabel("Contact No. : ");
		l11.setBounds(50, 550, 150, 30);
		f4 = new JTextField();
		f4.setBounds(150, 550, 150, 30);

		cb = new JCheckBox("I Accept the Terms and Condidtions");
		cb.setBounds(50, 600, 300, 30);

		JButton b1 = new JButton("Submit");
		b1.setBounds(590, 650, 90, 30);

		JButton b2 = new JButton("Reset");
		b2.setBounds(450, 650, 90, 30);
		//adding everything into the frame
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(b1);
		f.add(b2);
		f.add(f1);
		f.add(f2);
		f.add(f3);
		f.add(f4);
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(cb);

		f.setSize(900, 900);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	//main method
	public static void main(String[] args){
		//calling cunsttructor
		new Registration();
	}

}