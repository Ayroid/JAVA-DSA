package Arrays.Easy;
import java.util.*;
public class Question3 {
    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            System.out.print("Enter Size of Array: ");
            int size= sc.nextInt();
            int arr[]=new int[size];
            System.out.print("Enter Elements in Array: ");
            for(i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            int nums[]=runningSum(arr);
            System.out.print("Running Sum Array: ");
            for(i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
        }
    }

}
