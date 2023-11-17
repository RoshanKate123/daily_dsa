
class RecursiveTreeTraversals{
	TreeNode root;
	class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data){
			this.data = data;
	}
	}
	public void createBinaryTree(){
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
		third.right = six;
		third.left = seven;
		
		}
		
		public void preOrder(TreeNode root ){
			if(root==null){
				return;
		}
		System.out.print(root.data +" ");
		preOrder(root.left);
		preOrder(root.right);
		
		}
	
		public void inOrder(TreeNode root){
			if(root == null){
				return;
			}
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
		public void postOrder(TreeNode root){
			if(root == null){
				return;
			}
			postOrder(root.left);
			postOrder(root.right);
		    System.out.print(root.data +" ");
		}
		int findMax(TreeNode root){
			if(root==null){
				return  Integer.MIN_VALUE;
			}
			int result = root.data;
			int left = findMax(root.left);
			int right = findMax(root.right);
			if(left>result){
				result = left;
			}
			if(right>result){
				result= right;
			}
			return result;
		}
	public static void main(String[] args){
		RecursiveTreeTraversals rtt = new RecursiveTreeTraversals();
		rtt.createBinaryTree();
		rtt.preOrder(rtt.root);
		System.out.println();
		rtt.inOrder(rtt.root);
		System.out.println();
		rtt.postOrder(rtt.root);
		System.out.println();
		System.out.println(rtt.findMax(rtt.root));
		
	}
	
}