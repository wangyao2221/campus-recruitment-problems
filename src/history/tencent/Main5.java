package history.tencent;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(fun(x, k));
        }
    }

    public static Long fun(long x, long k) {
        long currentDeepth = deepth(x);
        if (currentDeepth <= k) {
            return Long.valueOf(-1);
        }

        long result = x;
        while (currentDeepth-- > k) {
            result /= 2;
        }

        return result;
    }
    
    public static long deepth(long x) {
        long deepth = 1;
        long tmp = 1;
        while (true) {
            if (x < tmp * 2) {
                return deepth;
            } else {
                deepth++;
                tmp = tmp * 2;
            }
        }
    }
}
