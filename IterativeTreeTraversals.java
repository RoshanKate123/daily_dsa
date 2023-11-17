 import java.util.*;
 class IterativeTreeTraversals{
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
		 
	 }
	 public static void preOrder(TreeNode root){
		 if(root==null){
			 return;
		 }
		 Stack<TreeNode> st = new Stack<>();
		// TreeNode temp = root.data;
		 Stack.push(root);
		 while(!Stack.isEmpty()){
			 TreeNode temp = Stack.pop();
			 System.out.println(temp.data+" ");
			 if(temp.rigth!=null){
				 Stack.push(temp.right);
			 }
			 if(temp.left!=null){
				 Stack.push(temp.left);
			 }
		 }
		 
	 }
	 public static void inOrder(TreeNode root){
		 if(root==null){
			 return;
		 }
		 Stack<TreeNode> st = new Stack<>();
		 TreeNode temp = root;
		 while(!Stack.isEmpty() || temp!=null){
			 if(temp!=null){
				 Stack.push(temp);
				 temp=temp.left;
			 }else{
				 Stack.pop();
				 System.out.println(temp.data);
				 temp= temp.right;
			 }
	 }
	 }
	/* public void postOrder(TreeNode root){
		 if(root==null){
			 return;
		 }
	 }*/
	 
      public static void main(String args[]){
		  IterativeTreeTraversals itt = new IterativeTreeTraversals();
		  itt.preOrder(itt.root);
		  itt.inOrder(itt.root);
	  }
 }