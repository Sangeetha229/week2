public class flatten2dArray8121 {

    static int[] flatten(int[][] array) {
        if (array.length == 0) return new int[0];
        int n = array.length;//rows
        int m = array[0].length;//columns
        int[] flat = new int[n * m];
       // int i=0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                flat[row * m + col] = array[row][col];
               // flat[i++] = array[row][col];
            }
        }
        return flat;
    }

    public static void main(String[] args) {
        /*int[][] image = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };*/
        //int[][] image = {};
        int[][] image = {{1, 2}, {1, 3}, {5, 4}};
        int[] result = flatten(image);


        System.out.println("Flattened array ");
        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");
            //System.out.println();
        }

    }
}