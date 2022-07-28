public class LinkedList { 
	static Node head; 
public static class Node { 

		int data; 
		Node next; 

		Node(int d) //Node Constructor
		{ 
			data = d; 
			next = null; 
		} 
	} 
	/* Function to reverse the linked list */
Node reverse(Node node) 
	{ 
	Node prev = null; 
        Node next = null; 
        Node current = node; 
             while (current != null) { 
             next = current.next; 
             current.next = prev; 
             prev = current; 
             current = next;
	} 
		node = prev;
		return node;
	}
	// prints content of double linked list 
	void printList(Node node) 
	{ 
	  while (node != null) { 
          System.out.print(node.data + " "); 
          node = node.next; 
	  	}
	} 
	public static void main(String[] args) 
	{ 
		LinkedList list = new LinkedList(); 
		list.head = new Node(1); 
		list.head.next = new Node(2); 
		list.head.next.next = new Node(3); 
		list.head.next.next.next = new Node(4); 

		System.out.println("Given Linked list."); 
		list.printList(head); 
		head = list.reverse(head); 
		System.out.println(""); 
		System.out.println("Reversed linked list. "); 
		list.printList(head);
 
	} 
} 
