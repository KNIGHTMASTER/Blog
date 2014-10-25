/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.util.Random;

/**
 *
 * @author Fauzi
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    

static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
static final String COMPONENT = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
static Random rnd = new Random();

static String randomString( int len ) 
{
   StringBuilder sb = new StringBuilder( len );
   for( int i = 0; i < len; i++ ) 
      sb.append( COMPONENT.charAt( rnd.nextInt(COMPONENT.length()) ) );
   return sb.toString();
}


 
    public static void main(String[] args) {
        String result = "";
        for( int a=0; a<4; a++){
            result += randomString(4);
            if ( a < 3){
                result += "-";
            }
        }
        System.out.println("RESULT  = "+ result);
    }
    
}
