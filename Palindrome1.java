import java.util.*;
class Palindrome1{
	public static void main(String args[]){
		String original, reverse="";
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		int length = original.length();
		for(int i = length-1;i>=0;i--){
			reverse =  reverse + original.charAt(i);
		}
			if(original.equals(reverse)){
				System.out.println("yes");
			}else{
				System.out.println("No");
			}
		
	}
}
