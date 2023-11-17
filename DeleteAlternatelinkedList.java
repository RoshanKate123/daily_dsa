import java.util.*;
class DeleteAlternateLinkedList{
	static class Node{
		int data ;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	static void deleteAlternate(Node head)
	{
		Node temp = head;
		while(temp != null)
		{
			temp.next = temp.next.next;
			temp = temp.next;
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0)
		{
			Node head = null , tail = null;
			int n = sc.nextInt();
			
			int d = sc.nextInt();
			head = new Node(d);
			tail = head;
			while(n-->1)
			{
				tail.next = new Node(sc.nextInt());
				tail = tail.next;
			}
			
			deleteAlternate(head);
			while(head != null)
			{
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
			
		}
	}
}