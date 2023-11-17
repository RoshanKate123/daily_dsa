/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class SquareOfDiagonal {
    static void squareDiagonal(int mat[][], int row , int col){
    System.out.print( "Diagonal one : ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
     
                // if this condition will become true
                // then we will get diagonal element
                if (i == j)
     
                    // printing square of diagonal element
                    System.out.print ( mat[i][j] * mat[i][j] +" ");
        }
        System.out.println();
     
        // This loop is for finding square of second
        // side of diagonal elements
        System.out.print("Diagonal two : ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
     
                // if this condition will become true
                // then we will get second side diagonal
                // element
                if (i + j == col - 1)
     
                    // printing square of diagonal element
                    System.out.print(mat[i][j] * mat[i][j] +" ");
        }

    }
    public static void main(String args[])
    {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        squareDiagonal(mat,3,3);
    }
}
