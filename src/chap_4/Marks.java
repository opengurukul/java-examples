/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_4;

/**
 *
 * @author matsya1
 */
public class Marks {
    public static void main(String[] args)
    {
        double arr[]={22.2,33.0,11.0,33,5,55.89};
        double total=0;
        double avg;
        int i;
        for(i=0;i<5;i++)
        {
            total= total+arr[i];
            
        }
        System.out.println("total is "+total);

        avg=total/5;
        System.out.println("average is "+ avg);
    }

}
