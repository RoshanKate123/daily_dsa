
import java.util.*;
import java.io.*;
class StringDuplicates{
	
	class solution{
		
		String removeDups(String S)
		{
			Set<character> st = new HashSet<>();
			String res = "";
			for(int i=0; i< S.length(); i++)
			{
				if(!st.contains(S.charAt(i)):
				{
					res+=S.charAt(i);
					st.add(S.charAt(i);
				}
			}
			return res;
		}
		
	}
	
	public static void main(String args[]) throws IOException
	{
	 	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		
		while(t-->0){
			String s = read.readLine();
			
			Solution ob = new Solution();
			String result = ob.removeDups(S);
			System.out.println(result);
		}
		
	}
}

