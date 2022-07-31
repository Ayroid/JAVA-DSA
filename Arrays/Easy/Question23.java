package Arrays.Easy;
import java.util.*;
public class Question23 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int i,j;
        ArrayList<Integer> arl=new ArrayList<Integer>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(i=0;i<matrix.length;i++){
            int smallest=matrix[i][0];
            for(j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
            }
            arl.add(smallest);
        }
        for(i=0;i<matrix[0].length;i++){
            int largest=matrix[0][i];
            for(j=0;j<matrix.length;j++){
                if(matrix[j][i]>largest){
                    largest=matrix[j][i];
                }
            }
            if(arl.contains(largest)){
                arr.add(largest);
            }
        }
        return arr;
    }
}
