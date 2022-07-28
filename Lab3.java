import java.util.Stack;
public class Lab3
{
    public static void main(String args[])
    {
        String s1 = "DataStructuresissss###Fun";
        String s2 = "DataStructuresissss###Fun";
        boolean ans = backspaceCompare(s1,s2);
        System.out.println(ans);
    }
    public static boolean backspaceCompare(String s1,String s2)
    {
        Stack<Character> s1_stack = new Stack<Character>();
        Stack<Character> s2_stack = new Stack<Character>();
        int backspaceCount; 
        //backspaceCount variable to count back space 
        for(backspaceCount = 0;backspaceCount<s1.length();backspaceCount++)
        	//Pushing string 1 to stack
        {
            s1_stack.push(s1.charAt(backspaceCount));
        }
        for(backspaceCount = 0;backspaceCount<s2.length();backspaceCount++)
        	//Pushing string2 to stack
        {
            s2_stack.push(s2.charAt(backspaceCount));
        }
        boolean test = true;
        while(!s1_stack.isEmpty())
        	// Checking for the stacks has same character
        {
            if(s1_stack.pop()!=s2_stack.pop())
            {
                test = false;
                break;
            }
        }
        return test;
    }
}