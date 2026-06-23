package apnaCollege;

//Remove duplictaes from the sorted list 
public class removeDuplicates 
{
		public static class Node
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
		public static void removedup()
		{
			Node i,j;
			Node temp = head;
			while(temp.next != null)
			{
				if(temp.data == temp.next.data)
				{
					temp.next = temp.next.next;
				}
				else
					temp = temp.next;
			}
		}
		public void print()
		{
			if(head == null) {
				System.out.println("Linked list is empty");
				return;
			}
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

	public static void main(String[] args) {
		removeDuplicates ll = new removeDuplicates();
		ll.addLast(1);
		ll.addLast(1);
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(4);
		ll.addLast(4);
		ll.addLast(5);
		ll.removedup();
		ll.print();
	}
}

