class MinDistBetTwoNum{
	static int minDist(int arr[],int n , int x , int y ){
		 int i , j;
  int min_dist = Integer.MAX_VALUE;
          for(i=0;i<n;i++){
			  for(j = i+1;j<n;j++){
				  if((x==arr[i]&& y==arr[j] || arr[i]==y && arr[j]==x) && min_dist > Math.abs(i-j)){
					  min_dist = Math.abs(i-j);
				  }
			  }
		  }
		  if(min_dist > n){
			  return -1;
		  }
		  else{
			  return min_dist;
		  }
	}
public static void main(String args[]){
   int arr[] = {0,1,2,3,7,8,5};
   int n = arr.length;
   int x = 0;
   int y = 8;
   System.out.println("Minimum Distance between "+x+" and "+y+" is "+minDist(arr,n,x,y));
}
}