import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TwoArray {
  
   public static void main(String[] args) {
       //Creates object of scanner 
       Scanner scannerFiArray = new Scanner(System.in); 
       System.out.println("(Enter spaces between integers)");
       System.out.println("Enter first array numbers:");
       //numbers to String array
       String[] firstArray = scannerFiArray.nextLine().split(" ");
      
       //Creates object of scanner 
       Scanner scannerSeArray = new Scanner(System.in);      
   
       System.out.println("Enter second array numbers:");
      
       String[] secondArray = scannerSeArray.nextLine().split(" ");

       HashSet<String> set = new HashSet<>();
       //Adds first Array
       set.addAll(Arrays.asList(firstArray));
       //keeps second Array element 
       set.retainAll(Arrays.asList(secondArray));
     
       String[] intersec = {};   // converts to array
       intersec = set.toArray(intersec);
       System.out.println("Input: Num1 = "+Arrays.toString(firstArray)
       +System.lineSeparator()+"       Num2 = "+Arrays.toString(secondArray));
       System.out.println(" ");
       System.out.println("Output: "+Arrays.toString(intersec));
   }
}