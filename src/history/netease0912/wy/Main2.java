package history.netease0912.wy;

import java.util.Scanner;

/**
 * 编辑距离
 * @author wangyao2221
 * @date 2020/9/12 16:15
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stopWordsString = sc.nextLine();
        String[] stopWords = stopWordsString.split(" ");
        String A = sc.nextLine();
        String B = sc.nextLine();

        for (int i = 0; i < stopWords.length; i++) {
            A = A.replace(stopWords[i] + " ", "");
            B = B.replace(stopWords[i] + " ", "");
        }

        while (A.charAt(0) == ' ') {
            A = A.substring(1, A.length());
        }

        while (B.charAt(0) == ' ') {
            B = B.substring(1, B.length());
        }

        String[] AS = A.split(" ");
        String[] BS = B.split(" ");

        System.out.println(minDistance(AS, BS));
    }

    public static int minDistance(String[] AS, String[] BS) {
        int len1 = AS.length;
        int len2 = BS.length;

        int[][] dp = new int[len1 + 1][len2 + 2];
        for (int i = 0; i <= len1; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i <= len2; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (AS[i - 1].equals(BS[j - 1])) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                }
            }
        }

        return dp[len1][len2];
    }
}
