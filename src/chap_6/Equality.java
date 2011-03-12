/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_6;



/**
 *
 * @author matsya1
 */
class compare
{
 int a, b;
 compare(int i, int j)
 {
   a = i;
   b = j;
 }
 boolean equals(compare o)
 {
  if(o.a == a && o.b == b)
   return true;
   else
   return false;
  }
}
public class Equality
 {
    public static void main(String[] args){
    compare cmp1=new compare(1,2);
    compare cmp2=new compare(1,3);
    System.out.println("comparison result " + cmp1.equals(cmp2));
    compare cmp3=new compare(1,2);
    compare cmp4=new compare(1,2);
    System.out.println("comparison result " + cmp3.equals(cmp4));
    }
 }
