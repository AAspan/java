import java.util.ArrayList;
public class PopQuiz {

public static void main(String[] args) {
	System.out.println("Pop Quiz Programming");
		   Nodee head = new Nodee(1);
		   head.next = new Nodee(2);
		   head.next.next = new Nodee(3);
		    head.next.next.next = new Nodee(1);
		     head.next.next.next.next = new Nodee(2);
		     printLinkedList(head);
		     head=getUnique(head);
		      printLinkedList(head);
		  }
public static Nodee getUnique(Nodee head){

//	INSERT CODE HERE //
	 Nodee rem = null, ove = null, dup = null; 
     rem= head; 

     //Picks elements
     while (rem != null && rem.next != null) { 
         ove = rem; 

         //Compare the element picked 
         while (ove.next != null) { 

             //if element is more than once deletes it 
             if (rem.item == ove.next.item) { 

                 dup = ove.next; 
                 ove.next = ove.next.next; 
                 System.gc(); 
             } else { 
                 ove = ove.next; 
             } 
         } 
         rem = rem.next; 
     } 
     return head;
}


public static void printLinkedList(Nodee head){

	for( Nodee cur = head;cur!=null;cur=cur.next)
    {
      System.out.print(cur.item+" ");
    }
    System.out.println();
  }
}
