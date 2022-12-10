package module7;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        this.setSize(400,400);
        this.setTitle("Module Six");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
//        frame.getContentPane().setBackground(new Color(0,0,0));
        this.getContentPane().setBackground(Color.blue);
    }
}
