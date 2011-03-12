/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_5;


 class Box
{
 double width;
 double height;
 double depth;
  void setDimension(double w, double h, double d)
   {
   width = w;
   height = h;
    depth = d;
   }
 double volume()
   {
   return width * height * depth;
   }
 }

public class Box_dimensions {
   public static void main(String[] args)
   {
       Box obj=new Box();
       obj.setDimension(1.2,2.3,3.4);
      double vol=obj.volume() ;
      System.out.println("volume of box "+vol);
   }
}
