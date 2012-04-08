/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap10_packages_support;

/**
 *
 * @author matsya1
 */
public class Eg_pack
{
   int i;
    public Eg_pack(int n)
    {
        i=n;
      switch(i)
      {
          case 1:
          {
              System.out.println("Selected item 1");
              break;

          }
          case 2:
          {
              System.out.println("Selected item 2");
              break;
          }
          case 3:
          {
             System.out.println(" Selected item 3");
             break;
          }

          default:
          {
              System.out.println("selected item does not exist");
          }
      }

    }
}
