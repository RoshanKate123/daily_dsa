import java.util.Scanner;
public class Fibonnaci2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
     int t = sc.nextInt();
	 int a=0;
	 int b=1;
	 int c;
	 
	 for(int i=0; i<t;i++){
	 System.out.print(a+" ");
	 c = a+b;
	 a=b;
	 b=c;
	 }
	 }
	 }
	 