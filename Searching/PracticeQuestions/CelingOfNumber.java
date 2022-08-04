package Searching.PracticeQuestions;
import java.util.*;
public class CelingOfNumber {
    public static int celingBinarySearch(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        int ceil=Integer.MAX_VALUE;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
                ceil=arr[mid];
            }
            else{
                start=mid+1;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array: ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.print("Enter Elements in Array: ");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Enter Element whose ceiling is to be found: ");
            int target=sc.nextInt();
            System.out.println("Ceiling of Number is "+celingBinarySearch(arr, target));
        }
    }
}
