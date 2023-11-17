/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class StringRoatate {
    static String leftRotate(String str , int d)
    {
        String ans = str.substring(d)+ str.substring(0,d);
        return ans;
    }
    static String rightRotate(String str , int d)
    {
      return leftRotate(str, str.length() - d);
    }
    public static void main(String args[])
    {
               String str1 = "GeeksforGeeks";
               System.out.println(leftRotate(str1 , 2));
               String str2= "GeeksforGeeks";
                System.out.println(rightRotate(str2,2));
               
    }
}
