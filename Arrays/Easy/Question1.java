package Arrays.Easy;
import java.util.*;
public class Question1 {
    public static int[] permutation(int num[]){
        int arr[]=new int[num.length];
        for(int i=0;i<num.length;i++){
            arr[i]=num[num[i]];
        }
        return arr;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            System.out.print("Enter Size of Array: ");
            int size=sc.nextInt();
            int num[]=new int[size];
            System.out.print("Enter Elements in Array: ");
            for(i=0;i<size;i++){
                num[i]=sc.nextInt();
            }
            int arr[]=permutation(num);
            System.out.print("Permutated Array: ");
            for(i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
