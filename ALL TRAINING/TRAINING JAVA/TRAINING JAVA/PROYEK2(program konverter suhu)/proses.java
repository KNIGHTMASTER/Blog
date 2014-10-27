/**
 * @(#)proses.java
 *
 *
 * @author 
 * @version 1.00 2011/1/13
 */
import java.awt.event.*;

public class proses extends gui{

    public proses() {
 		   	
    }
    public void actionPerformed(ActionEvent e){
    	int a=Integer.parseInt(txtsuhu.getText());
    	int reamur,fahreheit,kelvin;
    	
    	if (e.getSource()==tmbkon){
    		reamur=4*a;
    		fahrenheit=9/5*(a+32);
    		kelvin=a+273;
    		super.reamur.setText(this.reamur);
    		super.fahrenheit.setText(this.fahrenheit);
    		super.kelvin.setText(this.kelvin);
    	}
    }
    
    
}