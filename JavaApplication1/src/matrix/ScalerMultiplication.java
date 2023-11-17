/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class ScalerMultiplication {
    static final int  n = 3;
    static void scalarProduct(int mat[][], int k)
    {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] *= k;
            }
        }
    }
public static void main(String args[]){
    int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int k = 4;
    scalarProduct(mat , k);
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}    
}
