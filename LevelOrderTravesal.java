import java.util.*;
class LevelOrderTraversal {

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
     public void levelOrderTraversal() {
    	 if(root==null) {
    		 //System.out.println("Tree Is Empty");
    		 return;
    	 }
    	 Queue<TreeNode> que = new LinkedList<>();
    	 que.offer(root);
    	 while(!que.isEmpty()) {
    		 TreeNode temp = que.poll();
    		 System.out.println(temp.data+" ");
    		 if(temp.left!= null) {
    			 que.offer(temp.left);
    			 
    		 }
    		 if(temp.right!=null) {
    			 que.offer(temp.right);    		 }
    	 }
     }

     
     public static void main(String[] args) {
    	 LevelOrderTraversal lot = new LevelOrderTraversal();
    	 lot.createBinaryTree();
    	 lot.levelOrderTraversal();
     
}
}

