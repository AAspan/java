public class MinHeap
{ 

public static void main (String[] args) {
	  
	int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
	int m = arr.length;

	if(m == 0) {
	return;
	}
System.out.print("Min Heap Array: ");
	for(int a = 0; a < m; a++)
System.out.print(arr[a] + " ");
minMax(arr);

System.out.print("\nMax Heap Array: ");
	for(int x = 0; x < m; x++)
System.out.print(arr[x] + " ");
	
	}

public static void minMax(int arr[]) {
int a = arr.length; // max-heap
  
// all internal nodes
for (int p = (a-2) / 2; p >= 0; p--)
heap(arr, p, a);
} 

public static void heap(int arr[], int index, int h) { //function
	int le = 2 * index + 1; 
	// left node
	int ri = 2 * index + 2; 
	// right node
	int large = index; 
	// stores the largest value node
	  
	if (le < h && arr[le] > arr[index])
	large = le;
	  
	if (ri < h && arr[ri] > arr[large])
	large= ri;
	  
	if (large!= index) {
	// swaps values
	int swap = arr[index];
	arr[index] = arr[large];
	arr[large] = swap;
	heap(arr, large, h);
	}
  }
}
