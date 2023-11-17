/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class Matrix2 {
    static int max = 100;
    static int arr[][] = new int[max][max];
    static void rowMajor(){
        int i , j ;
        for(i=0; i<max;i++){
            for(j=0; j<max;j++){
                arr[i][j]++;
            }
        }
    }
    static void colMajor(){
        int i , j ;
        for(i=0; i<max;i++){
            for(j=0; j<max;j++){
                arr[j][i]++;
            }
        }
    }
    public static void main(String args[]){
        Instant start = Instant.now();
        colMajor();
        Instant end = Instant.now();
        System.out.println("The Col Major access time : "+Duration.between(start, end));
        
        start = Instant.now();
        rowMajor();
        end = Instant.now();
        System.out.println("The Row Major access time : "+Duration.between(start,end));
    }
}
