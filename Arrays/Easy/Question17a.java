// Transpose of n*n matrix

package Arrays.Easy;
import java.util.*;
public class Question17a {
    public static int[][] transpose(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(j>i){
                    int swap=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=swap;
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Matrix: ");
            int n=sc.nextInt();
            int mat[][]=new int[n][n];
            System.out.println("Enter Elements in Array: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            int sum[][]=transpose(mat);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.println(sum[i][j]);
                }
            }
        }
    }
}
