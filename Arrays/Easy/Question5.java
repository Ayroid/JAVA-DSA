package Arrays.Easy;
import java.util.*;
class Question5 {
    public static int[] shuffle(int[] nums, int n) {
        int i=0,j=0;
        int arr[]=new int[nums.length];
        for(i=0;i<n;i++){
            arr[j]=nums[i];
            arr[j+1]=nums[i+n];
            j+=2;
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
            int nums[]=shuffle(arr,size/2);
            System.out.print("Shuffled Array: ");
            for(i=0;i<size;i++){
                System.out.print(nums[i]+" ");
            }
        }
    }
}
