import java.io.*;
import java.util.*;
class FindRotation{
	
	static class Solution{
		
		static int findKRotation(int a[] , int n)
		{
			int cnt = 0 ;
			for(int i=0; i < n; i++)
			{
				if(a[i] > a[n-1])
				{
					cnt++;
				}
			}
			return cnt;
		}
		
	}		
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			String[] str = br.readLine().trim().split(" ");
			int a[] = new int[n];
            for(int i=0; i<n;i++)
			{
				a[i] = Integer.parseInt(str[i]);
			}
			
			int ans = new Solution().findKRotation(a , n);
			System.out.println(ans);
		}
	}
}