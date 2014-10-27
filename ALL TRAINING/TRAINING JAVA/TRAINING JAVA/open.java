import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.*;

class open extends JFrame{
	public open(){
	init();
	}
	private JButton one;
	private JButton two;
	public void init(){
		setVisible(true);
		setSize(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		one = new JButton();
		one.setText("Open");
		two = new JButton();
		two.setText("save");
		two.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				twoactionPerformed(evt);
			}
		});
		one.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				oneactionPerformed(evt);
			}
		});
		getContentPane().add(one, java.awt.BorderLayout.CENTER);
		getContentPane().add(two, java.awt.BorderLayout.PAGE_END);
	}	
	public void twoactionPerformed(java.awt.event.ActionEvent evt){
		JFileChooser x=new JFileChooser();
		int ok=x.showSaveDialog(this);
			if(ok==JFileChooser.APPROVE_OPTION){				
				try{
					BufferedWriter tulis=new BufferedWriter(new FileWriter(x.getSelectedFile().getPath()));
					tulis.write("edited");
					tulis.close();
				}
				catch(Exception e){
					System.err.println(e);
				}
			}
	}
	public void oneactionPerformed(java.awt.event.ActionEvent evt){		
	JFileChooser x=new JFileChooser();
		int ok=x.showOpenDialog(this);
		if(ok==JFileChooser.APPROVE_OPTION){
			String file=x.getSelectedFile().getPath();
			try{
				Scanner b=new Scanner(new FileReader(file));
				while(b.hasNext()){
					System.out.println(b.nextLine());
				}
			}
			catch(Exception e){
				System.err.println(e);
			}
		}
	}
	public static void main(String [] args){
		open x=new open();
	}
}