package Searching;
import java.util.*;;
public class OrderAgnosticBinarySearch {

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        boolean asc=arr[start]<arr[end];

        while(start<=end){
            int mid=(start+end)/2; // (2start-end)/2
            if(arr[mid]==target){
                return mid;
            }
            if(asc){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
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
            System.out.print("Enter Element to be Searched: ");
            int target=sc.nextInt();
            System.out.println("Element found at Index: "+orderAgnosticBinarySearch(arr, target));
        }
    }
}
