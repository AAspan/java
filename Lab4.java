import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Lab4 {
	    public static void main(String args[]) {

	        String s1;
	        //stores input to string
	        Scanner sc = new Scanner(System.in);
	        //Scanner class reads the data

	        System.out.print("Input: s1 = ");//asks for input
	        s1 = sc.nextLine(); 
	        //method to read string

	        boolean ans = checkPalindrome(s1); 
	        //method checks for palindrome

	        System.out.println("Output: " + ans);
	        //answers true or false 
	    }

	    public static boolean checkPalindrome(String s1){
	        Stack<Character> s= new Stack<Character>();
	        //Stack is created
	        Queue<Character> q = new LinkedList<Character>();
	        //Queue is created

	        int i;
	        //inserts data into the stack
	        //inserts data into the queue
	        for(i=0;i<s1.length();i++){
	            s.push(s1.charAt(i));
	            //push data onto stack
	            q.add(s1.charAt(i));
	            //add data in queue
	        }

	        boolean ans = true;

	        //loop till there is data in queue and stack        
	        //queue will remove characters from string in left to right manner
	        while(!q.isEmpty()){
	            if(q.remove().equals(s.pop())){ //remove first character from queue and pop last element from stack
	            	//stack will remove characters from string in right to left manner
	                continue;
	            }
	            else{ //when both characters are not same then string is not palindrome 
	                ans = false;
	                break;
	            }
	        }
	        return ans;
	    }
	}