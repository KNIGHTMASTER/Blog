/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zisal;

import java.util.Random;
/**
 *
 * @author Ladies Man
 */
public class Util<DATA> {
        
    public DATA[][] createMatrixRandomValue(int bar, int kol, Class<? extends DATA> clazz ) {
        DATA[][] result = (DATA[][]) new Object[bar][kol];
        for ( int a=0; a<bar; a++ ){
            for ( int b=0; b<kol; b++ ){
                result[a][b] = (DATA) (Object) (new Random().nextInt(9)+1);
            }
        }
        return result;
    }
    
    public int[][] createMatrixRandomValue( int bar, int kol){
        int[][] matrix = new int[bar][kol];
        for( int a=0; a<bar; a++ ){
            for ( int b=0; b<kol; b++ ){
                matrix[a][b] = new Random().nextInt(9)+1;
            }
        }
        return matrix;
    }
    
    public void showMatrix( int bar, int kol, Class<? extends DATA> [][] matrix ){        
        for ( int a=0; a<bar; a++ ){
            for ( int b=0; b<kol; b++ ){
                System.out.print( matrix[a][b]+" ");
            }
            System.out.println("");
        }
    }
}
