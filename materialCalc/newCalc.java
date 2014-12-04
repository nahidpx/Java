import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class CalcUI extends JFrame{
	
	
	public CalcUI(){
		super("Calculator");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		
		//char[] btns = {'.', '0', '1','2','3','4','5','6','7','8','9','x','/','+','-','=','C'};
		String s = ".0123456789x/+-=C";
		JPanel pnlLeft = new JPanel();
		JPanel ans = new JPanel();
		
		JTextArea txt = new JTextArea();
		JPanel pnlRight = new JPanel();
		JPanel container = new JPanel();
		txt.setPreferredSize(new Dimension(370,70));
		
		pnlLeft.setLayout(new GridBagLayout());
		pnlRight.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.fill = GridBagConstraints.BOTH;
		
		gbc.weightx =0.5;
        gbc.weighty = 0.5;
        
        
        
        JButton[] btns = new JButton[s.length()];
		
		String c;
		
		Font font = new Font("Open Sans", Font.PLAIN, 25);
		Font font1 = new Font("Open Sans", Font.BOLD, 45);
		Font font2 = new Font("Open Sans", Font.PLAIN, 20);

	
		for (int i = 0; i < s.length(); i++) {
			c = "" + s.charAt(i);
			btns[i] = new JButton(c);
			
		}
		
		int k = 0;
		int i = 0;
		for ( i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				
				gbc.gridx = i;
		        gbc.gridy = j;
		        btns[k].setPreferredSize(new Dimension(100,90));
		        btns[k].setFont(font);
		        btns[k].setForeground(new Color(255,255,255));
		        //centerPanel.add(b8, gbc);
		        btns[k].setBorder(null);
		        btns[k].setBackground(new Color(67,67,67));
				pnlLeft.add(btns[k], gbc);
				k++;
			}
		}
		
		
		
		int p =1;
		for (int l = k; l < btns.length; l++) {
			gbc.gridx = 4;
	        gbc.gridy = p;
	        btns[k].setPreferredSize(new Dimension(70,72));
	        btns[k].setBorder(null);
	        btns[k].setFont(font2);
	        btns[k].setForeground(new Color(255,255,255));
	        btns[k].setBackground(new Color(99,99,99));
			pnlRight.add(btns[k], gbc);
			k++;
			p++;
		}
		txt.setFont(font1);
		ans.add(txt,BorderLayout.CENTER);
		container.add(ans, BorderLayout.NORTH);
		container.add(pnlLeft, BorderLayout.WEST);
		container.add(pnlRight, BorderLayout.EAST);
		setContentPane(container);
		setSize(400, 500);
		//pack();

		

		
	}

	public static void main(String[] args) {
		new CalcUI();
		
		

	}

}
