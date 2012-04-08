/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_13;

/**
 *
 * @author matsya1
 */

    import java.io.*;
 public class Reader_eg
 {
   public static void main(String args[])throws IOException
  {
  char c;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter characters"+'\n'+" any to display "+'\n');

    c = (char) br.read();
    System.out.println(c);
  }
 }
