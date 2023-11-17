import java.util.*;
class ReverseLinkList{
	
	static class Node{
		int data;
		Node next ;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	static Node reverseList(Node head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		
		Node node = head.next;
		Node temp = head;
		Node prev = null;
		while(node != null)
		{
			temp.next = prev;
			prev = temp;
			temp = node;
			node = node.next;
		}
		temp.next = prev;
		return temp;
	}
	
	static void printList(Node head)
	{
		while(head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			Node head = new Node(sc.nextInt());
			Node tail = head;
			for(int i=0; i < n; i++)
			{
				tail.next = new Node(sc.nextInt());
				tail = tail.next;
			}
			
			
			head = reverseList(head);
			printList(head);
		}
	}
}