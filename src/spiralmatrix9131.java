/*Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

        Example 1:

        Input:
        [
        [ 1, 2, 3 ],
        [ 4, 5, 6 ],
        [ 7, 8, 9 ]
        ]
        Output: [1,2,3,6,9,8,7,4,5]*/

import java.util.*;

public class spiralmatrix9131 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int matrixSize = matrix.length * matrix[0].length;
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        List<Integer> soln = new ArrayList<>();
        while (soln.size() < matrixSize) {

            System.out.println(" top :" + top + "  bottom :" + bottom);
            System.out.println(" left :" + left + "  right :" + right);
            System.out.println(" listsize :" + soln.size() + "  matrixSize :" + matrixSize);
            System.out.println(soln);
            System.out.println("**************************************************************");

            for (int j = left; j <= right && soln.size() < matrixSize; j++) {
                System.out.println(" leftincreasing :" + j + "  right :" + right);
                soln.add(matrix[top][j]);
            }

            System.out.println(" top :" + top + "  bottom :" + bottom);
            System.out.println(" left :" + left + "  right :" + right);
            System.out.println(" listsize :" + soln.size() + "  matrixSize :" + matrixSize);
            System.out.println(soln);
            System.out.println("**************************************************************");


            top++;

            for (int i = top; i <= bottom && soln.size() < matrixSize; i++) {
                System.out.println(" topincreasing :" + i + "  bottom :" + bottom);
                soln.add(matrix[i][right]);
            }
            System.out.println(" top :" + top + "  bottom :" + bottom);
            System.out.println(" left :" + left + "  right :" + right);
            System.out.println(" listsize :" + soln.size() + "  matrixSize :" + matrixSize);
            System.out.println(soln);
            System.out.println("**************************************************************");
            right--;

            for (int j = right; j >= left && soln.size() < matrixSize; j--) {
                System.out.println(" rightdecreasing :" + j + "  left :" + left);
                soln.add(matrix[bottom][j]);
            }
            System.out.println(" top :" + top + "  bottom :" + bottom);
            System.out.println(" left :" + left + "  right :" + right);
            System.out.println(" listsize :" + soln.size() + "  matrixSize :" + matrixSize);
            System.out.println(soln);
            System.out.println("**************************************************************");
            bottom--;

            for (int i = bottom; i >= top && soln.size() < matrixSize; i--) {
                System.out.println(" bottomdecreasing :" + i + "  top :" + top);
                soln.add(matrix[i][left]);
            }
            left++;
            System.out.println(" top :" + top + "  bottom :" + bottom);
            System.out.println(" left :" + left + "  right :" + right);
            System.out.println(" listsize :" + soln.size() + "  matrixSize :" + matrixSize);
            System.out.println(soln);
            System.out.println("**************************************************************");

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

