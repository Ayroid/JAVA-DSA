package Arrays.Easy;
import java.util.*;
public class Question9 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int target[]=new int[nums.length];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            target[i]=arr.get(i);
        }
        return target;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            System.out.print("Enter Size of Array: ");
            int size= sc.nextInt();
            int nums[]=new int[size];
            int index[]=new int[size];
            System.out.print("Enter Numbers: ");
            for(i=0;i<size;i++){
                nums[i]=sc.nextInt();
            }
            System.out.print("Enter Indices: ");
            for(i=0;i<size;i++){
                index[i]=sc.nextInt();
            }
            int target[]=createTargetArray(nums,index);
            for(i=0;i<size;i++){
                System.out.print(target[i]+" ");
            }
        }
    }
}
