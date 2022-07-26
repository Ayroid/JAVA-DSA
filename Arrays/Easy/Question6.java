package Arrays.Easy;
import java.util.*;
public class Question6 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i,largest=0;
        ArrayList<Boolean> lst=new ArrayList<Boolean>();
        for(i=0;i<candies.length;i++){
            if(candies[i]>largest){
                largest=candies[i];
            }
        }
        for(i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= largest){
                lst.add(true);
            }
            else{
                lst.add(false);
            }
        }
        return lst;
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
            System.out.print("Enter number of extra candies: ");
            int extraCandies=sc.nextInt();
            List<Boolean> nums=kidsWithCandies(arr,extraCandies);
            System.out.print("Shuffled Array: ");
            for(i=0;i<size;i++){
                System.out.print(nums.get(i)+" ");
            }
        }
    }
}
