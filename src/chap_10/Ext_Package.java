/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_10;

/**
 *
 * @author matsya1
 */
import chap_package.*;
import java.io.*;
public class Ext_Package {

public static void main(String[] args)throws IOException
{
    int n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.println("enter number of choice");
    ;

    n = Integer.parseInt(br.readLine());

    Eg_pack eg= new Eg_pack(n);
  }
}




