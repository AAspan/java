import java.util.Arrays;
import java.util.HashSet;

public class Lab5Paer2 {

public static void main(String []args){

int[] arr = {1, 5, 3, 4, 2};
int k = 3;
long start = System.currentTimeMillis();

System.out.println("Count is "+ solve_with_Hash(arr,k)); // should be 2 
System.out.println("Total execustion time (taken by solve_with_Hash):"

+(System.currentTimeMillis()-start));


start = System.currentTimeMillis();

System.out.println("\n\nCount is "+ solve_with_Sort(arr,k)); // should be 2 
System.out.println("Total execustion time (taken by solve_with_Sort):"

+(System.currentTimeMillis()-start));

}


public static int solve_with_Sort(int[] arr, int k){ int counter = 0;
// INSERT CODE HERE
int count = 0;
int left = 0, right = 0;
Arrays.sort(arr);

while(right < arr.length) {
        int sort = arr[right] - arr[left];
        
        if(sort == k) {
                left++; right++; count++;
        } else if(sort < k) {
                right++;
        } else {
                left++;
        }
}
return count;
}

public static int solve_with_Hash(int[] arr, int k){
	int counter = 0;
HashSet<Integer> hash = new HashSet<Integer>();

// INSERT CODE HERE
for(int a: arr) {
    hash.add(a);
}
for(int o: arr) {
    if(hash.contains(o + k) || hash.contains(o - k)) {
            counter++;
    }
    hash.remove(o);
}
return counter;

}

}
