class SumOfNumInStr{
	
	static class Solution {
		static long findSum(String str)
		{
			long sum = 0; 
			long num = 0;
			boolean lock = false;
			for(int i=0; i<str.length();i++)
			{
			char curr = str.charAt(i);
			if(Character.isDigit(curr))
			{
				num = (num * 10) + (curr - '0');
				lock = true;
			}
			else if(lock)
			{
				sum += num;
				num = 0;
				lock = fasle;
			}
			}
			
			if(lock)
			{
				sum+=num;
			}
			return sum;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String str = sc.next();
			
			Solution obj = new Solution();
			long result = obj.findSum(str);
			System.out.println(result);
		}
	}
}