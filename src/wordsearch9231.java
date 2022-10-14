import java.util.*;

public class wordsearch9231 {
    public static List<String> findWords(char[][] board, String[] words) {
        HashSet<String> res = new HashSet<>();

        for (String word : words) {
            boolean[][] visited = new boolean[board.length][board[0].length];

            int count = 0;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0) && dfs(board, i, j, count, word, visited)) {
                        res.add(word);
                        break;
                    }
                }
            }
        }
        List<String> ans = new ArrayList<>(res);

        return ans;
    }

    public static boolean dfs(char[][] board, int i, int j, int count, String word, boolean[][] visited) {
        if (count == word.length())
            return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
                board[i][j] != word.charAt(count) || visited[i][j])
            return false;

        visited[i][j] = true;

        boolean found = dfs(board, i - 1, j, count + 1, word, visited) ||
                dfs(board, i, j + 1, count + 1, word, visited) ||
                dfs(board, i + 1, j, count + 1, word, visited) ||
                dfs(board, i, j - 1, count + 1, word, visited);

        visited[i][j] = false;

        return found;
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