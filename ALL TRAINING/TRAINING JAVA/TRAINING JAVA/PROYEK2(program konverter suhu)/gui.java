/**
 * @(#)gui.java
 *
 *
 * @author 
 * @version 1.00 2011/1/13
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class gui implements ActionListener{
private JFrame form;
public JTextField txtsuhu;
public JButton tmbkon;
public JLabel input;
public JLabel lblreamur;
public JLabel lblfahrenheit;
public JLabel lblkelvin;

    public gui() {
    	//setting form
    	form=new JFrame("APLIKASI KONVERSI SUHU");
    	form.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
    	form.setSize(250,200);
    	
    	//setting TEXTFIELD
    	txtsuhu=new JTextField("              ");
    	form.getContentPane().add(txtsuhu);
    	
    	//setting Button
    	tmbkon=new JButton("CONVERT");
    	tmbkon.addActionListener(this);
    	form.getContentPane().add(tmbkon);
    	
    	//setting Label
    	lblreamur=new JLabel();
    	form.getContentPane().add(lblreamur);

    	lblfahrenheit=new JLabel();
    	form.getContentPane().add(lblfahrenheit);
    	
    	lblkelvin=new JLabel();
    	form.getContentPane().add(lblkelvin);    	
    }
    public void actionPerformed(ActionEvent e){
    		
    }
    
    
}