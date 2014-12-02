/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcalcgui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author DBA
 */
public class TestCalcGUI extends JFrame {

    public TestCalcGUI() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 400);
        
        
        frame.setUndecorated(true);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        JPanel northJPanel = new JPanel();
        northJPanel.setLayout(new BorderLayout(2, 2));
        JTextArea txtArea = new JTextArea(5, 25);
        northJPanel.add(txtArea, BorderLayout.CENTER);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.fill = GridBagConstraints.BOTH;

        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        
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
        JButton bClear = new JButton("C");
        JButton bPm = new JButton("+/-");
        
        b0.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        
        bClear.setBackground(Color.cyan);
        b0.setBackground(Color.cyan);
        b1.setBackground(Color.cyan);
        b2.setBackground(Color.cyan);
        b3.setBackground(Color.cyan);
        b4.setBackground(Color.cyan);
        b5.setBackground(Color.cyan);
        b6.setBackground(Color.cyan);
        b7.setBackground(Color.cyan);
        b8.setBackground(Color.cyan);
        b9.setBackground(Color.cyan);
        bAdd.setBackground(Color.cyan);
        bSub.setBackground(Color.cyan);
        bMul.setBackground(Color.cyan);
        bPm.setBackground(Color.cyan);
        bEql.setBackground(Color.cyan);
        deci.setBackground(Color.cyan);
        bDiv.setBackground(Color.cyan);
        
        bClear.setBorder(null);   
        b0.setBorder(null);
        b1.setBorder(null);
        b2.setBorder(null);
        b3.setBorder(null);
        b4.setBorder(null);
        b5.setBorder(null);
        b6.setBorder(null);
        b7.setBorder(null);
        b8.setBorder(null);
        b9.setBorder(null);
        deci.setBorder(null);
        bAdd.setBorder(null);
        bSub.setBorder(null);
        bMul.setBorder(null);
        bDiv.setBorder(null);
        bEql.setBorder(null);
        bPm.setBorder(null);



        // first row
        gbc.gridx = 0;
        gbc.gridy = 3;
        centerPanel.add(b1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        centerPanel.add(b2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        centerPanel.add(b3, gbc);



        // first row
        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(b4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        centerPanel.add(b5, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        centerPanel.add(b6, gbc);


        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(b7, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        centerPanel.add(b8, gbc);


        gbc.gridx = 2;
        gbc.gridy = 1;
        centerPanel.add(b9, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        centerPanel.add(b0, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        centerPanel.add(bPm, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(bClear, gbc);


        gbc.gridx = 1;
        gbc.gridy = 0;
        centerPanel.add(bMul, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        centerPanel.add(bDiv, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        centerPanel.add(bSub, gbc);


        gbc.gridx = 3;
        gbc.gridy = 1;
        centerPanel.add(deci, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        centerPanel.add(bAdd, gbc);



        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        centerPanel.add(b0, gbc);


        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        centerPanel.add(bEql, gbc);



        contentPane.add(northJPanel, BorderLayout.PAGE_START);
        contentPane.add(centerPanel, BorderLayout.CENTER);
        frame.setContentPane(contentPane);
        frame.setLocationByPlatform(true);
        //frame.pack();
        frame.setVisible(true);






    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TestCalcGUI t = new TestCalcGUI();

    }
}
