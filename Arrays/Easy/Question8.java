package Arrays.Easy;
import java.util.*;
public class Question8 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    arr[i]++;
                }
            }
        }
        return arr;
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
            int nums[]=smallerNumbersThanCurrent(arr);
            for(i=0;i<size;i++){
                System.out.print(nums[i]+" ");
            }
        }
    }
}
