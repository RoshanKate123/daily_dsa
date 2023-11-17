/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class SumOfMidRowCol {
    static void sumMidRowCol(int mat[][],int r , int c)
    {
        int row_Sum = 0 , col_Sum = 0 ;
        for(int i=1; i<r ; i++){
            for(int j=0;j<c;j++){
                row_Sum = row_Sum + mat[i][j];
            }
            System.out.println(row_Sum);
            break;
        }
        System.out.println();
        for(int i=0;i<r;i++){
            col_Sum+=mat[i][r/2];
        }
        System.out.println(col_Sum);
    }
public static void main(String args[])
{
    int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
    sumMidRowCol(mat,3,3);
}
}
