import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MultipleButtonClick extends JFrame implements ActionListener{
    
    JButton b1, b2, b3;
    JLabel result;
    
    MultipleButtonClick(){
        setTitle("Multiple Events");
        
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        
        result = new JLabel("");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        add(b1); add(b2); add(b3);
        add(result);
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(400, 200);
        setVisible(true);
    } // end constructor
    
    public void actionPerformed(ActionEvent e){
      if(e.getSource() == b1){
          
          JOptionPane.showMessageDialog(this, "Button 1 is clicked", "Information", JOptionPane.QUESTION_MESSAGE);
          
      }else if(e.getActionCommand() == "Button 2"){
          JOptionPane.showMessageDialog(this, "Button 2 is clicked", "Warning", JOptionPane.WARNING_MESSAGE);
      }else{
          JOptionPane.showMessageDialog(this, "Button 3 is clicked", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
    
    public static void main(String[] args){
        new MultipleButtonClick();
    }
}
