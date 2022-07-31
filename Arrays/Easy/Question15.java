package Arrays.Easy;
import java.util.*;
public class Question15 {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j || i+j==mat.length-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
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
            int sum=diagonalSum(mat);
            System.out.println(sum);
        }
}
}
