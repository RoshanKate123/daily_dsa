class SubArraySum{
	
	void subArraySum(int[] arr, int n , int sum){
		for(int i=1; i<n;i++){
			int currentsum = arr[i];
			
			if(currentsum == sum){
				System.out.println("The index is " +i);
				return ;
			}
			else{
				for(int j = i+1; j<n;j++){
				currentsum += arr[j];
				
				if(currentsum == sum){
					System.out.println("The index is " +i+" and "+j);
					return;
				}
			}
			}
		}
		System.out.println("No sub array found");
		return;
	}
      public static void main(String args[]){
		  SubArraySum Asum = new SubArraySum();
		  int arr[] = {1,4,0,0,3,5,7};
		  int n = arr.length;
		  int sum = 7;
		  Asum.subArraySum(arr,n,sum);
	  }
}