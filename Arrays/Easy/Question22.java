package Arrays.Easy;
import java.util.*;
public class Question22 {
    public static int[] sumZero(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; ++i)
            A[i] = i * 2 - n + 1;
        return A;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            System.out.println(sumZero(sc.nextInt()));
        }
    }
}
