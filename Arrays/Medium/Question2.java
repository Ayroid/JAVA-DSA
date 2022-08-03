package Arrays.Medium;
public class Question2 {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int x=1;
        
        int rowBegin=0;
        int rowEnd=n-1;
        int colBegin=0;
        int colEnd=n-1;
        
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            
            for(int i=colBegin;i<=colEnd;i++){
                    arr[rowBegin][i]=x;
                    x++;
            }
            rowBegin++;
            
            for(int i=rowBegin;i<=rowEnd;i++){
                    arr[i][colEnd]=x;
                    x++;
            }
            colEnd--;
            
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--){
                    arr[rowEnd][i]=x;
                    x++;
            }
            rowEnd--;
            }
            
            if(colBegin<=colEnd){
            for(int i=rowEnd;i>=rowBegin;i--){
                    arr[i][colBegin]=x;
                    x++;
            }
            colBegin++;
            }
        }
        return arr;
    }
}
