//alt +  enter to import package

package module8;

import module7.MyFrame;

import javax.swing.*;
import java.awt.*;

public class MainEight {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("messi.jpg");
        Image image = icon.getImage();
        Image newImage  = image.getScaledInstance(
                350,350,Image.SCALE_SMOOTH
        );
        ImageIcon newIcon  = new ImageIcon(newImage);

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(newIcon);

        MyFrame frame  = new MyFrame();
        frame.add(label);
    }
}
