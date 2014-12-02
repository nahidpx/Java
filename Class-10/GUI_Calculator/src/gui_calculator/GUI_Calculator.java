/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_calculator;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author DBA
 */
public class GUI_Calculator  extends JFrame{

    public GUI_Calculator() {
        super("CalCulator");
        JPanel pnlCal = new JPanel(new BorderLayout(10,10));
        JTextArea txtArea = new JTextArea(2, 25);
        pnlCal.add(txtArea, BorderLayout.NORTH);
        setContentPane(pnlCal);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI_Calculator g = new GUI_Calculator();
        
    }

}
