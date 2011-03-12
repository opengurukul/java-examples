/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_11;

/**
 *
 * @author matsya1
**/
interface Assign_param
{
public void  number_given(int num);
}

class Print_eg implements Assign_param
{
    public void number_given(int num)
    {
      System.out.println("the number passed by the interface "+num);
    }
}
class Square_num implements Assign_param
{
    public void number_given(int num)
    {
        int sq=num*num;
        System.out.println("square of the number passed by the interface "+sq);
    }
}
public class Interface_eg {
    public static void main(String[] args)
    {
     Print_eg pg=new Print_eg();
     pg.number_given(3);
     Square_num sn=new Square_num();
     sn.number_given(3);
     }
}
