package Arrays.Easy;

public class Question25 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length)
        return mat;  
        int i,j;
        int reshaped[][]=new int[r][c];
        int k=0,l=0;
        for(i=0;i<mat.length;i++){
            for(j=0;j<mat[i].length;j++){
                reshaped[k][l]=mat[i][j];
                l++;
                if(l==c){
                    l=0;
                    k++;
                }
            }
        }
        return reshaped;
    }
}
