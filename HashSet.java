public class HashSet
{ 
public static void main(String[] args) {
          //creates the object
MainHashSet HashSet=new MainHashSet();
          //insert integers to hashset
		  HashSet.input(7);        
          HashSet.input(0);       
          HashSet.input(4);      
          HashSet.input(8);
          HashSet.input(3);
  
String messageContains=HashSet.content(1);          
System.out.println(messageContains);
 //checks if input exists and stores it 
messageContains=HashSet.content(8);    
System.out.println(messageContains);        
//removes and stores then return value
String Mes=HashSet.remove(6);     
System.out.println(Mes);         
//removes and stores then return value
Mes=HashSet.remove(7);       
System.out.println(Mes);
       
        }
}