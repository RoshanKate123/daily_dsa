import java.util.*;
import java.io.*;
class FirstNegInWinSizeK{
	
	static Long[] printFirstNegativeInteger(Long arr[] , int k , int n)
	{
		ArrayList<Long> list = new ArrayList<>();
		
		boolean chk = false;
		
		for(int i=0; i<arr.length-k;i++)
		{
			for(int j=i; j<i+k;j++)
			{
				if(arr[j] <0)
				{
					chk = true;
					list.add(arr[j]);
					break;
				}
			}
			if(chk!=true)list.add((long)0);
			chk = false;
		}
		
		Long array[] = new Long[list.size()];
		for(int i=0; i<list.size();i++)
		{
			array[i] = list.get(i);
		}
		return array;
			
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			Long arr[] = new Long[(int)n];
			String inputLine[] = br.readLine().trim().split("");
			for(int i=0; i<n;i++)
			{
				arr[i] = Long.parseLong(inputLine[i]);
			}
			int k = Integer.parseInt(br.readLine());
			
		  Long ans[] = printFirstNegativeInteger(arr,  k ,  n);
		  int len = ans.length;
		  
		  StringBuilder sb = new StringBuilder();
		  for(int i=0; i<len; i++)
		  {
			  sb.append(ans[i]+" ");
		  }
		  System.out.println(sb);
		}	
		
	}
}