package Arrays.Easy;
import java.util.*;
public class Question4 {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i,j;
                System.out.print("Enter Size of Array: ");
                int m=sc.nextInt();
                int n=sc.nextInt();
                int arr[][]=new int[m][n];
                System.out.print("Enter Elements in Array: ");
                for(i=0;i<m;i++){
                    for(j=0;j<n;j++){
                        arr[i][j]=sc.nextInt();
                    }
                }
                int maxWealth=maximumWealth(arr);
                System.out.print("Maximum Wealth: "+maxWealth);
        }
    }
}
