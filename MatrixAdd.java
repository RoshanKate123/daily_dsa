class MatrixAdd{
	public static void main(String args[])
	{
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int brr[][] = {{3,2,1},{6,5,4},{9,8,7}};
		
		int c[][] = new int[3][3];
		
	 for(int i=0; i<3;i++)
	 {
		 for(int j=0; j<3;j++)
		 {
			 c[i][j] = arr[i][j] + brr[i][j];
			 System.out.println(c[i][j] + " ");
		 }
		 System.out.println();
	 }

		}
}