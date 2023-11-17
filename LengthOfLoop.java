import java.io.*;
import java.lang.*;
import java.util.*;
class LengthOfLoop{
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
		
	}
	
	static int countNodesInLoop(Node head)
	{
		if(head == null)
			return 0;
		
		int count = 0;
		Node slow = head ;
		Node fast = head;
		while(fast!=null && fast.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			
			if(slow == fast)
			{
				count = 1;
				slow = slow.next;
				while(slow != fast)
				{
					count++;
					slow = slow.next;
				}
				return count;
			}
		}
		return 0;
	}
	public static void makeLoop(Node head, Node tail , int x)
	{
		if(x == 0)
			return;
		Node curr = head;
		for(int i=0; i<x;i++)
		{
			curr = curr.next;
			
		}
		tail.next = curr;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int num = sc.nextInt();
			Node head = new Node(num);
			Node tail = head;
			
			for(int i=0; i<n;i++)
			{
				num = sc.nextInt();
				tail.next = new Node(num);
				tail = tail.next;
			}
			int pos = sc.nextInt();
			makeLoop(head , tail,pos);
			
			
			
			System.out.println(countNodesInLoop(head));
		
		}
	}
}