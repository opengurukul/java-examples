/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_6;

/**
 *
 * @author matsya1
 */
class overload_eg
{
    void disp(int a)
    {
        System.out.println("in first function "+a);
    }
    void disp(int x,int y)
    {
        System.out.println("in second function"+x+","+y);
    }
}
public class NewClas {
    public static void main(String[] args)
    {
        overload_eg obj=new overload_eg();
        obj.disp(3);
        obj.disp(4,5);
    }

}
