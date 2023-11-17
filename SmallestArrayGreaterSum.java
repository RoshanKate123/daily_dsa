import java.lang.*;
import java.io.*;
import java.util.*;
class SmallestArrayGreaterSum{
	
	static class Solution{
		
		static int smallestArrayGreaterSum(int arr[], int x)
		{
			int minLen = Integer.MAX_VALUE;
			
			for(int i=0; i<arr.length; i++)
			{
				int sum = 0;
				int ind = i;
				while(ind < arr.length)
				{
					sum+=arr[ind];
					while(sum > x)
					{
						minLen = Math.min(minLen, ind - i + 1);
						break;
					}
					ind++;
				}
			}
			return (minLen != Integer.MAX_VALUE) ? minLen : 0;
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 while(t > 0)
		 {
			 int x = sc.nextInt();
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i=0; i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			
			Solution obj = new Solution();
			
			int ans = obj.smallestArrayGreaterSum(arr , x);
			System.out.println(ans);
			 t--;
		 }
	}
}