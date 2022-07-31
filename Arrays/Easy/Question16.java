package Arrays.Easy;
import java.util.*;
public class Question16 {
    public static int findNumbers(int[] nums) {
        int ctr=0;
        for(int i=0;i<nums.length;i++){
            String s=Integer.toString(nums[i]);
            if(s.length()%2==0){
                ctr++;
            }
        }
        return ctr;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array: ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter Elements: ");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(findNumbers(arr));
        }
    }
}
