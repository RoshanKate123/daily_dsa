/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class MirrorMatrix {
static void imageSwap(int mat[][],int n)
{
    for(int i=0; i<n;i++)
    {
        for(int j=0; j<n;j++){
            mat[i][j] = mat[i][j] + mat[j][i]
                       - (mat[j][i] = mat[i][j]);  
        }
      
    }
}
static void print(int mat[][],int n)
{
    for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print( mat[i][j] + " ");
            System.out.println();
}
}
public static void main(String args[])
{
    int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
    int n = 4 ;
    imageSwap(mat,n);
    print(mat,n);
}
}
