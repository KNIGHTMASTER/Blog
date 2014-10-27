import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class gui extends JFrame implements ActionListener{
	private Menu file;
	private Menu Edit;
	private Menu Help;
	private MenuBar bar;
	public JLabel label;
	public JButton input;
	public MenuItem baru;
	public MenuItem open;
	public MenuItem save;
	public MenuItem exit;
	public MenuItem copy;
	public MenuItem cut;
	public MenuItem paste;
	public MenuItem about;
	public MenuItem content;
	public JTextField txtnama;
	public JButton proses;
	public JTextArea hasil;
	
    public gui()
	{  
		//setting frame	
    	this.setSize(250,250);
    	this.setTitle("PROGRAMKU");
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setLayout(new FlowLayout(FlowLayout.LEFT,25,20));
    	
		//setting textfield
    	txtnama=new JTextField("               ");
    	txtnama.setSize(getPreferredSize());
    	this.getContentPane().add(txtnama);

		//setting tombol
		input= new JButton("INPUT");
    	input.setSize(10,10);
    	input.addActionListener(this);		
    	this.getContentPane().add(this.input);	
		
		//setting menubar
		bar=new MenuBar();
		this.setMenuBar(this.bar);
		file=new Menu("File");
		Edit=new Menu("Edit");
		Help=new Menu("Help");
		bar.add(file);
		bar.add(Edit);
		bar.add(Help);

		//setting menuitem di menu file
		baru=new MenuItem("New");
		open=new MenuItem("Open");
		save=new MenuItem("Save");
		exit=new MenuItem("Exit");
		file.add(baru);
		file.add(open);
		file.add(save);
		file.add(exit);

		//setting menuitem di menu edit
		copy=new MenuItem("Copy");
		cut=new MenuItem("Cut");
		paste=new MenuItem("Paste");
		Edit.add(copy);
		Edit.add(cut);
		Edit.add(paste);
		
		//setting menuitem di menu help
		content=new MenuItem("Content");
		about=new MenuItem("About");
		Help.add(content);
		Help.add(about);

		//setting tombol2
		proses=new JButton("PROSES");
		proses.addActionListener(this);
		proses.setLocation(100,20);
		this.getContentPane().add(proses);
		
		//setting label
		label=new JLabel("HASIL");
		this.getContentPane().add(label);

		//setting textarea
		hasil=new JTextArea();
		hasil.setSize(30,30);
		this.getContentPane().add(hasil);
    }
    public void actionPerformed(ActionEvent e)
	{		
   }   
}
