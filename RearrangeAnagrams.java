import java.util.*;
class RearrangeAnagrams{
	
	static class Gfg {
		
		static int rearrangeAnagrams(String s, String s1)
		{
			int ap[] = new int[26];
			int ap1[] = new int[26];
			
			for(char c:s.toCharArray())
			{
				ap[c -'a']++;
			}
			for(char c:s.toCharArray())
			{
				ap1[c -'a']++;
			}
			
			int res = 0;
			
			for(int i = 0; i<ap.length; i++)
			{
				res = Math.abs(ap[i] - ap1[i]);
			}
			
			return res;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		  String s = sc.next();
		  String s1 = sc.next();
		  
		  Gfg g = new Gfg();
		  System.out.println(g.rearrangeAnagrams(s,s1));
		}
	}
}