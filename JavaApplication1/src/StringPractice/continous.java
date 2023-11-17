/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class continous {
    static int findFlips(String str , int n)
    {
        int last = ' ';
        int res = 0;
        for(int i=0; i<n; i++)
        {
            if(last!=str.charAt(i))
                res++;
            last = str.charAt(i);
        }
        return res/2;
    }
    public static void main(String args[])
    {
        String s = "111000111000";
        int n = s.length();
        System.out.println(findFlips(s,n));
    }
}
