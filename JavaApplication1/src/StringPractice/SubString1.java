/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class SubString1 {
    public static void subStr(String str , int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String args[])
    {
        String str = "abcd";
        subStr(str , str.length());
    }
}
