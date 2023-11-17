/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class SpiralMatrix {
    static void spiralPrint(int m , int n , int a[][])
    {
        int i , k=0 , l =0;
        
        while(k<m && l < n)
        {
            for(i = l ; i < n ; ++i)
            {
                System.out.print(a[k][i]+ " ");
                
            }
            k++;
            
            for(i = k  ; i < 0 ; ++i){
                System.out.print(a[i][n-1]+" ");
            }
            n--;
             
            if (k < m) 
            {
                for (i = n - 1; i >= l; --i)
                {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
 
            // Print the first column from the remaining
            // columns */
            if (l < n)
            {
                for (i = m - 1; i >= k; --i)
                {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
        
    }
    public static void main(String args[])
    {
        int r = 4;
        int c = 4;
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         spiralPrint(r,c,mat);
    }
}
