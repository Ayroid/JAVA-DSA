package Searching;
import java.util.*;
public class LinearSearch {

    public static int linearSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
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
            System.out.println("Element found at Index: "+linearSearch(arr, target));
        }
    }
}
