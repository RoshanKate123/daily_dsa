import java.util.*;
class RemoveDupLL
{
	static class Node{
		int data;
		Node next ;
		Node(int data)
		{
			this.data = data;
			next = null;
			
		}
		Node head ;
		Node temp;
		public Node removeDuplicates(Node node)
		{
	      if(node == null || node.next == null)
	         {
				 return head;
	         }		
			 
			 HashSet<Integer> hs = new HashSet<>();
			 Node temp = node;
			 Node prev = null;
			 while(temp != null)
			 {
				 if(hs.contains(temp.data))
				 {
				   temp = temp.next;
				   prev.next = temp;
				 }
				 else
				 {
					 hs.add(temp.data);
					 prev = temp;
					 temp = temp.next;
					 
				 }
			 }
			 return node;
		}
		
		public  void addToLast(Node head)
		{
			if(head == null)
			{
				head == node;
				temp = node
			}
			else
			{
				temp.next = node;
				temp = node;
			}
			
		}
		
	 void  printList(PrintWriter out)
		{
			
			Node temp = head;
			while(temp != null)
			{
				out.print(temp.data+" ");
				temp = temp.next;
			}
			out.println();
		}
	}
	public static void main(String args[]) throws IOException
	{
			
       BufferedReader br = new BufferedReader(System.in);
	   PrintWriter out = new PrintWriter(System.out);
	   int t = Integer.parseInt(br.readLine().trim());
	   
	   while(t-->0)
	   {
		   int n = Integer.parseInt(br.readLine().trim());
		   RemoveDupLL ll = new RemoveDupLL();
		   String s[] = in.readLine().trim().split(" "); 
		   int a1 = Integer.parseInt(s[0]);
		   Node head = new Node(a1);
		   ll.addToLast(head);
		   for(int i=0; i<n;i++)
		   {
			   int a = Integer.parseInt(s[i]);
			   ll.addToLast(new Node(a));
		   }
		   
		   out.Println(ll.removeDuplicates(head));
		   ll.printList(out);
		   
	   }
	   out.close();
}