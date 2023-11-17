/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class ShiftByK {
    static int n = 4 ;
    static void shif(int mat[][],int k )
    {
       if(k> n){
           System.out.println("Shifting is not possiible");
           return;
       } 
       int j = 0 ;
       while(j<n)
       {
           for(int i=k;i<n;i++)
           {
               System.out.print(mat[j][i]+" ");
           }
           for(int i=0 ; i<k ;i++)
           {
               System.out.print(mat[j][i]+" ");
           }
           System.out.println();
           j++;
       }
    }
    public static void main(String args[])
    {
        int mat[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}
                      };
        int k = 2;
        shif(mat,k);
    }
}
