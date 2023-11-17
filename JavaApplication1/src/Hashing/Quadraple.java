/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hashing;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class Quadraple {
    static int countQuadruples(int a[],int b[],int c[],int d[],int n, int x)
    {
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                for(int k=0;k<c.length;k++)
                {
                    for(int l=0;l<d.length;l++)
                    {
                        if(a[i]+b[j]+c[k]+d[l] == x)
                            count++;
                    }
                }
            }
        }
        return count ;
    }
    public static void main(String args[])
    {
      int arr1[] = {1, 4, 5, 6};
        int arr2[] = {2, 3, 7, 8};
        int arr3[] = {1, 4, 6, 10};
        int arr4[] = {2, 4, 7, 8};
 
        int n = arr1.length;
        int x = 30;
        System.out.println("Count = "
                + countQuadruples(arr1, arr2, arr3,
                        arr4, n, x));
    }
}
