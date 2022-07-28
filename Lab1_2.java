import java.util.Stack;
public class Lab1_2 {
        public static void main(String[] args) {        
                runForInput("{}{{{{}}");
                runForInput("{{{}}}");          
        }     
public static void runForInput(String str) {          
                boolean ans = isbalanced(str);               
                System.out.println("\n");
                System.out.println("Input: str = \"" + str + "\"");
                System.out.println("Output: " + ans);             
        }
        private static boolean isbalanced(String str) {             
                Stack<Character> stack = new Stack<Character>();              
                for(int i = 0; i < str.length(); i++) {                      
                        char current = str.charAt(i);                  
                        if(current == '{') {
                                stack.push(current);
                        }                        
                        if(current == '}') {                                                   
                                if(stack.isEmpty() == true) {
                                        return false;
                                        
                                } else {
                                        stack.pop();
                                }
                        }
                }
                
  //At this point, we are done processing the string and the stack must be empty.
                if(stack.isEmpty()) {
                        return true;
                }
                
                return false;
        }
}
