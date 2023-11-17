import java.util.*;
public class RecursiveFibonnaci{
	int a = 0;
				int b=1;
				int c ;
	 static void Recursivefib(int count){
			while(count>0){
				System.out.print(a);
				c = a+b;
				a=b;
				b=c;
				Recursivefib(count-1);
			}
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number untill you want print the fibbinaci series");
		int count = sc.nextInt();
		
				System.out.println(a+" "+b);
				Recursivefib(count-2);
		
	}
}	
	
