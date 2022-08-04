package Searching;
import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[], int x){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int middle=(start+end)/2;
            if(arr[middle]==x){
                return middle;
            }
            else if(arr[middle]>x){
                end=middle-1;
            }
            else{
                start=middle+1;
            }
        }
        return -10;
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
            System.out.println("Element found at Index: "+binarySearch(arr, target));
        }
    }
}
