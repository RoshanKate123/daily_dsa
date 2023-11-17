/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class ReplaceBy0or1 {
    public static void print(char[] input, int index)
    {
        if(index == input.length)
        {
            System.out.println(input);
            return ;
        }
        
        if(input[index] == '?')
        {
            input[index] = '1';
            print(input,index+1);
            
            input[index] = '0';
            print(input,index+1);
            
            input[index]= '?';
            
        }
        else
            print(input,index+1);
    }
    public static void main(String args[])
    {
        String str = "1??0?101";
        char input[] = str.toCharArray();
        print(input,0);
    }
}
