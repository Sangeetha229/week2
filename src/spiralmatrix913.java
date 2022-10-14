
import java.util.*;

public class spiralmatrix913 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int matrixSize = matrix.length * matrix[0].length;
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        List<Integer> soln = new ArrayList<>();
        while (soln.size() < matrixSize) {
            for (int j = left; j <= right && soln.size() < matrixSize; j++) {
                soln.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= bottom && soln.size() < matrixSize; i++) {
                soln.add(matrix[i][right]);
            }
            right--;
            for (int j = right; j >= left && soln.size() < matrixSize; j--) {
                soln.add(matrix[bottom][j]);
            }
            bottom--;
            for (int i = bottom; i >= top && soln.size() < matrixSize; i--) {
                soln.add(matrix[i][left]);
            }
            left++;
        }
        return soln;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 10}, {4, 5, 6, 11}, {7, 8, 9, 12}, {13, 14, 15, 16}};

        //String s = "i like this program very much ";
        //  char []p = reverseWords(s.toCharArray());
        List<Integer> res = new ArrayList<>();
        res = spiralOrder(matrix);
        System.out.print(res);
    }

}
