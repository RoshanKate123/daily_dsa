/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

import java.util.Arrays;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class SortMatrix {
    static int size = 10;
    static void sortMat(int a[][], int n){
        int temp[] = new int[n*n];
        int k = 0;
        for(int i=0;i<n;i++){
            for(int j=0; j<n ; j++){
                temp[k++] = a[i][j];
            }
        }
        Arrays.sort(temp);
        
        k = 0;
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = temp[k++];
            }
        }
    }
    static void print(int a[][], int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i] [j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int mat[][] = {{5,4,7},{1,3,8},{2,9,6}};
        int n = 3;
        System.out.println("The original matrix is ");
        print(mat,n);
        sortMat(mat , n);
        System.out.println("The matrix after sorting is ");
        print(mat , n);
        
    }
    
}
