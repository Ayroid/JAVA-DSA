// Index out of bound exception is occuring if range gets in the last half of array
package Searching.PracticeQuestions;
import java.util.*;
public class SearchingInInfiniteArray {
    public static int ans(int arr[],int target){
        int start=0;
        int end=1;
        //int n=2;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp; //end=end+(int)(Math.pow(2,n++)); 
        }
        return search(arr, target, start, end);
    }

    public static int search(int arr[],int target, int start, int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array: ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.print("Enter Numbers in Array: ");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Enter Element to be Searched: ");
            int target=sc.nextInt();
            System.out.println(ans(arr, target));
        }
    }
}
