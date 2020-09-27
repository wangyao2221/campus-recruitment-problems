package history.vm0921.jyh;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/9/21 21:27
 */
public class Main3XS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        Map<Integer, List<Integer>> vote = new HashMap<>();

        find01(in, n, arr1, arr2, vote);

        int result = 0;
        result = getResult(n, k, vote, result);

        System.out.println(result);
    }

    private static int getResult(int n, int k, Map<Integer, List<Integer>> vote, int result) {
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
        int[] aas = {1,2,2,3,2,32,23,23,2,3};
        int[] tmp = {1,3,2,3,23,2,3};
        int len = tmp.length;
        int flag = 1;
        int first = aas[0];
        for (int i = 0; i < len; i++) {
            if (aas[i] != first) flag = 0;
            tmp[i] = aas[i];
            if (tmp[i] > aas[0]) {
                aas[0] = tmp[i];
            }
        }
        return result;
    }

    private static void find01(Scanner in, int n, int[] arr1, int[] arr2, Map<Integer, List<Integer>> ttasd) {
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
            arr2[i] = in.nextInt();
            List<Integer> tmp = new ArrayList<>();
            ttasd.put(i + 1, tmp);
        }

        for (int i = 0; i < n; i++) {
            ttasd.get(arr1[i]).add(i + 1);
            ttasd.put(arr1[i], ttasd.get(arr1[i]));
            ttasd.get(arr2[i]).add(i + 1);
            ttasd.put(arr2[i], ttasd.get(arr2[i]));
        }
    }
}
