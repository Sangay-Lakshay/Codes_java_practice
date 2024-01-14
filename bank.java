import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class bank implements ItemListener{
	JFrame f = new JFrame("Banking Application");
	double balance = 0;

	JPanel p;
	JRadioButton r1, r2, r3, r4;
	ButtonGroup b;
	

	bank(){
		JPanel p = new JPanel(new GridLayout(4,1));

		r1 = new JRadioButton("Deposit");
		r2 = new JRadioButton("Withdraw");
		r3 = new JRadioButton("Check Balance");
		r4 = new JRadioButton("Quit");

		b = new ButtonGroup();
		b.add(r1); b.add(r2);
		b.add(r3); b.add(r4);

		p.add(r1); p.add(r2);
		p.add(r3); p.add(r4);

		f.add(p);
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
		r4.addItemListener(this);

		f.setSize(300, 200);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		
	
			if(r1.isSelected()){
				String number1 = JOptionPane.showInputDialog(f, "Enter amount for Deposit: ");
				double num1 = Double.parseDouble(number1);

				balance = balance + num1;
				
			}else if(r2.isSelected()){
				String number2 = JOptionPane.showInputDialog(f, "Enter amount for Withdrawal: ");
				double num2 = Double.parseDouble(number2);
				if(num2 < balance){
					JOptionPane.showMessageDialog(f, "Your Withdrawal is successful! ");
					balance -= num2;
				}else{
					JOptionPane.showMessageDialog(f, "Your do not have sufficient balance!", "Balance low", JOptionPane.WARNING_MESSAGE);
				}
				
			}else if(r3.isSelected()){
				JOptionPane.showMessageDialog(f, "Your balance is "+ balance);

				
			}else if(r4.isSelected()){
				JOptionPane.showMessageDialog(f, "Bank Application will now exit");
				f.dispose();
			}
		
	}
	public static void main(String[] args){
		new bank();
	}
}





























