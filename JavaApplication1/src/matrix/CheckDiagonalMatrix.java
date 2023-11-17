/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class CheckDiagonalMatrix {
    static int N = 4;
    static boolean isDiagonalMatrix(int mat[][])
    {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
      
                // condition to check
                // other elements
                // except main diagonal
                // are zero or not.
                if ((i != j) &&
                   (mat[i][j] != 0))
                    return false;
 
        return true;
    }
      
    // Driver function
    public static void main(String args[])
    {
        int mat[][] = { { 4, 0, 2, 0 },
                          { 0, 7, 0, 0 },
                          { 0, 0, 5, 0 },
                          { 0, 0, 0, 1 } };
      
        if (isDiagonalMatrix(mat))
            System.out.println("Yes");
        else
            System.out.println("No" );
    }
}
