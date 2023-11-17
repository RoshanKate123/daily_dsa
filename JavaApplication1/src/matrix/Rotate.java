/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class Rotate {
    static int r = 3;
    static int c = 3;
    static void rotateMatrix(int m,int n , int mat[][]){
        int row =0;
        int col =0;
        int curr,prev;
        while(row<m && col <n)
        {
            if(row+1 == m || col+1 == n)
                break;
            
            prev = mat[row+1][col];
            for(int i=col;i<n;i++){
                curr = mat[row][i];
                mat[row][i]=prev;
                prev = curr ;
            }
            row++;
            for(int i= row ; i<m;i++){
                curr = mat[i][n-1];
                mat[i][n-1] = prev;
                prev =curr;
            }
            n--;
            if(row<m)
            {
                for(int i=n-1; i>=col ; i--){
                    curr = mat[m-1][i];
                    mat[m-1][i] = prev ;
                    prev = curr;
                }
            }
            m--;
            if(col < n)
            {
                for(int i = m-1 ; i>=row ; i--)
                {
                    curr = mat[i][col];
                    mat[i][col] = prev ;
                    prev = curr ;
                }
                
            }
            col++;
            
        }
            for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < c; j++)
                System.out.print( mat[i][j] + " ");
                System.out.print("\n");
            }
    }
    public static void main(String args[]){
        int a[][] = {{1,2,3},{4,5,6},{7,8,9,},{10,11,12}};
         for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < c; j++)
                System.out.print( a[i][j] + " ");
                System.out.print("\n");
            }
           System.out.print("\n");
        rotateMatrix(r,c,a);
    }
}
