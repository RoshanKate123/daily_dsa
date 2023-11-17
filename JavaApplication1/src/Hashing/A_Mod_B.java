/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hashing;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class A_Mod_B {
    static boolean printPairs(int arr[],int n, int k)
    {
        boolean isFound = true;
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                if(i!=j && arr[i] % arr[j] == k)
                {
                    System.out.print("("+ arr[i] +","+ arr[j]+")");
                    isFound = true;
                }
            }
        }
        return isFound;
    }
    public static void main(String args[])
    {
        int arr[] = {2,3,5,4,7};
        int k = 3;
        if(printPairs(arr,arr.length,k)== false)
        {
            System.out.println("No such pair exits");
        }
        
    }
}
