import java.util.*;
class IntersectionOFSortedLinkedList{
	static class Node{
		int data;
		Node next ;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public static Node findIntersection(Node head1, Node head2)
	{
		Node head = null;
		Node tail = head;
		
		while(head1 != null && head2 != null)
		{
			Node newNode = new Node(head1.data);
			if(head1.data == head2.data)
			{
			if(head == null){
				head = newNode;
			}
			else
			{
				tail.next = newNode;
                				
			}
			tail = tail.next;
			head1 = head1.next;
			head2 = head2.next;
			
			}
			else if(head1.data < head2.data)
			{
				head1 = head1.next;
			}
			else{
				head2 = head2.next;
			}
		}
		return head;
	}
	static Scanner sc = new Scanner(System.in);
	
	public static Node inputList(int size)
	{
		Node head , tail;
		
		int val;
		
		val = sc.nextInt();
		head = tail = new Node(val);
		
		size--;
		
		while(size-->0)
		{
			val = sc.nextInt();
			tail.next = new Node(val);
			tail = tail.next;
		}
		return head;
	}
	public static void printlist(Node n)
	{
		while(n != null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	public static void main(String args[])
	{
	        int t = sc.nextInt();
        while(t-->0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			Node head1 = inputList(n);
			Node head2 = inputList(m);
			
			Node result = findIntersection(head1, head2);
			printlist(result);
			System.out.println();
			
			
		}			
	}
}