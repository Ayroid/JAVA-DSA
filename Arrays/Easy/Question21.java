package Arrays.Easy;
import java.util.*;
public class Question21 {
    public static int[] twoSum(int[] nums, int target) {
        int num[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    num[0]=i;
                    num[1]=j;
                    break;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Length of Array: ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter elements: ");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter Target: ");
            int target=sc.nextInt();
            int num[]=twoSum(arr, target);
            for(int i=0;i<size;i++){
                System.out.println(num[i]);
            }
        }
    }
}
