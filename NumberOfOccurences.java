import java.util.*;
import java.io.*;
class NumberOfOccurences{
	
	static int count(int arr[] , int n , int x)
	{
		int first = firstOccurence(arr, n ,x);
		if( first == -1)
		{
			return 0;
		}
		
		int last = lastOccurence(arr, n ,x);
		return last - first + 1;
	}
	
	private static int firstOccurence(int arr[] , int n , int x)
	{
		int low = 0 ;
		int high = n-1;
		
		int result = -1;
		
		while(low <= high)
		{
			int mid = low + (high - low)/2;
			if(arr[mid] == x)
			{
				result = mid ;
				high = mid - 1;
			}
			else if(arr[mid] < x)
			{
				low = mid +1;
			}
			else{
				high = mid - 1;
			}
		}
		return result;
	}
	
	private static int lastOccurence(int arr[] , int n , int x)
	{
		int low = 0 ;
		int high = n-1;
		
		int result = -1;
		
		while(low <= high)
		{
			int mid = low + (high - low)/2;
			if(arr[mid] == x)
			{
				result = mid ;
				low = mid + 1;
			}
			else if(arr[mid] < x)
			{
				low  = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return result;
	}
	
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0)
		{
			String inputLine[] ;
			inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
 			int[] arr = new int[n];
			inputLine = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++)
			{
			arr[i] = Integer.parseInt(inputLine[i]);
			}
			int ans = count(arr, n , x);
			System.out.println(ans);
		}
		}
}