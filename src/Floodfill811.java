public class Floodfill811 {
    //static int M=8;
    //static int N=8;
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;
        int prevC = image[sr][sc];

        floodFillUtil(image, prevC, sr, sc, color);

        return image;
    }

    public static void floodFillUtil(int[][] image, int prevC, int sr, int sc, int color) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != prevC)
            return;


        image[sr][sc] = color;

        floodFillUtil(image, prevC, sr + 1, sc, color);
        floodFillUtil(image, prevC, sr - 1, sc, color);
        floodFillUtil(image, prevC, sr, sc + 1, color);
        floodFillUtil(image, prevC, sr, sc - 1, color);
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        int x = 4, y = 4, newC = 3;
        floodFill(image, x, y, newC);
        System.out.println("Updated screen after call to floodFill: ");
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++)
                System.out.print(image[i][j] + " ");
            System.out.println();
        }

    }
}
//Time complexity: O(M x N).
//   Auxiliary Space: O(M x N), as implicit stack is created due to recursion