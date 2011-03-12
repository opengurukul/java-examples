/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_9;

/**
 *
 * @author matsya1
 */
abstract class Figure
{
    double d1;
    double d2;
    abstract double  area();
}
class Rectangle extends Figure
{
    Rectangle(int dim1,int dim2)
    {
        d1=dim1;
        d2=dim2;
    }
    double area()
    {
       System.out.println("area of reactangle");
       return d1*d2;
    }
}
class Triangle extends Figure
{
    Triangle(int base,int height)
    {
        d1=base;
        d2=height;
    }
    double area(){

        return d1*d2*.5;
    }
}

public class Abstract_eg {
public static void main(String args[])
{
    Figure obj;
    Triangle tri=new Triangle(2,3);
    System.out.println("Area of triangle"+tri.area());
    Rectangle rect=new Rectangle(2,3);
    System.out.println("Area of rectangle"+rect.area());
}
}
