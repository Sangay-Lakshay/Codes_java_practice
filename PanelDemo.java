import java.awt.*;

class PanelDemo {
    // Define a frame
    Frame f = new Frame("Panel Demo");
    // Define widgets
    Button btnadd, btnremove;
    TextArea taInfo;
    
    // Define constructor
    PanelDemo(){
        // Define two panels
        Panel topPanel = new Panel(new BorderLayout());
        Panel bottomPanel = new Panel(new GridLayout(3, 3));
        
        // initialize widgets
        btnadd = new Button("Add");
        btnremove = new Button("Remove");
        taInfo = new TextArea();
        
        // create array of button
        Button[] btn = new Button[6];
        for (int i=0; i<btn.length; i++){
            btn[i] = new Button(Integer.toString(i+1));
            // add button to the panel
            bottomPanel.add(btn[i]);
        }
        
        // Add Components to Panel
        topPanel.add(btnadd, BorderLayout.NORTH);
        topPanel.add(btnremove, BorderLayout.SOUTH);
        topPanel.add(taInfo, BorderLayout.CENTER);
        
        // Add Pannel to Top and Center
        f.add(topPanel, BorderLayout.NORTH);
        f.add(bottomPanel, BorderLayout.CENTER);
        
        f.setSize(400, 400);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        new PanelDemo();
    }
}
