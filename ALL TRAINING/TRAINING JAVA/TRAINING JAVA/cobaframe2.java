import javax.swing.*;
import java.awt.*;

class cobaframe2 extends JFrame{
	public cobaframe2(){
		initComponent();
	}
	private JPanel panel1;		
	private JLabel lblnama, lbltitel,lbl1, lbl2, lbl3, lbl4;
	private JTextField txt1;
	private JCheckBox s1, s2;
	private JRadioButton rbtif, rbti, rbmi;
	private JButton btproses;
	private ButtonGroup btgrp;
	public void initComponent(){	
	//setting frame
		setTitle("FRAME 2");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//init item
	panel1=new JPanel();
	lblnama=new JLabel();
	lblnama.setText("Nama = ");
	txt1=new JTextField();
	lbltitel=new JLabel();
	lbltitel.setText("Titel = ");
	lbl1=new JLabel();
	lbl2=new JLabel();
	lbl3=new JLabel();
	lbl4=new JLabel();	
	s1=new JCheckBox();
	s1.setText("S1");
	s2=new JCheckBox();
	s2.setText("S2");
	rbtif=new JRadioButton();
	rbtif.setText("Teknik Informatika");
	rbti=new JRadioButton();
	rbti.setText("Teknik Industri");
	rbmi=new JRadioButton();
	rbmi.setText("Manajemen Informatika");
	btgrp=new ButtonGroup();
	btgrp.add(rbti);
	btgrp.add(rbtif);
	btgrp.add(rbmi);
	panel1.setLayout(new java.awt.GridLayout(6,6));
	panel1.add(lblnama);
	panel1.add(txt1);
	panel1.add(lbltitel);
	panel1.add(s1);
	panel1.add(lbl1);
	panel1.add(s2);
	panel1.add(lbl2);
	panel1.add(rbti);
	panel1.add(lbl3);
	panel1.add(rbtif);
	panel1.add(lbl4);
	panel1.add(rbmi);
	getContentPane().add(panel1, java.awt.BorderLayout.CENTER);	
	btproses=new JButton();	
	btproses.setText("PROSES");
	btproses.addActionListener(new java.awt.event.ActionListener(){
		public void actionPerformed(java.awt.event.ActionEvent evt){
			btprosesactionPerformed(evt);
		}
	});
	getContentPane().add(btproses, java.awt.BorderLayout.PAGE_END);	
	}
	public void btprosesactionPerformed(java.awt.event.ActionEvent evt){
		String titel=null;
		if(s1.isSelected()){
			titel="s1";
		}
		else if(s2.isSelected()){
			titel="s2";
		}
		else{
			titel="untitled";
		}
		String jur=null;
		if(rbtif.isSelected()){
			jur="teknik Informatika";
		}
		else if(rbti.isSelected()){
			jur="teknik Industri";
		}
		else if(rbmi.isSelected()){
			jur="manajemen informatika";
		}
		else{
			jur="unmajored";
		}
		JOptionPane.showMessageDialog(null, "Nama = "+txt1.getText()+"\ntitel = "+titel+"\njurusan = "+jur,"INFORMASI", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void main(String [] args){
		cobaframe2 instant1=new cobaframe2();
	}
}