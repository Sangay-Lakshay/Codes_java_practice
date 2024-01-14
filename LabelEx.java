import java.awt.*;

class LabelEx extends Frame{
	Label l1, l2;

	LabelEx(){
		l1 = new Label("First name: Sangay ");
		l1.setBounds(50, 100, 150, 30);

		l2 = new Label("Second name: Lakshay");
		l2.setBounds(50, 150, 150, 30);

		add(l1);
		add(l2);

		setSize(500, 500);
		setLayout(null);

		Button b = new Button("Click");
		b.setBounds(50, 200, 90, 30);
		add(b);
	}

	public static void main(String[] args){
		LabelEx l = new LabelEx();

		l.setVisible(true);
	}
}
