
import java.util.HashSet;
public class FindSum { 

public static void main(String args[]){ 
	int[] arr = { 1, 5, 4, 6, 7, 9 }; 
	HashSet<Integer> res = findSums(arr);  
	System.out.println(res.toString());
 

// Should return [6,5,7,9]
 
} 

public static HashSet<Integer> findSums(int[] arr){

HashSet<Integer>sums = new HashSet<Integer>();
HashSet<Integer> hashT = new HashSet<>();

for (int i = 0; i < arr.length; i++) {
    hashT.add(arr[i]);
}
for (int i = 0; i < arr.length; i++) {
    for (int j = i; j < arr.length; j++) {
        if (hashT.contains(arr[i] + arr[j])) {
            sums.add(arr[i] + arr[j]);
        }
    }
}


return sums;

}

}
