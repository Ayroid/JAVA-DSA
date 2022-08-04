package Searching.PracticeQuestions;
import java.util.*;
public class FloorOfNumber {
    public static int floorBinarySearch(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        int floor=Integer.MIN_VALUE;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
                floor=arr[mid];
            }
        }
        return floor;
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
            System.out.print("Enter Element whose floor is to be found: ");
            int target=sc.nextInt();
            System.out.println("Floor of Number is "+floorBinarySearch(arr, target));
        }
    }
}
