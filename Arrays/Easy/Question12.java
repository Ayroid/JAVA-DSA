package Arrays.Easy;
import java.util.*;
public class Question12 {
    public static int largestAltitude(int[] gain) {
        int high=0,i,sum=0;
        for(i=0;i<gain.length;i++){
            sum+=gain[i];
            if(sum>high){
                high=sum;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Length of Array: ");
            int n=sc.nextInt();
            int gain[]=new int[n];
            for(int i=0;i<n;i++){
                gain[i]=sc.nextInt();
            }
            int highest=largestAltitude(gain);
            System.out.println(highest);
        }
    }
}
