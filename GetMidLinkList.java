import java.util.*;
import java.io.*;
class GetMidLinkList{
	static class Node{
		int data ;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	static class Solution{
		static int getMiddle(Node head)
		{
			Node slow = head;
			Node fast = head;
			
			while(fast != null && fast.next != null)
			{
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow.data;
		}
	}
	static void printList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			Node head = new Node(sc.nextInt());
			Node tail = head;
			for(int i=0; i<n;i++)
			{
				tail.next = new Node(sc.nextInt());
				tail = tail.next;
			}
			
			Solution obj = new Solution();
			int result = obj.getMiddle(head);
			System.out.println(result);
			t--;
		}
	}
}