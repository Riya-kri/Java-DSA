package apnaCollege;
//Given the head of the linked list.....Rotate the list to right by k times
public class rotatedList 
{
	static class Node{
		int data;
		Node next; 
		
		public Node(int data) {
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
	   public static Node rotate(int k) {
		   if(head == null || head.next == null || k<=0) {
			   return head;
		   }
		   Node last = head;
		   int length = 1;
		   while(last.next != null) {
			   last = last.next;
			   length++;
		   }
		   last.next = head;
		   int rotations = k%length; //(if k is more than length)
		   int skip = length-rotations;
		   
		   Node newLast = head;
		   for(int i=0; i<skip-1; i++) {
			   newLast = newLast.next;
		   }
		   head = newLast.next;
		   newLast.next = null;
		   
		   return head;
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
	public static void main(String[] args) {
		rotatedList ll = new rotatedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.print();
		ll.rotate(2);
		ll.print();
	}
}
