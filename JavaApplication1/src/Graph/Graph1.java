/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

import java.util.Scanner;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class Graph1 {
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int adj[][] = new int[n+1][n+1];
        for(int i=0;i<n;i++)
        {
            int u = sc.nextInt();
            int v  = sc.nextInt();
            adj[u][v] = 1;
            adj[v][u] = 1;
            
        }
    }
}
