/*Input:
N = 6
arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
Output: bbb
Explanation: "bbb" is the second most 
occurring string with frequency 2.

Example 2:

Input: 
N = 6
arr[] = {geek, for, geek, for, geek, aaa}
Output: for
Explanation: "for" is the second most
occurring string with frequency 2.
*/

import java.util.*;
import java.io.*;

class Solution1 {
	  String secFreqCnt(String s[] , int n)
	  {
		  HashMap<String , Integer> hm = new HashMap<>();
		  
		  for(String str : s)
		  {
			  hm.put(str,hm.getOrDefault(str,0)+1);
			  
		  }
		  
		  int max = Integer.MIN_VALUE;
		  int secMax = Integer.MIN_VALUE;
		  
		  String maxStr = "";
		  String secStr = "";
		  
		  for(String str : hm.keySet())
		  {
			  int cnt = hm.get(str);
			  
			  if(cnt > max)
			  {
				  secMax = max;
				  secStr = maxStr;
				  
				  max = cnt;
				  maxStr = str;
			  }
			  else if(cnt > secMax && cnt != max)
			  {
				  secMax = cnt;
				  secStr = str;
			  }
		  }
		  return secStr;
	  }
}

class SecondMostRepStr{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			String s[] = new String[n];
			for(int i=0; i<n;i++)
			{
				s[i] = sc.next();
			}
			
			Solution1 obj = new Solution1();
			System.out.println(obj.secFreqCnt(s , n));
			t--;
		}
	}
}


