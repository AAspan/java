import java.util.*;
public class Matrix {
   public static void main(String[] args) {
       Scanner mx = new Scanner(System.in);    
       Random m = new Random();
 System.out.println("Type number of dimensions:");
 int n = mx.nextInt();
 int matr[][] = new int[n][n];
 int matr1[][] = new int[n][n];
 // filling the two matrices with random numbers ranging from 0-50
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
     matr[i][j] = m.nextInt(51);
     matr1[i][j] = m.nextInt(51);
           }
       }
       // Displaying two matrices
System.out.println("Matrix 1 is:");
System.out.print("[");
       for (int i = 0; i < n; i++) {
System.out.print("[");
       for (int j = 0; j < n-1; j++) {
System.out.print(matr[i][j] + ", ");
           }
System.out.println(matr[i][n-1] + "]");
       }
System.out.println("");
System.out.println("Matrix 2 is:");
System.out.print("[");
       for (int i = 0; i < n; i++) {
System.out.print("[");
       for (int j = 0; j < n-1; j++) {
System.out.print(matr1[i][j] + ", ");
           }
System.out.println(matr1[i][n-1] + "]");
       }
       int result[][] = new int[n][n];
       // multiplying the matrices
       for (int i = 0; i < n; i++) {
       for (int j = 0; j < n; j++) {
               result[i][j] = 0;
       for (int k = 0; k < n; k++) {
                   result[i][j] += matr[i][k] * matr1[k][j];
               }
           }
       }
       // Displaying the result matrix
System.out.println("");
System.out.println("Result matrix:");
System.out.print("[");
       for (int i = 0; i < n; i++) {
System.out.print("[");
       for (int j = 0; j < n-1; j++) {
System.out.print(result[i][j] + ", ");
           }
System.out.println(result[i][n-1] + "]");
       }
   }
}
