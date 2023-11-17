import java.util.*;
import java.util.HashSet;
import java.io.*;
class LongestDistinctString{
	
	
	static class Solution {
		
		static int longestSubstrDistChar(String S)
		{
			int ans = 0;
        HashSet<Character> st = new HashSet<>();
        for(int i=0; i<S.length(); i++)
        {
            int j = i;
            while(j < S.length())
            {
                if(st.contains(S.charAt(j)))
                {
                    st.clear();
                    break;
                }
                else
                {
                    st.add(S.charAt(j));
                }
                j++;
                ans = Math.max(ans,st.size());
            }
        }
        return ans;
    }
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			String S = br.readLine();
			
			Solution ob = new Solution();
			System.out.println(ob.longestSubstrDistChar(S));
	}
}
}