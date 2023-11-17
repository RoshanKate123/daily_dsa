class RecursivePreOrderTraversal {

	class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data){
			this.data = data;
		//	this.left = left;
		//	this.right = right;
		}
	}
	TreeNode root;
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);	
		TreeNode third = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = four;
		second.right = five;
		third.left = six;
		third.right = seven;
		}
     public void preOrderTraversal(TreeNode root) {
    	 
		 if(root == null){
			 return;
		 }
		 
		 System.out.println(root.data + " ");
		 preOrderTraversal(root.left);
		 preOrderTraversal(root.right);
     }

     
     public static void main(String[] args) {
    	 RecursivePreOrderTraversal rpot = new RecursivePreOrderTraversal();
    	 rpot.createBinaryTree();
    	 rpot.preOrderTraversal(rpot.root);
     
}
}

