package Arrays.Easy;
import java.util.*;
public class Question7 {
    public static int numIdenticalPairs(int[] nums) {
        int i,j,good=0;
        for(i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    good+=1;
                }
            }
        }
        return good;
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
            int good=numIdenticalPairs(arr);
            System.out.println("Total Good Pairs: "+good);
        }
    }
}