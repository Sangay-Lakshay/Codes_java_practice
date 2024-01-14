import java.awt.*;

class LabelEx1{
	Frame f = new Frame("Without Extention");
	Label l1, l2;

	LabelEx1(){
		l1 = new Label("First name: ");
		l1.setBounds(50, 100, 150, 30);

		l2 = new Label("Second name: ");
		l2.setBounds(50, 150, 150, 30);

		f.add(l1);
		f.add(l2);

		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args){
		new LabelEx1();
	}
}