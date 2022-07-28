import java.util.Stack;
/* This is a user defined stack which supports getMin() in addition to push() and pop() */
public class MyStack
{
Stack<Integer> s;
	Integer min;
	/* This is the Constructor */
	MyStack() {
 s = new Stack<Integer>();
 } 
    // Prints minimum element of MyStack 
	void getMin(){
		/* This will get minimum number from the entire stack */
		if (s.isEmpty())
			System.out.println("Stack is empty");
		/* The variable min will store the minimum element in the stack.*/
		else 
			System.out.println("Minimum Element in stack:" + min);
	System.out.println(" ");
    } 
    // prints top element of MyStack 
void peek() 
	{
		if (s.isEmpty())
		{
			System.out.println("Stack is empty ");
		return;
		}
		Integer t = s.peek(); 
		/* Top element */
		System.out.print("Top Element is: ");
		/* If m < min means min stores value of t. */
		if (t< min)System.out.println(min);
		else 
			System.out.println(t);
}        
    // Removes the top element from MyStack 
void pop(){
if (s.isEmpty())
{
System.out.println("Stack is empty");
	return;}  
System.out.print("Top Element Removed: ");
	Integer x = s.pop();  
        // Minimum will change as the minimum element 
        // of the stack is being removed. 
        if (x < min){
		System.out.println(min);
min = 2*min - x;}
	else 
		System.out.println(x);
}
    // Insert new number into MyStack 
    void push(Integer d)
	{
		if (s.isEmpty())
		{
			min = d;
		s.push(d);
		System.out.println("Number: " + d);
		return;
}
     // If new number is less than original minimum
if (d < min){
			s.push(2*d - min);
			min = d;
			}
		else
			s.push(d);
		System.out.println("Number: " + d);
		}  
  
// Driver Code 
    public static void main(String[] args) 
    {   MyStack s = new MyStack(); 
        s.push(3); 
        s.push(5); 
        s.getMin(); 
        s.push(2); 
        s.push(1); 
        s.getMin(); 
        s.pop(); 
        s.getMin(); 
        s.pop(); 
        s.peek(); 
    } 
}
