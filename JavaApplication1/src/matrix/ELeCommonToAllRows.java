/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
import java.util.*;
public class ELeCommonToAllRows {
    static void  distinct(int mat[][], int n)
    {
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i=0; i<n; i++){
            ans.put(mat[0][i], 1);
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(ans.get(mat[i][j])!=null && ans.get(mat[i][j]) == i)
                {
                    ans.put(mat[i][j],i+1 );
                
                if(i == n-1)
                {
                    System.out.print(mat[i][j]+" ");
                }
                }
            }
        }
        
    }
    public static void main(String args[])
    {
        int a[][] = { { 2, 1, 4, 3 },
                      { 1, 2, 3, 2 },
                      { 3, 6, 2, 3 },
                      { 5, 2, 5, 3 } };
        int n = 4 ;
        distinct (a,n);
    }
}
