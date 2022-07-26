package Arrays.Easy;

import java.util.Scanner;

public class Question2 {
    public static int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[nums.length+i]=nums[i];
        }
        return ans;
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
            int nums[]=getConcatenation(arr);
            System.out.print("Concatenated Array: ");
            for(i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
        }
    }
}
