package Arrays.Easy;
import java.util.*;
public class Question13 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int i,j;
        for(i=0;i<image.length;i++){
            int temp[]=new int[image.length];
            for(j=0;j<image[i].length;j++){
                temp[image.length-1-j]=(image[i][j]+1)%2;
            }
            image[i]=temp;
        }
        return image;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of 2D Array: ");
            int m=sc.nextInt();
            int n=sc.nextInt();
            int arr[][]=new int[m][n];
            System.out.println("Enter Element in Array: ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int fi[][]=flipAndInvertImage(arr);
            System.out.println("Fipped Image: ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(fi[i][j]+" ");;
                }
                System.out.println();
            }
        }
    }
}
