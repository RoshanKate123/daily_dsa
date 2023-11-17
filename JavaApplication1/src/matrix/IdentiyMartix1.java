/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Roshan Ramdas Kate
 */
public class IdentiyMartix1 {
    static int identity(int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(i==j)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
        return 0 ;
    }
    public static void main(String args[])
    {
        int size = 5;
        identity(size);
    }
}
