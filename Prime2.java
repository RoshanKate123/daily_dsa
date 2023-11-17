 class Prime2{

 
 public static void checkPrime(int n){
	  int flag = 0;
  for(int i=2;i<n;i++){
  if(n%i==0){
  System.out.println(n+" is not a prime number");
  flag = 1;
  break;
  }
  }
  if(flag ==0){
  System.out.println(n+" is a prime number");
  }
  }
  public static void main (String args[]){
  checkPrime(3);
  checkPrime(4);
  checkPrime(1);
  }
  }