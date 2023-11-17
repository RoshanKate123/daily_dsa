/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class SwapChars {
  
   public static String swapCharacters(String s, int B,
                                        int C)
    {
        int N = s.length();
        // If c is greater than n
        C = C % N;
        // loop to swap ith element with (i + C) % n th
        // element
        char[] arr = s.toCharArray();
        for (int i = 0; i < B; i++) {
            char temp = arr[i];
            arr[i] = arr[(i + C) % N];
            arr[(i + C) % N] = temp;
        }
        return new String(arr);
    }
 
    public static void main(String[] args)
    {
        String s = "Roshan";
        int B = 4;
        int C = 3;
        s = swapCharacters(s, B, C);
        System.out.println(s);
    }
}
