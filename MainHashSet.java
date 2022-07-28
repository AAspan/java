public class MainHashSet {
    class Node {//creates the node class
       int data;
        Node next;
        Node(int No) {
            this.data = No;
        }
    }
    
//declare array of node
private Node[] NodeArray;
private int length;
    public MainHashSet() {
        length = 100;// size of values in the hashset
        NodeArray= new Node[length];
        for (int n = 0; n < length; n++) {
 //stores the node with max value 
        	NodeArray[n] = new Node(-1);
        }      
 }
 // reads the values 
public void input(int yeager) { // values in the hashset
        int in = yeager% length;
        //get the node from that index
        Node ValueStored = NodeArray[in];
        if (ValueStored == null) {
            // references the ValueStored to the new node with values
        	ValueStored=new Node(yeager);     
   } else {
  // currentNode.next in not null and data of that is not equal to values
 while (ValueStored.next != null && ValueStored.next.data != yeager) {
                // then move to next
	 ValueStored = ValueStored.next;
}
if (ValueStored.next != null && ValueStored.next.data==yeager) {
	return;
}else {// if the value is not present and next of currentNode is null
	ValueStored.next = new Node(yeager);         
	}
  }
}
    
 public String content(int values) {// values in the hashset
        int in = values % length; //gets the node from the NodeArray
        Node content = NodeArray[in];
        //traverse until you wont find the node with
 while (content.next != null && content.next.data != values) {
	 content= content.next;
        }
        // if value found then return the message as true
 if(content.next != null)
    return "true.";
else //if value is not found return message
  return "Hey Nothing there.";
 }
    
     
     //define the remove method
 public String remove(int values) {// values in the hashset 
   int in = values % length;
        //gets the first node present in int in
        Node content = NodeArray[in];
        // traverse until you wont find the node with particular value
    while (content.next != null && content.next.data != values) 
        {  
    content = content.next;
 }
        // if the value found then deletes pointer 
   if (content.next != null && content.next.data==values) 
 {   
   content.next = content.next.next;
            //returns with message Removed
  return "Removed.";
 }
  else{// if value is not found
  return "Hey value does not exist at all.";
        }             
    }
}

