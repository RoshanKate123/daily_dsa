import java.util.*;
class GfgString{
	
	static class Solution{
		
		public static String[] winner(String arr[], int n)
		{
			HashMap<String, Integer> hm = new HashMap<>();
        
        String[] win=new String[2];
        for(int i=0; i<n; i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }
            else
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        
        int max = 0 ;
        String ans = "zzz";
        for(Map.Entry<String,Integer> m:hm.entrySet())
        {
            if(m.getValue()>max)
            {
                max = m.getValue();
                ans = m.getKey();
            }
            else if(m.getValue() == max)
            {
                if(m.getKey().compareTo(ans)<0)
                {
                    ans = m.getKey();
                }
                
            }
        }
        
        win[0] = ans;
        win[1] = max+"";
        
        return win;
		}
	}

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t-->0)
	{
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.next();
		}
		
		Solution obj = new Solution();
		String result[] = obj.winner(arr , n);
		System.out.println(result[0] +" "+result[1]);
	}
}
}