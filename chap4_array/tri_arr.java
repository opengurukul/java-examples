/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_4;

/**
 *
 * @author matsya1
 */
public class tri_arr {
    public static void main(String args[])
    {
        
        int i,j,x=1;
         int arr[][]=new int[4][4];
        for(i=0; i<4; i++){

          for(j=0; j<i+1; j++)

           {

          arr[i][j] = x;

           x++;

       }
        }

        for(i=0; i<4; i++)

        {
     System.out.println();
           for(j=0; j<i+1; j++)
           {

             System.out.print(arr[i][j] );
           }
        }
    }

}
