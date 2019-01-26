/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomTesting;

import java.awt.Dimension;

/**
 *
 * @author bmp
 */
public class RTesting {
     

      public static void main(String [] args)
    {

    int[] c1 = {1, 2, 3, 4};
    int[] c2 = {8, 7, 6, 5};
    int[][] array8D = {c1, c2};

  
     for(int i=0; (array8D.length)*4 >= i+1; ++i){ 
               
            
    }
   //  System.out.println(array4D[0][0].width);
     System.out.println(array8D[0][0]);
     System.out.println(array8D[0][1]);
     System.out.println(array8D[0][2]);
     System.out.println(array8D[0][3]);
     System.out.println(array8D[1][0]);
     System.out.println(array8D[1][1]);
     System.out.println(array8D[1][2]);
     System.out.println(array8D[1][3]);
     System.out.println((array8D.length)*4);
}
}
