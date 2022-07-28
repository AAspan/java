import java.util.ArrayList;
public class RingBuffer {
	  public static void main(String[] args) {
	    Buffer b = new Buffer(5);
	    b.FurBuff(1);
	    b.FurBuff(2);
	    b.FurBuff(3);
	    b.FurBuff(4);
	    b.showBuffer();
	    int x = b.empty(); 
	    // Checking for empty data in furbuff
	        if(x != -1) { 
	      System.out.print("Deleted value = "); 
	      System.out.println(x); 
	    }
	    x= b.empty(); 
	    // Checking for empty furbuff 
	        if(x != -1) { 
	      System.out.print("Deleted value = "); 
	      System.out.println(x); 
	    }
	    b.showBuffer();
	    b.FurBuff(9);
	    b.FurBuff(20);
	    b.FurBuff(5);
	    b.showBuffer();
	    b.FurBuff(12);
	  }
	}
class Buffer {
  public int size, front, rear;
  private ArrayList<Integer> buffer = new ArrayList<Integer>(); 
  // Declares array of integer types. 
  Buffer(int size) { // Constructor
    this.size = size;
    this.front = this.rear = -1;
  }
 public void FurBuff(int data) {
        if((front == 0 && rear == size - 1) || 
        (rear == (front - 1) % (size - 1))) 
        {  // Condition for when the buffer is full. 
                System.out.print("Buffer is Full"); 
        } 
        else if(front == -1){ // condition for when the buffer is empty
                front = 0; 
                rear = 0; 
                buffer.add(rear, data); 
        } 
        else if(rear == size - 1 && front != 0) { 
                rear = 0; 
                buffer.set(rear, data); 
        } 
        else{ 
                rear = (rear + 1); 
                if(front <= rear) {  // Adds a new element 
                        buffer.add(rear, data); 
                } 
                else{ // for updating old values
                        buffer.set(rear, data); 
                } 
        } 
  }
  public int empty() 
{ 
                int ring; 
        if(front == -1) {   // Condition for empty buffer. 
                System.out.print("Buffer is Empty");  
                return -1; 
        } 
        ring = buffer.get(front); 
        if(front == rear)       {  // Condition for only one element 
                front = -1; 
                rear = -1; 
        } 
        else if(front == size - 1) { 
                front = 0; 
        } 
        else{ 
                front = front + 1; 
        } 
        return ring; // Returns the deleted element 
} 


  public void showBuffer() {

    // Condition for empty buffer.
    if(front == -1) {
      System.out.print("Buffer is Empty");
      return;
    }
    else
    {
      System.out.print("Elements in the " + "RingBuffer: ");
      int b=front;
      while(b!=rear){
        System.out.print(buffer.get(b)+",");
        System.out.print(" ");
        b=(b+1)%size;
      }
      System.out.print(buffer.get(b));
      System.out.print(" ");
    }
    System.out.println();
  }
}

