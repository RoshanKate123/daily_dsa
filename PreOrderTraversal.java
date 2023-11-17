import java.util.ArrayList;

class PreOrderTraversal{
	
	static class Tree{
		int data ;
		Tree left ,right;
		
		Tree(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	
	}
	
	static void preOrderTraversal(Tree root , ArrayList<Integer> preOrder)
	{
		if(root == null)
			return;
		
		preOrder.add(root.data);
		preOrderTraversal(root.left,preOrder);
		preOrderTraversal(root.right,preOrder);
		
	}
	
	static void inOrederTraversal(Tree root, ArrayList<Integer> inOrder)
	{
		if( root == null)
			return;
		
		inOrederTraversal(root.left,inOrder);
		inOrder.add(root.data);
		inOrederTraversal(root.right,inOrder);
	}
	
	static void postOrderTraversal(Tree root , ArrayList<Integer> postOrder)
	{
		
		if(root == null)
		{
			return;
		}
		
		postOrderTraversal(root.left,postOrder);
		postOrderTraversal(root.right,postOrder);
		postOrder.add(root.data);
	}
	
	
	public static void main(String args[])
	{
		Tree root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		root.left.right = new Tree(5);
		root.left.right.left = new Tree(8);
		root.right.left = new Tree(6);
		root.right.right = new Tree(7);
		root.right.right.left = new Tree(9);
		root.right.right.right = new Tree(10);
		
		System.out.println("-------Pre_Order_Traversal-----");
		ArrayList<Integer> preOrder = new ArrayList<>();
		preOrderTraversal(root , preOrder);
		for(int i=0; i<preOrder.size(); i++)
		{
			System.out.print(preOrder.get(i) + " ");
		}
		System.out.println();
			System.out.println("-------In_Order_Traversal-----");
		ArrayList<Integer> inOrder = new  ArrayList<>();
		inOrederTraversal(root , inOrder);
		for(int i=0; i<inOrder.size(); i++)
		{
			System.out.print(inOrder.get(i) + " ");
		}
            System.out.println();
        	System.out.println("-------Post_Order_Traversal-----");
        ArrayList<Integer> postOrder = new ArrayList<>();
        postOrderTraversal(root, postOrder);
		for(int i=0; i<postOrder.size(); i++)
		{
			System.out.print(postOrder.get(i) + " ");
		}
        
        		
		
	}
}