/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class InsertInString {
    static String addStars(String s, int arr[])
    {
      String ans ="";
        int j=0;
        for(int i=0; i<s.length();i++)
        {
            if( j < arr.length && i == arr[j])
            {
               ans+='*';
               j++;
            }
            ans+= s.charAt(i);
        }
        return ans;
    }
    public static void main(String args[])
    {
        String s = "geeksforgeeks";
         int  arr[] = {1,5,7,9};
         String ans = addStars(s, arr);
         System.out.println(ans);
        
    }
}
