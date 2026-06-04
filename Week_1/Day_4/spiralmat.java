import java.util.ArrayList;
import java.util.List;

public class spiralmat {
     public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = 0;
        int dir = 0;
        for (int k = 0; k < m * n; k++) {
            res.add(matrix[i][j]);
            matrix[i][j] = -999;
            if (dir == 0) {
                if (j + 1 < n && matrix[i][j + 1] != -999) {
                    j++;
                } 
                else {
                    dir = 1;
                    i++;
                }
            }
            else if (dir == 1) {
                if (i + 1 < m && matrix[i + 1][j] != -999) {
                    i++;
                }
                else {
                    dir = 2;
                    j--;
                }
            }
            else if (dir == 2) {
                if (j - 1 >= 0 && matrix[i][j - 1] != -999) {
                    j--;
                } 
                else {
                    dir = 3;
                    i--;
                }
            }
            else {
                if (i - 1 >= 0 && matrix[i - 1][j] != -999) {
                    i--;
                } 
                else {
                    dir = 0;
                    j++;
                }
            }
        }
        return res;
    }

}
