import java.awt.event.*;
import javax.swing.*;
public class aksi2 extends gui
{
	int data[][]=new int[10][10];
	String x[][]=new String[10][10];
	int a,b,c,d;
    public aksi2() 
    {
    	
    }
    public void actionPerformed(ActionEvent e)
    {
		
		if (e.getSource()==input)
		{
			a=Integer.parseInt(JOptionPane.showInputDialog(null,"MAsukkan jumlah data inputan",JOptionPane.QUESTION_MESSAGE));
			for(b=1;b<=a;b++)
			{
				for(c=1;c<=a;c++)
				{
				d=Integer.parseInt(JOptionPane.showInputDialog(null,"data ke ["+b+","+c+"]",JOptionPane.QUESTION_MESSAGE));
				data[b][c]=d;
				}
			}
		}

		if (e.getSource()==proses)
		{
			String [][] datas=new String[10][10];
			String x="";
			for(b=1;b<=a;b++){
				for(c=1;c<=a;c++){
					datas[b][c]=String.valueOf(data[b][c]);
					x+=datas[b][c]+"  ";
					hasil.setText(x);
					}
					x+="\n";
				}
		}
    }
    }