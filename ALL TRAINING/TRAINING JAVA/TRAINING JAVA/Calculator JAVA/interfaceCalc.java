import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;

class interfaceCalc extends JFrame implements ActionListener{
    /*--atribut tombol--*/
    private JButton jBtn0;
    private JButton jBtn1;
    private JButton jBtn2;
    private JButton jBtn3;
    private JButton jBtn4;
    private JButton jBtn5;
    private JButton jBtn6;
    private JButton jBtn7;
    private JButton jBtn8;
    private JButton jBtn9;

    private JButton jBtn1perX;
    private JButton jBtnBagi;
    private JButton jBtnHasil;
    private JButton jBtnKali;
    private JButton jBtnKoma;
    private JButton jBtnKurang;
    private JButton jBtnMinus;
    private JButton jBtnMod;
    private JButton jBtnSqrt;
    private JButton jBtnTambah;

    private JButton jBtnC;
    private JButton jBtnCE;
    private JButton jBtnBack;
    
    /*--atribut panel--*/
    private JPanel jPanelText;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    /*--atribut tekt--*/
    private JTextField jTextCalc;
    private JTextField jTextApa;    
    /*--atribut text--*/     
    private double temp=0;   
    private double temp1=0;
    private double hasil=0;
    private double count=0;
    private double countkoma=0; 
	private double jumlahkoma=0;    
    private String text;
    /*--atribut tanda--*/
    private int klik;
    private char tanda;
    private int koma;
    private boolean tandaklik;
    private int jumlahklik=0;
    private int ceksamadengan;
    private double memory=0;
    private double tandaMPlus;
    
    public interfaceCalc() {
        super("Program Kalkulator");
        setSize(250,160);
	    setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //initMenu();
        initPanelText();
        initPanel1();
        initPanel2();
        initPanel3();
        initialize();
        initActionPerformed();
    }

    public void initPanelText() {
        /* Membuat Panel Text */
        jPanelText = new JPanel();
        jTextCalc  = new JTextField("0",30);
        jTextCalc.setEditable(false);
        jTextCalc.setHorizontalAlignment(JTextField.RIGHT);
        jPanelText.add(jTextCalc);
   }
 
