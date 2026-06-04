public class reshapemat {
     public int[][] matrixReshape(int[][] mat, int r, int c) {
     if(r*c!=mat.length * mat[0].length) return mat;
        int res[][]=new int[r][c];
        int i=0,j=0,a=0,b=0;;

        while(i<mat.length&&a<r){
            res[a][b]=mat[i][j];
            b++;
            j++;
            if(b==c)
            {
                a++;
                b=0;
            }
            if(j==mat[0].length)
            {
                i++;
                j=0;
            }
        }
        return res;
    }  

}
