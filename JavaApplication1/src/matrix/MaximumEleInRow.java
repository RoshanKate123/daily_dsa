/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class MaximumEleInRow {
    static void maxi(int mat[][], int n )
    {
        int i = 0;
        int max = 0;
        int res[] = new int[n];
        while(i< n)
        {
          for(int j = 0 ; j<mat[i].length; j++)
          {
              if(mat[i][j] > max)
              {
                  max = mat[i][j];
              }
          }
          res[i] = max ;
          max = 0;
          i++;
        }
        printArray(res);
    }
    static void printArray(int res[])
    {
        for(int i=0; i< res.length  ; i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int mat[][] = { {3, 4, 1, 8},
                        {1, 4, 9, 11},
                        {76, 34, 21, 1},
                        {2, 1, 4, 5} };
        int n = 4;
        maxi(mat,n);
    }
    
}
