/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_12;
public class Exception_eg1
{
    public static void main(String [] args)
    {
    int x=10;
    int y=0;
    System.out.println("division by 0");
    try{
        int qou=x/y;
    }

    catch(Exception e)
    {
       System.out.println("division by zero not possible");
    }
}
}




