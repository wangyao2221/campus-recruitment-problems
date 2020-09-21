package vm0921.wy;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/9/21 21:27
 */
public class Main3XS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        Map<Integer, List<Integer>> vote = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            List<Integer> tmp = new ArrayList<>();
            vote.put(i + 1, tmp);
        }

        for (int i = 0; i < n; i++) {
            vote.get(a[i]).add(i + 1);
            vote.put(a[i], vote.get(a[i]));
            vote.get(b[i]).add(i + 1);
            vote.put(b[i], vote.get(b[i]));
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                List<Integer> tmp1 = new ArrayList<>();
                tmp1.addAll(vote.get(i));
                List<Integer> tmp2 = new ArrayList<>();
                tmp2.addAll(vote.get(j));
                tmp1.retainAll(tmp2);
                if (vote.get(i).size() + vote.get(j).size() - tmp1.size() >= k) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
