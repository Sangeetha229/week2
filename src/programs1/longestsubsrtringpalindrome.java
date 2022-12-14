package programs1;

public class longestsubsrtringpalindrome {

    public String longestPalindrome(String str) {
        int n = str.length();
        boolean dp[][] = new boolean[n][n];
        int li = -1;
        int lj = -1;

        for (int d = 0; d < n; d++) {
            for (int i = 0, j = d; j < n; i++, j++) {
                if (d == 0) {
                    //one length substring
                    dp[i][j] = true;
                } else if (d == 1) {
                    //two length substring
                    if (str.charAt(i) == str.charAt(j)) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    //more than 2 length substrings
                    dp[i][j] = str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1];
                }

                if (dp[i][j] == true) {
                    li = i;
                    lj = j;
                }
            }
        }

        return str.substring(li, lj + 1);
    }

}
