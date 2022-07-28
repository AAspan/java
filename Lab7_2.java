import java.util.*;
public class Lab7_2 {
	
public static void main(String[] args){
System.out.println("Shiraj really gives us too many labs. He is seriously annoying.");
String str= "I like queues but queues do not like me"; 

ArrayList<String> toIgnore = new ArrayList<String>(); 
toIgnore.add("stacks");
System.out.println(getMostCommanWord(str,toIgnore)); // should return "like"
}
private static String getMostCommanWord(String str, ArrayList<String> toIgnore) {
    int  Count = 0;
    String Value= " ";
    String arr[]=str.split(" ");
    for (int d = 0; d < arr.length; ++d) {
            int count = 0;
            // if the word in ignore list skip it
            if(toIgnore.contains(arr[d]))
                    continue;
            for (int s = 0; s < arr.length; ++s) {
                    
                    if (arr[s].equals(arr[d]))
                            ++count;
            }
            if (count > Count) {
                    Count = count;
                    Value = arr[d];
            }
    }

    return Value;
}


}
