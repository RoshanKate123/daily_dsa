/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class IsIdentityMatrix {
    static int Max = 100 ;
    static boolean isIdentity(int a[][], int n)
    {
        for(int i=0; i< n ; i++){
            for(int j=0; j<n;j++){
                if(i==j && a[i][j]!=1)
                      return false;
                else if(i!=j && a[i][j]!=0)
                         return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int N = 4;
        int mat[][] = {{1, 0, 0, 0},
                       {0, 1, 0, 0},
                       {0, 0, 1, 0},
                       {0, 0, 0, 1}};
        if(isIdentity(mat,N))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
            
}
