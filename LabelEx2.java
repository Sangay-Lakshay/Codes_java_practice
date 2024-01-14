import javax.swing.*;

class LabelEx2{
	JFrame f = new JFrame("Without Extention");
	JLabel l1, l2;

	LabelEx2(){
		l1 = new JLabel("First name: ");
		l1.setBounds(50, 100, 150, 30);

		l2 = new JLabel("Second name: ");
		l2.setBounds(50, 150, 150, 30);

		f.add(l1);
		f.add(l2);

		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);

		JButton b = new JButton("Click");
		b.setBounds(50, 200, 90, 30);
		f.add(b);
		
	}

	public static void main(String[] args){
		new LabelEx2();
	}
}