import java.util.*;

class NumberGuessing{
	
	public static void guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		
		int number =  1 + (int)(100 * Math.random());
		
		int n = sc.nextInt();
		
		int i , guess;
		
		System.out.println("A number is Chosen" + " between 1 To 100." + "Guess the number"+ " within 5 trials");
        
      for( i=0; i<n; i++)
	  {
		  System.out.println("Guess The Number");
		  
		  guess = sc.nextInt();
		  
		  if(number == guess)
		  {
			  System.out.println("Congratulation you guessed correct Number");
			  break;
		  }
		  else if(number > guess && i != n -1)
		  {
			  System.out.println("The Number is Greater Than Guess");
			  
		  }
		  else if(number < guess && i != n-1)
		  {
			System.out.println("The Number is Smaller Than Guess");  
		  }
	  }
     if( i==n)
	 {
		 System.out.println("You have Exhausted Your litmit");
		 System.out.println();
		 System.out.println("The Number was"+number);
	 }		 
	}
	public static void main(String args[])
	{
	guessNumber();	
	}
}