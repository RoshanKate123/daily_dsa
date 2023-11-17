import java.util.*;
class IterativePreorder{
static class Node{
	int data ;
	Node left, right;
	Node(int data)
	{
		this.data = data;
		left = right= null;
	}
}

 static ArrayList<Integer> preOrderTraversal(Node curr){
  ArrayList<Integer> preOrder = new ArrayList<>();
  if(curr == null)
  {
	  return  preOrder;
  }
  Stack<Node> s = new Stack<>();
  s.push(curr);
  while(!s.isEmpty())
  {
	  Node topNode = s.peek();
	  preOrder.add(topNode.data);
	  s.pop();
	  if(topNode.right!=null)
	  {
		  s.push(topNode.right);
	  }
	  if(topNode.left!=null)
	  {
		  s.push(topNode.left);
	  }
 }
 return preOrder;
  
}

static ArrayList<Integer> inOrderTraversal(Node curr)
{
	ArrayList<Integer> inOrder = new ArrayList<>();
	Stack<Node> s = new Stack();
	while(true)
	{
		if(curr != null)
		{
			s.push(curr);
			curr = curr.left;
	    }
		else
		{
			if(s.isEmpty()) break;
			curr = s.peek();
			inOrder.add(curr.data);
			s.pop();
			curr = curr.right;
		}
		
}
return inOrder;
}
public static void main(String args[])
{
	Node root = new Node(1);
	root.left = new Node(2);
	root.left.left = new Node(4);
	root.left.right = new Node(5);
	root.left.right.left = new Node(8);
	root.right = new Node(3);
	root.right.left = new Node(6);
	root.right.right = new Node(7);
	root.right.right.left = new Node(9);
	root.right.right.right = new Node(10);
	
	ArrayList<Integer> preOrder = new ArrayList<>();
	preOrder = preOrderTraversal(root);
	for(int i=0; i<preOrder.size();i++)
	{
		System.out.print(preOrder.get(i) +" ");
	}
	System.out.println();
	
	ArrayList<Integer> inOrder = new ArrayList<>();
	inOrder = inOrderTraversal(root);
	for(int i=0; i<inOrder.size();i++)
	{
		System.out.print(inOrder.get(i) +" ");

    }
}
}
