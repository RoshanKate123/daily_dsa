/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

import java.util.HashMap;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class FreqandCount {
    
 
    public static void main(String args[])
    {
        String s = "roshan";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)+1);
            }
            else
            {
                hm.put(c,1);
            }
        }
         System.out.println("All character in string with their frequency :");
        for (HashMap.Entry<Character, Integer> entry : hm.entrySet()) 
         {
           System.out.print(entry.getKey() + "" + entry.getValue());  
         }
    }
}
