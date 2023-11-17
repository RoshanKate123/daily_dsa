/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

import java.util.Arrays;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class SortString {
    static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
  
// Driver program to test above function 
    public static void main(String[] args) {
        String s = "Roshan";
        sortString(s);
    }}
