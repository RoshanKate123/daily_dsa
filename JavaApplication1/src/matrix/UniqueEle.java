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
public class UniqueEle {
    static void unique(int mat[][], int n , int m)
    {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                if(map.containsKey(mat[i][j]))
                {
                  map.put(mat[i][j], 1 + map.get(mat[i][j]));
                }else{
                    map.put(mat[i][j], 1);
                }
               
            }
        }
        int flag = 0 ;
       for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
          if(e.getValue() == 1)
          {
              System.out.print(e.getKey()+ " ");
              flag = 1;
          }
        }
       if(flag == 0 )
       {
           System.out.println("No unique element is present in matrix ");
       }
    }   
    public static void main(String args[])
    {
        int mat[][] = { { 1, 2, 3, 20 },
                   { 5, 6, 20, 25 },
                   { 1, 3, 5, 6 },
                   { 6, 7, 8, 15 }
                  }; 
        int R = 4;
        int C = 4;
        unique(mat,R,C);
    }
}
