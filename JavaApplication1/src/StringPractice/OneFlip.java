/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class OneFlip {
    static boolean canMakeEqual(String str)
    {
        int ones =0 , zeroes = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '0')
            {
                zeroes++;
            }
            else
            {
                ones++;
            }
        }
        return (zeroes == 1 || ones == 1);
            
    }
    public static void main(String args[])
    {
        System.out.println(canMakeEqual("10110")? "YES":"NO");
    }
}