   public void initPanel1() {
        /* Membuat Panel 1 */
        jPanel1  = new JPanel();
        jPanel1.setLayout(new GridLayout(1,3,1,2));
        jBtnC    = new JButton("C");
        jBtnCE   = new JButton("CE");
        jBtnBack = new JButton("Backspace");
        jPanel1.add(jBtnBack);
        jPanel1.add(jBtnCE);
        jPanel1.add(jBtnC);
   }
   public void initPanel2() {
        /* Membuat Panel 2 */
        jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(4,6,1,2));
        jBtn0 = new JButton("0");
        jBtn1 = new JButton("1");
        jBtn2 = new JButton("2");
        jBtn3 = new JButton("3");
        jBtn4 = new JButton("4");
        jBtn5 = new JButton("5");
        jBtn6 = new JButton("6");
        jBtn7 = new JButton("7");
        jBtn8 = new JButton("8");
        jBtn9 = new JButton("9");
        jBtnMinus  = new JButton("+/-");
        jBtnKoma   = new JButton(".");
        jBtnBagi   = new JButton("/");
        jBtnKali   = new JButton("*");
        jBtnKurang = new JButton("-");
        jBtnTambah = new JButton("+");
        jBtnSqrt   = new JButton("sqrt");
        jBtnMod    = new JButton("%");
        jBtn1perX  = new JButton("1/x");
        jBtnHasil  = new JButton("=");
        jPanel2.add(jBtn7);
        jPanel2.add(jBtn8);
        jPanel2.add(jBtn9);
        jPanel2.add(jBtnBagi);
        jPanel2.add(jBtnSqrt);
        jPanel2.add(jBtn4);
        jPanel2.add(jBtn5);
        jPanel2.add(jBtn6);
        jPanel2.add(jBtnKali);
        jPanel2.add(jBtnMod);
        jPanel2.add(jBtn1);
        jPanel2.add(jBtn2);
        jPanel2.add(jBtn3);
        jPanel2.add(jBtnKurang);
        jPanel2.add(jBtn1perX);
        jPanel2.add(jBtn0);
        jPanel2.add(jBtnMinus);
        jPanel2.add(jBtnKoma);
        jPanel2.add(jBtnTambah);
        jPanel2.add(jBtnHasil);
   }
   
   public void initPanel3() {
        /* Membuat Panel 3 */
        jPanel3   = new JPanel();
        jTextApa  = new JTextField("",3);
        jTextApa.setEditable(false);
        jPanel3.add(jTextApa);

   }    

   public void initialize() {
	GridBagLayout gB;
	GridBagConstraints gBc;

	gB = new GridBagLayout();
	gBc= new GridBagConstraints();
	getContentPane().setLayout(gB);
	gBc.fill      = GridBagConstraints.NONE;		
	gBc.weightx   = 1.0;
	gBc.gridwidth = 6;
	gBc.gridx     = 0;
	gBc.gridy     = 0;
	gB.setConstraints(jPanelText,gBc);
	getContentPane().add(jPanelText);
	
	gBc.weightx   = 1.0;
	gBc.gridwidth = 1;
	gBc.gridx     = 0;
	gBc.gridy     = 1;
	gB.setConstraints(jPanel3,gBc);
	getContentPane().add(jPanel3);
	
	gBc.weightx   = 1.0;
	gBc.gridwidth = 5;
	gBc.gridx     = 1;
	gBc.gridy     = 1;
	gB.setConstraints(jPanel1,gBc);
	getContentPane().add(jPanel1);

	gBc.weightx    = 1.0;
	gBc.gridwidth  = 5;
	gBc.gridheight = 4;
	gBc.gridx      = 1;
	gBc.gridy      = 2;
	gB.setConstraints(jPanel2,gBc);
	getContentPane().add(jPanel2);
  }
   
   public void actionPerformed(ActionEvent e){	   
   	double tempkoma=1;
	   if ((e.getSource()==jBtn0) || (e.getSource()==jBtn1) || (e.getSource()==jBtn2) || (e.getSource()==jBtn3) || (e.getSource()==jBtn4) || (e.getSource()==jBtn5)|| (e.getSource()==jBtn6) || (e.getSource()==jBtn7) || (e.getSource()==jBtn8) || (e.getSource()==jBtn9) || (e.getSource()==jBtnKoma) || (e.getSource()==jBtnMinus)) {
		 jumlahklik=0;
		 ceksamadengan=0;
	     if (e.getSource()==jBtn0) {
	    	if (koma!=0) {	    		
	    		jumlahkoma++;
		   		for (int i=1;i<=jumlahkoma;i++) {
		   			tempkoma=tempkoma*10;
		   		}	    		
	    		countkoma=0/tempkoma;
		        temp=temp+countkoma;
	    	}
	    	else {
	    		temp=count+0;
	    	}

	     }
	     else if (e.getSource()==jBtn1) {
		    if (koma!=0) {	    		
		    	jumlahkoma++;
		   		for (int i=1;i<=jumlahkoma;i++) {
		   			tempkoma=tempkoma*10;
		   		}		    	
		    	countkoma=1/tempkoma;
		    	temp=temp+countkoma;
		    }	
		    else {
		    	temp=count+1;
		    }
	     }
	     else if (e.getSource()==jBtn2) {
		   	if (koma!=0) {	    		
		   		jumlahkoma++;
		   		for (int i=1;i<=jumlahkoma;i++) {
		   			tempkoma=tempkoma*10;
		   		}		   		
	    		countkoma=2/tempkoma;
	    		temp=temp+countkoma;
	    	}
		   	else {
		   		temp=count+2;
		   	}
	     }
	     else if (e.getSource()==jBtn3) {
			if (koma!=0) {	    		
		   		jumlahkoma++;
		   		JOptionPane.showMessageDialog(rootPane,"JUMLAH KOMA = "+jumlahkoma);
		   		for (int i=1;i<=jumlahkoma;i++) {
		   			tempkoma=tempkoma*10;
		   		}
	    		countkoma=3/tempkoma;	
	    		temp=temp+countkoma;
		    }
			else {
				temp=count+3;
			}
	     }
	     else if (e.getSource()==jBtn4) {
			if (koma!=0) {	    		
				jumlahkoma++;
				JOptionPane.showMessageDialog(rootPane,"JUMLAH KOMA = "+jumlahkoma);
				for (int i=1;i<=jumlahkoma;i++) {
					tempkoma=tempkoma*10;
				}
				countkoma=4/tempkoma;	
				temp=temp+countkoma;
		    }
			else {
				temp=count+4;
			}
	    }
	    else if (e.getSource()==jBtn5) {
			if (koma!=0) {	    		
		   		jumlahkoma++;
		   		for (int i=1;i<=jumlahkoma;i++) {
		   			tempkoma=tempkoma*10;
		   		}
	    		countkoma=5/tempkoma;	
	    		temp=temp+countkoma;
		    }
			else {				
				temp=count+5;
			}
	     }
	    else if (e.getSource()==jBtn6) {
			if (koma!=0) {	    		
		   		jumlahkoma++;
		   		for (int i=1;i<=jumlahkoma;i++) {
		   			tempkoma=tempkoma*10;
	   		}
		    		countkoma=6/tempkoma;	
	   		temp=temp+countkoma;
		    }
			else {
				temp=count+6;
			}
	    }
	    else if (e.getSource()==jBtn7) {
			if (koma!=0) {	    		
		   		jumlahkoma++;
		   		for (int i=1;i<=jumlahkoma;i++) {
		   			tempkoma=tempkoma*10;
		   		}
	    		countkoma=7/tempkoma;	
	    		temp=temp+countkoma;
		    }
			else {
				temp=count+7;
			}
	    }
	    else if (e.getSource()==jBtn8) {
			if (koma!=0) {	    		
		   		jumlahkoma++;
		   		for (int i=1;i<=jumlahkoma;i++) {
		   			tempkoma=tempkoma*10;
		   		}
	    		countkoma=8/tempkoma;	
	    		temp=temp+countkoma;
		    }
			else {
				temp=count+8;
			}
	    }
	    else if (e.getSource()==jBtn9) {
			if (koma!=0) {	    		
		   	 	jumlahkoma++;
		   		for (int i=1;i<=jumlahkoma;i++) {
		   			tempkoma=tempkoma*10;
		   		}
	    		countkoma=9/tempkoma;	
	    		temp=temp+countkoma;
		    }
			else {
				temp=count+9;
			}
	    }
	    else if (e.getSource()==jBtnKoma) {
	    	koma=1;	    	
	    }	 
	    else if (e.getSource()==jBtnMinus) {
	    	temp=-1*temp;
	    }
		if (koma==0) count=temp*10;	  		
			//JOptionPane.showMessageDialog(rootPane,"NILAI TEMP = "+temp);
			//JOptionPane.showMessageDialog(rootPane,"NILAI COUNT = TEMP*10 = "+count);
		text=Double.toString(temp);
		jTextCalc.setText(text);	 	     
	   }  	   
	   	//akhir IF AWAL
	   	else if ((e.getSource()==jBtnTambah) || (e.getSource()==jBtnKurang) || (e.getSource()==jBtnKali) || (e.getSource()==jBtnBagi) || (e.getSource()==jBtnMod) || (e.getSource()==jBtn1perX) || (e.getSource()==jBtnSqrt)) {
	   	 jumlahklik++;
	   	 if (jumlahklik>1) tandaklik=true;
	   	 else tandaklik=false;
	     if (e.getSource()==jBtnTambah) {
	    	if (klik==0) {
	    		klik=klik+1;
	    		if (ceksamadengan==0) temp1=temp;
	    		tanda='+';	    		
	    	}
	    	else if (tandaklik!=true) {
	    	    hasil=eksekusi(temp1, temp, tanda);
	   		    text=Double.toString(hasil);
			    jTextCalc.setText(text);
			    temp1=hasil;
	    	    tanda='+';			    
	    	}
	      }
	     else if (e.getSource()==jBtnKurang) {
		    if (klik==0) {
		    	klik=klik+1;
		    	if (ceksamadengan==0) temp1=temp;	
		    	tanda='-';	    		
		    }
		    else if (tandaklik!=true) {
	    	    hasil=eksekusi(temp1, temp, tanda);
		   	    text=Double.toString(hasil);
			    jTextCalc.setText(text);
			    temp1=hasil;
		        tanda='-';			    
		    }
		  }
	     else if (e.getSource()==jBtnKali) {
			if (klik==0) {
			    klik=klik+1;
			    if (ceksamadengan==0) temp1=temp;    		
			    tanda='*';		    
			}
			else if (tandaklik!=true) {
				hasil=eksekusi(temp1, temp, tanda);
			    text=Double.toString(hasil);			    
				jTextCalc.setText(text);
			    temp1=hasil;			    
			    tanda='*';			    
			}
	     }	  
	     else if (e.getSource()==jBtnBagi) {
		     if (klik==0) {
				klik=klik+1;
	    		if (ceksamadengan==0) temp1=temp;
				tanda='/';	    		
			 }
			 else if (tandaklik!=true) {
		    	hasil=eksekusi(temp1, temp, tanda);
				text=Double.toString(hasil);
				jTextCalc.setText(text);	
			    temp1=hasil;			    
			    tanda='/';			    
			 }
		 }	
	     else if (e.getSource()==jBtnMod) {
			    tanda='%';	    	 
		    	hasil=eksekusi(temp, 0, tanda);
				text=Double.toString(hasil);
				jTextCalc.setText(text);	
			    temp1=hasil;			    			    
		 }	     
	     else if (e.getSource()==jBtn1perX) {
			    tanda='X';	    	 
		    	hasil=eksekusi(temp, 0, tanda);
				text=Double.toString(hasil);
				jTextCalc.setText(text);	
			    temp1=hasil;			    			    
		 }	
	     else if (e.getSource()==jBtnSqrt) {
			    tanda='V';	    	 
		    	hasil=eksekusi(temp, 0, tanda);
				text=Double.toString(hasil);
				jTextCalc.setText(text);	
			    temp1=hasil;			    			    
		 }	     
		 count=0;
		 countkoma=0;
		 koma=0;
		 jumlahkoma=0;		 
	    }
		else if (e.getSource()==jBtnCE) {
		  jTextCalc.setText("0");
		  temp=0;
		  temp1=0;
		  ceksamadengan=0;
		  klik=0;		   
		  hasil=0;
		  count=0;
		  koma=0;
		  countkoma=0;
		  jumlahkoma=0;
		  text=Double.toString(temp);			  
	   }
	   else if (e.getSource()==jBtnC) {
		  jTextCalc.setText("0");
		  temp=0;
		  ceksamadengan=0;	   
		  hasil=0;
		  count=0;
		  koma=0;
		  countkoma=0;
		  jumlahkoma=0;	
		  text=Double.toString(temp);			  
	   }	   
	   else if (e.getSource()==jBtnHasil) {
	       hasil=eksekusi(temp1, temp, tanda);
  		   text=Double.toString(hasil);
		   jTextCalc.setText(text);	
		   temp1=hasil;
		   ceksamadengan=1;
		   klik=0;		   
		   hasil=0;
		   count=0;
		   koma=0;
		   countkoma=0;
		   jumlahkoma=0;		   
	   }
	   if (e.getSource()==jBtnBack) {
	      if (text.length()<=1) {
	      	  text="0.";
	      }
	      else {
	    	  text=text.substring(0, text.length()-1);
	      }
	      jTextCalc.setText(text);   
	    }		   
	   jTextCalc.setText(text);	 	
	   temp=Double.valueOf(text).doubleValue();	   
	 }
   public void initActionPerformed(){
       jBtn0.addActionListener(this);
       jBtn1.addActionListener(this);
       jBtn2.addActionListener(this);
       jBtn3.addActionListener(this);
       jBtn4.addActionListener(this);
       jBtn5.addActionListener(this);
       jBtn6.addActionListener(this);
       jBtn7.addActionListener(this);
       jBtn8.addActionListener(this);
       jBtn9.addActionListener(this);	 
       jBtnTambah.addActionListener(this);
       jBtnKurang.addActionListener(this);
       jBtnKali.addActionListener(this);
       jBtnBagi.addActionListener(this);
       jBtnHasil.addActionListener(this);
       jBtnKoma.addActionListener(this);
       jBtnCE.addActionListener(this);
       jBtnC.addActionListener(this);
       jBtnMinus.addActionListener(this);   
       jBtnBack.addActionListener(this); 
       jBtnMod.addActionListener(this);
       jBtn1perX.addActionListener(this);  
       jBtnSqrt.addActionListener(this);    
   }
   public double eksekusi(double op1, double op2, char tanda) {
       double result=0;
	   switch (tanda) {
	      case '+':
		     result=op1+op2;
		     break;
	      case '-':
			 result=op1-op2;
			 break;
	      case '*':
			 result=op1*op2;
			 break;	
	      case '/':
			 result=op1/op2;
			 break;	
	      case 'X':
			 result=1/op1;
			 break;	
	      case '%':
			 result=op1/100;
			 break;		
	      case 'V':
			 result=Math.sqrt(op1);
			 break;				 
	      default:
		     break;
	   }
	   return result;
   }
 }