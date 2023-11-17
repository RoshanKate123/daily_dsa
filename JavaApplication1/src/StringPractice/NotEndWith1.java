/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class NotEndWith1 {
    static void All_Binary_String(String str , int num)
    {
        int len = str.length();
        if(len == num )
        {
            System.out.println(str+"");
            return ;
        }
        else if(str.charAt(len - 1)== '1')
        {
            All_Binary_String(str+'0',num);
        }
        else
        {
           All_Binary_String(str+'0',num); 
            All_Binary_String(str+'1',num);
        }
    }
    static void print(int num)
    {
        String word = " ";
        word+='0';
        All_Binary_String(word , num);
        word = "1";
        All_Binary_String(word,num);
    }
    public static void main(String args[])
    {
        int n = 4;
        print(n);
    }
}
