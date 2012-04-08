/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_2;

/**
 *
 * @author matsya1
 */
public class Hypotenuse {
    public static void main(String[] args)
    {
        double base=1.1;
        double height=2.0;
        System.out.println("height and base of triangle"+height+","+base);
        double hypotenuse= Math.sqrt(base*base+height*height);
        System.out.println("hypotenuse"+hypotenuse);

    }

}
