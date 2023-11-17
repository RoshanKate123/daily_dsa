/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPractice;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class NextGreaterBinary {
     static String nextGreater(String num) {
 
        int l = num.length();
        int i;
        // examine bits from the right
        for (i = l - 1; i >= 0; i--) {
            // if '0' is encountered, convert
            // it to '1' and then break
            if (num.charAt(i) == '0') {
                num = num.substring(0, i) + '1' + num.substring(i+1);
                break;
            } // else convert '1' to '0'
            else {
                num = num.substring(0, i) + '0' + num.substring(i + 1);
            }
            // num[i] = '0';
        }
 
        // if the binary representation
        // contains only the set bits
        if (i < 0) {
            num = "1" + num;
        }
 
        // final binary representation
        // of the required integer
        return num;
    }
 
// Driver program to test above
    public static void main(String[] args) {
        String num = "10011";
        System.out.println("Binary representation of next number = "
                + nextGreater(num));
    }
}