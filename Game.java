import javax.swing.*;
import java.awt.*;
import java.util.*;

class Game extends JFrame{
	public static void main(String[] args){
		Random r = new Random();
		int num = r.nextInt(100);
		String name = JOptionPane.showInputDialog("Player name :");
		int count = 0;
		while(true){
			String number = JOptionPane.showInputDialog(name + " guess number between 1-100!");
			int numb = Integer.parseInt(number);

			if(numb == num){
				JOptionPane.showMessageDialog(null, "Correct! ");
				JOptionPane.showMessageDialog(null, "Took you "+count+" guesses to guess correct!");
				break;

			}else if(numb < num){
				JOptionPane.showMessageDialog(null, "Your guess is low! ");
				count ++;

			}else{
				JOptionPane.showMessageDialog(null, "Your guess is high ");
				count ++;
			}
		}

	}

}