public class onedto2darray813 {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != n * m) {

            return new int[0][0];
        }
        int[][] twodarray = new int[m][n];
        int current = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                twodarray[row][col] = original[current++];
            }
        }
        return twodarray;
    }

    public static void main(String[] args) {

        //int[][] image = {};
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = construct2DArray(original, m, n);


        System.out.println("Flattened array ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }

    }

}