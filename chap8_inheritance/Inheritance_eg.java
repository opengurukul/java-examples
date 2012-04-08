/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_8;

/**
 *
 * @author matsya1
 */
class inh_eg
{
    int x;
    int p;
}
class inherit_eg extends inh_eg{
  int x;
  int p;
  int y;
  inherit_eg(int a,int b,int c,int d,int e)
  {
    super.x=a;
    super.p=c;
    x=b;
    p=d;
    y=e;
  }
  void display()
  {
      System.out.println("the variable in parent class  "+super.x+","+super.p);
      System.out.println("the variables in child class"+x+","+p+","+y);
  }
}


public class Inheritance_eg {
    public static void main(String[] args)
    {
        inherit_eg obj=new inherit_eg(3,4,5,6,7);
         obj.display();
    }
}
