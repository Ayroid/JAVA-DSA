package Searching.PracticeQuestions;
import java.util.*; // INCOMPLETE
public class GreaterLetter {
    public static char greaterCharBinarySearch(char letters[], char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array: ");
            int size=sc.nextInt();
            char arr[]=new char[size];
            System.out.print("Enter Characters in Array: ");
            for(int i=0;i<size;i++){
                arr[i]=sc.next().charAt(0);
            }
            System.out.print("Enter Character whose ceiling is to be found: ");
            char target=sc.next().charAt(0);
            System.out.println("Ceiling of Character is "+greaterCharBinarySearch(arr, target));
        }
    }
}
