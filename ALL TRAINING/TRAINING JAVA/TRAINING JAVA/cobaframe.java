import javax.swing.*;
import java.awt.*;

class cobaframe extends JFrame{
	private JLabel lbl1;
	private JLabel lbl2;
	private JTextField txt1;
	private JTextField txt2;
	private JButton btoke;	
	private JLabel tamp1;
	private JLabel tamp2;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	public cobaframe(){
		initComponent();
	}
	public void initComponent(){
	//for frame
		setTitle("Coba JFrame");
		setSize(800,1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//initial extra components
	lbl1=new JLabel();
	lbl2=new JLabel();
	txt1=new JTextField();
	txt2=new JTextField();
	btoke=new JButton();
	tamp1=new JLabel();
	tamp2=new JLabel();
	panel1=new JPanel();
	panel2=new JPanel();
	panel3=new JPanel();
	//initial property components	
	getContentPane().add(panel1, java.awt.BorderLayout.PAGE_START);	
	panel1.setLayout(new java.awt.GridLayout(2,2));	
	lbl1.setText("Nama");
	lbl2.setText("Alamat");
	panel1.add(lbl1);	
	panel1.add(txt1);
	panel1.add(lbl2);
	panel1.add(txt2);
	//panel2
	getContentPane().add(panel2, java.awt.BorderLayout.CENTER);	
	panel2.setLayout(new java.awt.GridLayout(1,1));
	btoke.setText("OKE");
	btoke.addActionListener(new java.awt.event.ActionListener(){
		public void actionPerformed(java.awt.event.ActionEvent evt){
			btokeactionPerformed(evt);
		}
	});
	panel2.add(btoke);
	//panel3
	getContentPane().add(panel3, java.awt.BorderLayout.PAGE_END);
	panel3.setLayout(new java.awt.GridLayout(1,2));
	tamp1.setText("Nama = ");
	tamp2.setText("Alamat = ");
	panel3.add(tamp1);
	panel3.add(tamp2);
	pack();
	}
	public void btokeactionPerformed(java.awt.event.ActionEvent evt){
		tamp1.setText("nama = "+txt1.getText());
		tamp2.setText("alamat = "+txt2.getText());
	}
	public static void main(String [] args){
		cobaframe x=new cobaframe();
	}
}