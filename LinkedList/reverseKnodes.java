package apnaCollege;
public class reverseKnodes 
{//Not Done
	static class Node
	{
		int data;
		Node next; 
		
		public Node(int data) 
		{
			this.data = data;
			this.next = null;
		}
	} 
	   public static Node head;
	   public static Node tail;
	   
	   public static void addLast(int data)
	   {
		   if(head == null) {
			   Node newNode = new Node(data);
			   head = tail = newNode;
			   return;
		   }
		   Node newNode = new Node(data);
		   tail.next = newNode;
		   tail = newNode;
	   }
	   
	   public static void reverse(Node head, int k) 
	   {
		      Node temp = head;
			  Node prev = null;
			  Node curr = temp;
			  Node next;
			  while(temp != null)
			  {
				Node newlast = prev;
	            for(int i = 1; i <= k; i++) {	  
				  next = curr.next;
				  curr.next = prev;
		    	  prev = curr;
		    	  curr = next;
		    	  temp = temp.next;
	           }
	     }
	   }
	   public static void print()
	    {
	    	if(head == null) {
	    		System.out.println("The list is empty");
	    	}
	    	Node temp = head;
	    	while(temp != null) {
	    		System.out.print(temp.data+" ");
	    		temp = temp.next;
	    	}
	    	System.out.println();
	    }

	public static void main(String[] args)
	{
		reverseKnodes ll = new reverseKnodes();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.reverse(head, 2);
		ll.print();
		
	}
}
