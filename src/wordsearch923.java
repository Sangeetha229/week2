import java.util.ArrayList;
import java.util.List;

public class wordsearch923 {

    public static List<String> findWords(char[][] board, String[] words) {


        List<String> ans = new ArrayList<>();
        for (String word : words) {
            if (exists(board, word)) {
                ans.add(word);
            }
        }
        return ans;
    }


    private static boolean exists(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean dfs(char[][] board, String word, int index, int i, int j) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || word.charAt(index) != board[i][j]) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean res = dfs(board, word, index + 1, i + 1, j)
                || dfs(board, word, index + 1, i - 1, j)
                || dfs(board, word, index + 1, i, j + 1)
                || dfs(board, word, index + 1, i, j - 1);
        board[i][j] = temp;
        return res;
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String[] words = {"GIZT", "FOR", "ARE", "QUIT"};
        char[][] board = {{'G', 'I', 'Z'},
                {'A', 'U', 'T'},
                {'Q', 'S', 'E'}};

        result = findWords(board, words);

        System.out.print(result);
    }
}
