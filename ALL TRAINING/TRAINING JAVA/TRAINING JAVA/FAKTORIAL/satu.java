/**
 * @(#)satu.java
 *
 *
 * @author 
 * @version 1.00 2011/1/29
 */


public class satu {
int x,y=0;
    public satu() {
    }
    void jalan(){
    	for(x=1;x<=10;x++){    		
    		y++;
    		for(x=1;x<=10;x++){
    			System.out.print(x+"! =");
    			y*=x;    		
    			System.out.println(y);
    		}    		
    	}
    }    
    
}