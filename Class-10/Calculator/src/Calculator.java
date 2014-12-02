
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;



public class Calculator extends JFrame {

	public Calculator(){
		super("My Calc");
		setSize(400, 300);
                GridLayout g = new GridLayout(0,4);
                Box b = new Box(Box.WIDTH);
                g.setHgap(10);
                g.setVgap(10);
                
                JButton b0 = new JButton("0");
                JButton b1 = new JButton("1");
                JButton b2 = new JButton("2");
                JButton b3 = new JButton("3");
                JButton b4 = new JButton("4");
                JButton b5 = new JButton("5");
                JButton b6 = new JButton("6");
                JButton b7 = new JButton("7");
                JButton b8 = new JButton("8");
                JButton b9 = new JButton("9");
                JButton b10 = new JButton("10");
                JButton bMul = new JButton("*");
                JButton bAdd = new JButton("+");
                JButton bDiv = new JButton("/");
                JButton bSub = new JButton("-");
                JButton bEql = new JButton("=");
                JButton deci = new JButton(".");
                
                JTextPane out = new JTextPane();
                b.add(out);
                getContentPane().add(b9);
                getContentPane().add(b8);
                getContentPane().add(b7);
                getContentPane().add(bDiv);
                
                getContentPane().add(b6);
                getContentPane().add(b5);
                getContentPane().add(b4);
                getContentPane().add(bMul);
                
                getContentPane().add(b1);
                getContentPane().add(b2);
                getContentPane().add(b3);
                getContentPane().add(bSub);
                
                getContentPane().add(b0);
                getContentPane().add(deci);
                getContentPane().add(bEql);
                getContentPane().add(bAdd);
                getContentPane().setLayout(g);                
        }

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.setVisible(true);
                c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}