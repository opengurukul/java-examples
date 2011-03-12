/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_7;

/**
 *
 * @author matsya1
 */
class Parent_eg
{
    int y;
    private int x;

    void assign(int a,int b)
    {
    x=a;
    y=b;
    }
}
class child_eg extends Parent_eg
{

    void disp()
    {
        System.out.println("cannot access private variable x only y"+y);
    }
}


public class Private_eg {
    public static void main(String[] args)
    {
        child_eg pg=new child_eg();
        pg.assign(3,4);
        pg.disp();
      }

}
