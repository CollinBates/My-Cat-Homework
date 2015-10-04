package catwork;

import javax.swing.JFrame;

/**
 * Displays a component inside a frame
 * 
 * @author Collin Bates
 */
public class CatFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cat Face");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(new CatFace());

        frame.setVisible(true);
        frame.setResizable(true);
        frame.setAlwaysOnTop(true);
    }
}
