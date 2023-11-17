/*class Transpose {
	public static void main(String args[])
	{
int original[][] = {{1,2,3},{4,5,6},{7,8,9}};
 
int transpose[][] = new int[3][3];

for(int i=0; i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		transpose[i][j] = original[j][i];
		
}}

System.out.println("Printing matrix without tanspose");

for(int i=0; i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(original[i][j]+" ");
		
    }
	System.out.println();
}
System.out.println("Printing transpose matrix");
for(int i=0; i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(original[i][j]+" ");
		
    }
	System.out.println();
}
	}
}*/
import java.util.*;
class Transpose{
	public static void main(String args[])
	{
		int i , j;
		System.out.println("Enter total numbers of rows and columns");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for(i = 0; i<rows; i++)
		{
			for(j =0; j < cols;j++)
			{
				arr[i][j] = sc.nextInt();
				System.out.println(" ");
			}
		}
		
		System.out.println("The Above Matrix Before TransPose is");
		
		for(i = 0; i<rows; i++)
		{
			for(j =0; j < cols;j++)
			{
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("The Above Matrix After TransPose is");
		
		for(i = 0; i<rows; i++)
		{
			for(j =0; j < cols;j++)
			{
				
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
}


