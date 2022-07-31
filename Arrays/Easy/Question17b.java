package Arrays.Easy;
import java.util.*;
public class Question17b {
    public static int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int transpose[][]=new int[n][m];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
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
