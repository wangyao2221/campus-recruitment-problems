package pdd0901;

/**
 * @author wangyao2221
 * @date 2020/9/1 20:31
 */
public class Main01 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(area(i , j, n) + " ");
            }
            System.out.println();
        }
    }

    public static int area(int i, int j, int n) {
        if (i == j) return 0;
        if (i == n - j + 1) return 0;
        if (n % 2 == 0) {
            int half = n / 2;
            if (i <= n / 2 && j <= n / 2) {
                if (i > j) return 2;
                else return 3;
            } else if(i > n / 2 && j <= n / 2) {
                if (j - half > i) return 1;
                else return 8;
            } else if (i <= n / 2 && j > n / 2) {
                if (j - half < i) return 7;
                else return 6;
            } else if (i > n / 2 && j > n / 2) {
                if (j - half > i) return 5;
                else return 4;
            }
        } else {
            if (i == (n + 1) / 2) {
                return 0;
            }  else if (j == (n + 1) / 2){
                return 0;
            } else if (i <= n / 2 && j <= n / 2) {
            } else if(i > n / 2 && j <= n / 2) {
            } else if (i <= n / 2 && j > n / 2) {
            } else if (i > n / 2 && j > n / 2) {
            }
        }

        return 0;
    }
}
