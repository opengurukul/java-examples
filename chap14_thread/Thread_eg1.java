/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_14;

/**
 *
 * @author matsya1
 */
 class Thread_sub implements Runnable {
  Thread t;
  Thread_sub()
   {
   t = new Thread(this, "show thread");
    System.out.println(t);
   t.start();
   }
  public void  run()
 {
   try
  {
  for(int i = 1; i <=5; i++)
   {
   System.out.println(i);
   t.sleep(500);
   }
  }
   catch (Exception e)
   {
    System.out.println("exception");
   }
 }
}

class Thread_eg1
{
  public static void main(String args[])
  {
  new Thread_sub();
  }
}



