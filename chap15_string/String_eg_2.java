/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chap_15;


public class String_eg_2
{
   static String arr[] = {"is", "the", "time", "for", "all", "good", "men","to", "come", "to", "the", "aid", "of", "their", "country"};
       public static void main(String args[])
       {
         for(int j = 0; j < arr.length; j++)
          {
         for(int i = j + 1; i < arr.length; i++)
         {
           if(arr[i].compareTo(arr[j]) < 0)

         {
           String t = arr[j];
         arr[j] = arr[i];
         arr[i] = t;
         }
           }
      System.out.println(arr[j]);
        }
        }
      }

